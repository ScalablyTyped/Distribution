package typings.xmlZeroLexer.mod

import typings.xmlZeroLexer.xmlZeroLexerNumbers.`0`
import typings.xmlZeroLexer.xmlZeroLexerNumbers.`10`
import typings.xmlZeroLexer.xmlZeroLexerNumbers.`11`
import typings.xmlZeroLexer.xmlZeroLexerNumbers.`12`
import typings.xmlZeroLexer.xmlZeroLexerNumbers.`13`
import typings.xmlZeroLexer.xmlZeroLexerNumbers.`14`
import typings.xmlZeroLexer.xmlZeroLexerNumbers.`15`
import typings.xmlZeroLexer.xmlZeroLexerNumbers.`1`
import typings.xmlZeroLexer.xmlZeroLexerNumbers.`2`
import typings.xmlZeroLexer.xmlZeroLexerNumbers.`3`
import typings.xmlZeroLexer.xmlZeroLexerNumbers.`4`
import typings.xmlZeroLexer.xmlZeroLexerNumbers.`5`
import typings.xmlZeroLexer.xmlZeroLexerNumbers.`6`
import typings.xmlZeroLexer.xmlZeroLexerNumbers.`7`
import typings.xmlZeroLexer.xmlZeroLexerNumbers.`8`
import typings.xmlZeroLexer.xmlZeroLexerNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xml-zero-lexer", "NodeTypes")
@js.native
object NodeTypes extends js.Object {
  
  var ATTRIBUTE_NODE: `2` = js.native
  
  var CDATA_SECTION_NODE: `4` = js.native
  
  /**
    * unofficial
    */
  var CLOSE_ELEMENT: `13` = js.native
  
  var COMMENT_NODE: `8` = js.native
  
  /**
    * Don't support this either
    */
  var DOCUMENT_FRAGMENT_NODE: `11` = js.native
  
  /**
    * Not used. Root elements are just elements.
    */
  var DOCUMENT_NODE: `9` = js.native
  
  var DOCUMENT_TYPE_NODE: `10` = js.native
  
  var ELEMENT_NODE: `1` = js.native
  
  /**
    * Only supported as <!ENTITY ...> outside of <!DOCTYPE ...>
    * E.g. <!DOCTYPE [ <!ENTITY> ]> will just be a string inside DOCTYPE and not an ENTITY_NODE.
    */
  var ENTITY_NODE: `6` = js.native
  
  /**
    * Not used
    *
    * After a lot of thought I've decided that entities shouldn't be resolved in the Lexer,
    *
    * Instead entities are just ignored and are stored as-is as part of the node because:
    * (1) We only support entities that resolve to characters, we don't support crufty
    *     complicated entities that insert elements, so there's no actual structural need to
    *     do it.
    * (2) It simplifies the code and data structures, and it shrinks data structure memory usage.
    *     E.g. Text doesn't need to switch between TEXT_NODE and ENTITY_REFERENCE_NODE.
    * (3) They can be resolved later using a utility function. E.g. have a .textContent() on
    *     nodes that resolves it. This approach would probably result in less memory use.
    * (4) It's slightly against style of zero-copy because we'd need to make new strings
    *     to resolve the entities. Not a difficult job but again it's unnecessary memory use.
    *
    * So I've decided that's not the job of this lexer.
    */
  var ENTITY_REFERENCE_NODE: `5` = js.native
  
  /**
    * unofficial
    */
  var JSX: `15` = js.native
  
  /**
    * unofficial
    */
  var JSX_ATTRIBUTE: `14` = js.native
  
  var NOTATION_NODE: `12` = js.native
  
  var PROCESSING_INSTRUCTION_NODE: `7` = js.native
  
  /**
    * Note that these can include entities which should be resolved before display
    */
  var TEXT_NODE: `3` = js.native
  
  /**
    * unofficial
    *
    * Most XML parsers ignore this but because I'm parsing it I may as well include it.
    * At least it lets you know if there were multiple declarations.
    *
    * Also inserting it here makes Object.keys(NodeTypes) array indexes line up with values!
    * E.g. Object.keys(NodeTypes)[0] === NodeTypes.XML_DECLARATION
    * (Strictly speaking map keys are unordered but in practice they are, and we don't rely on it)
    */
  var XML_DECLARATION: `0` = js.native
}
