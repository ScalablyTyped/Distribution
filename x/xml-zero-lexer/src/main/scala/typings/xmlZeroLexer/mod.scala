package typings.xmlZeroLexer

import typings.xmlZeroLexer.mod.Lexx.Options
import typings.xmlZeroLexer.mod.Lexx.Token
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
import typings.xmlZeroLexer.xmlZeroLexerStrings.ATTRIBUTE_NODE
import typings.xmlZeroLexer.xmlZeroLexerStrings.CDATA_SECTION_NODE
import typings.xmlZeroLexer.xmlZeroLexerStrings.CLOSE_ELEMENT
import typings.xmlZeroLexer.xmlZeroLexerStrings.COMMENT_NODE
import typings.xmlZeroLexer.xmlZeroLexerStrings.DOCUMENT_FRAGMENT_NODE
import typings.xmlZeroLexer.xmlZeroLexerStrings.DOCUMENT_NODE
import typings.xmlZeroLexer.xmlZeroLexerStrings.DOCUMENT_TYPE_NODE
import typings.xmlZeroLexer.xmlZeroLexerStrings.ELEMENT_NODE
import typings.xmlZeroLexer.xmlZeroLexerStrings.ENTITY_NODE
import typings.xmlZeroLexer.xmlZeroLexerStrings.ENTITY_REFERENCE_NODE
import typings.xmlZeroLexer.xmlZeroLexerStrings.JSX
import typings.xmlZeroLexer.xmlZeroLexerStrings.JSX_ATTRIBUTE
import typings.xmlZeroLexer.xmlZeroLexerStrings.NOTATION_NODE
import typings.xmlZeroLexer.xmlZeroLexerStrings.PROCESSING_INSTRUCTION_NODE
import typings.xmlZeroLexer.xmlZeroLexerStrings.TEXT_NODE
import typings.xmlZeroLexer.xmlZeroLexerStrings.XML_DECLARATION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("xml-zero-lexer", JSImport.Default)
    @js.native
    def apply(xml: String): js.Array[Token] = js.native
    @JSImport("xml-zero-lexer", JSImport.Default)
    @js.native
    def apply(xml: String, options: Options): js.Array[Token] = js.native
  }
  
  @JSImport("xml-zero-lexer", "NodeTypeKeys")
  @js.native
  val NodeTypeKeys: js.Tuple16[
    XML_DECLARATION, 
    ELEMENT_NODE, 
    ATTRIBUTE_NODE, 
    TEXT_NODE, 
    CDATA_SECTION_NODE, 
    ENTITY_REFERENCE_NODE, 
    ENTITY_NODE, 
    PROCESSING_INSTRUCTION_NODE, 
    COMMENT_NODE, 
    DOCUMENT_NODE, 
    DOCUMENT_TYPE_NODE, 
    DOCUMENT_FRAGMENT_NODE, 
    NOTATION_NODE, 
    CLOSE_ELEMENT, 
    JSX_ATTRIBUTE, 
    JSX
  ] = js.native
  
  object NodeTypes {
    
    @JSImport("xml-zero-lexer", "NodeTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("xml-zero-lexer", "NodeTypes.ATTRIBUTE_NODE")
    @js.native
    def ATTRIBUTE_NODE: `2` = js.native
    @scala.inline
    def ATTRIBUTE_NODE_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NODE")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-zero-lexer", "NodeTypes.CDATA_SECTION_NODE")
    @js.native
    def CDATA_SECTION_NODE: `4` = js.native
    @scala.inline
    def CDATA_SECTION_NODE_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CDATA_SECTION_NODE")(x.asInstanceOf[js.Any])
    
    /**
      * unofficial
      */
    @JSImport("xml-zero-lexer", "NodeTypes.CLOSE_ELEMENT")
    @js.native
    def CLOSE_ELEMENT: `13` = js.native
    @scala.inline
    def CLOSE_ELEMENT_=(x: `13`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_ELEMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-zero-lexer", "NodeTypes.COMMENT_NODE")
    @js.native
    def COMMENT_NODE: `8` = js.native
    @scala.inline
    def COMMENT_NODE_=(x: `8`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMMENT_NODE")(x.asInstanceOf[js.Any])
    
    /**
      * Don't support this either
      */
    @JSImport("xml-zero-lexer", "NodeTypes.DOCUMENT_FRAGMENT_NODE")
    @js.native
    def DOCUMENT_FRAGMENT_NODE: `11` = js.native
    @scala.inline
    def DOCUMENT_FRAGMENT_NODE_=(x: `11`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_FRAGMENT_NODE")(x.asInstanceOf[js.Any])
    
    /**
      * Not used. Root elements are just elements.
      */
    @JSImport("xml-zero-lexer", "NodeTypes.DOCUMENT_NODE")
    @js.native
    def DOCUMENT_NODE: `9` = js.native
    @scala.inline
    def DOCUMENT_NODE_=(x: `9`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_NODE")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-zero-lexer", "NodeTypes.DOCUMENT_TYPE_NODE")
    @js.native
    def DOCUMENT_TYPE_NODE: `10` = js.native
    @scala.inline
    def DOCUMENT_TYPE_NODE_=(x: `10`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_TYPE_NODE")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-zero-lexer", "NodeTypes.ELEMENT_NODE")
    @js.native
    def ELEMENT_NODE: `1` = js.native
    @scala.inline
    def ELEMENT_NODE_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ELEMENT_NODE")(x.asInstanceOf[js.Any])
    
    /**
      * Only supported as <!ENTITY ...> outside of <!DOCTYPE ...>
      * E.g. <!DOCTYPE [ <!ENTITY> ]> will just be a string inside DOCTYPE and not an ENTITY_NODE.
      */
    @JSImport("xml-zero-lexer", "NodeTypes.ENTITY_NODE")
    @js.native
    def ENTITY_NODE: `6` = js.native
    @scala.inline
    def ENTITY_NODE_=(x: `6`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTITY_NODE")(x.asInstanceOf[js.Any])
    
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
    @JSImport("xml-zero-lexer", "NodeTypes.ENTITY_REFERENCE_NODE")
    @js.native
    def ENTITY_REFERENCE_NODE: `5` = js.native
    @scala.inline
    def ENTITY_REFERENCE_NODE_=(x: `5`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTITY_REFERENCE_NODE")(x.asInstanceOf[js.Any])
    
    /**
      * unofficial
      */
    @JSImport("xml-zero-lexer", "NodeTypes.JSX")
    @js.native
    def JSX: `15` = js.native
    @scala.inline
    def JSX_=(x: `15`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSX")(x.asInstanceOf[js.Any])
    
    /**
      * unofficial
      */
    @JSImport("xml-zero-lexer", "NodeTypes.JSX_ATTRIBUTE")
    @js.native
    def JSX_ATTRIBUTE: `14` = js.native
    @scala.inline
    def JSX_ATTRIBUTE_=(x: `14`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSX_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-zero-lexer", "NodeTypes.NOTATION_NODE")
    @js.native
    def NOTATION_NODE: `12` = js.native
    @scala.inline
    def NOTATION_NODE_=(x: `12`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOTATION_NODE")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-zero-lexer", "NodeTypes.PROCESSING_INSTRUCTION_NODE")
    @js.native
    def PROCESSING_INSTRUCTION_NODE: `7` = js.native
    @scala.inline
    def PROCESSING_INSTRUCTION_NODE_=(x: `7`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESSING_INSTRUCTION_NODE")(x.asInstanceOf[js.Any])
    
    /**
      * Note that these can include entities which should be resolved before display
      */
    @JSImport("xml-zero-lexer", "NodeTypes.TEXT_NODE")
    @js.native
    def TEXT_NODE: `3` = js.native
    @scala.inline
    def TEXT_NODE_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_NODE")(x.asInstanceOf[js.Any])
    
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
    @JSImport("xml-zero-lexer", "NodeTypes.XML_DECLARATION")
    @js.native
    def XML_DECLARATION: `0` = js.native
    @scala.inline
    def XML_DECLARATION_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XML_DECLARATION")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("xml-zero-lexer", "onAttribute")
  @js.native
  def onAttribute(xml: String, i: Double, inElement: Boolean): js.Tuple3[Double, Boolean, Token] = js.native
  
  @JSImport("xml-zero-lexer", "onBlackhole")
  @js.native
  def onBlackhole(xml: String, i: Double, inElement: Boolean, untilToken: Token): js.Tuple3[Double, Boolean, Token] = js.native
  
  @JSImport("xml-zero-lexer", "onClose")
  @js.native
  def onClose(xml: String, i: Double, inElement: Boolean): js.Tuple3[Double, Boolean, Token] = js.native
  
  @JSImport("xml-zero-lexer", "onElement")
  @js.native
  def onElement(xml: String, i: Double, inElement: Boolean): js.Tuple3[Double, Boolean, Token] = js.native
  
  @JSImport("xml-zero-lexer", "onEndTag")
  @js.native
  def onEndTag(xml: String, i: Double): js.Tuple2[Double, Boolean] = js.native
  
  @JSImport("xml-zero-lexer", "onExclamation")
  @js.native
  def onExclamation(xml: String, i: Double, inElement: Boolean): js.Tuple3[Double, Boolean, Token] = js.native
  
  @JSImport("xml-zero-lexer", "onQuestionElement")
  @js.native
  def onQuestionElement(xml: String, i: Double, inElement: Boolean): js.Tuple3[Double, Boolean, Token] = js.native
  
  @JSImport("xml-zero-lexer", "onShorthandCDATA")
  @js.native
  def onShorthandCDATA(xml: String, i: Double, inElement: Boolean): js.Tuple3[Double, Boolean, Token] = js.native
  
  @JSImport("xml-zero-lexer", "onText")
  @js.native
  def onText(xml: String, i: Double): js.Tuple3[Double, Boolean, Token] = js.native
  @JSImport("xml-zero-lexer", "onText")
  @js.native
  def onText(xml: String, i: Double, jsx: Boolean): js.Tuple3[Double, Boolean, Token] = js.native
  
  object Lexx {
    
    @js.native
    trait Options extends StObject {
      
      /**
        * @default ["script", "style"]
        */
      var blackholes: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * @default false
        */
      var html: js.UndefOr[Boolean] = js.native
      
      /**
        * @default false
        */
      var jsx: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlackholes(value: js.Array[String]): Self = StObject.set(x, "blackholes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlackholesUndefined: Self = StObject.set(x, "blackholes", js.undefined)
        
        @scala.inline
        def setBlackholesVarargs(value: String*): Self = StObject.set(x, "blackholes", js.Array(value :_*))
        
        @scala.inline
        def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
        
        @scala.inline
        def setJsx(value: Boolean): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      }
    }
    
    /**
      * @example
      * [NodeTypes.ELEMENT_NODE, 1, 2]
      * [NodeTypes.TEXT_NODE, 3, 20]
      * [NodeTypes.CLOSE_ELEMENT]
      */
    type Token = js.Array[Double]
  }
}
