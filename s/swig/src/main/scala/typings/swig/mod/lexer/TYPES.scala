package typings.swig.mod.lexer

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TYPES extends js.Object
@JSImport("swig", "lexer.TYPES")
@js.native
object TYPES extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TYPES with Double] = js.native
  
  /** Start of an array */
  @js.native
  sealed trait ARRAYOPEN extends TYPES
  /* 15 */ @js.native
  object ARRAYOPEN extends TopLevel[ARRAYOPEN with Double]
  
  /** Variable assignment */
  @js.native
  sealed trait ASSIGNMENT extends TYPES
  /* 24 */ @js.native
  object ASSIGNMENT extends TopLevel[ASSIGNMENT with Double]
  
  /** true or false */
  @js.native
  sealed trait BOOL extends TYPES
  /* 23 */ @js.native
  object BOOL extends TopLevel[BOOL with Double]
  
  /** Close square bracket */
  @js.native
  sealed trait BRACKETCLOSE extends TYPES
  /* 13 */ @js.native
  object BRACKETCLOSE extends TopLevel[BRACKETCLOSE with Double]
  
  /** Open square bracket */
  @js.native
  sealed trait BRACKETOPEN extends TYPES
  /* 12 */ @js.native
  object BRACKETOPEN extends TopLevel[BRACKETOPEN with Double]
  
  /** Colon (:) */
  @js.native
  sealed trait COLON extends TYPES
  /* 19 */ @js.native
  object COLON extends TopLevel[COLON with Double]
  
  /** Comma */
  @js.native
  sealed trait COMMA extends TYPES
  /* 8 */ @js.native
  object COMMA extends TopLevel[COMMA with Double]
  
  /** JavaScript-valid comparator */
  @js.native
  sealed trait COMPARATOR extends TYPES
  /* 20 */ @js.native
  object COMPARATOR extends TopLevel[COMPARATOR with Double]
  
  /** Close curly brace */
  @js.native
  sealed trait CURLYCLOSE extends TYPES
  /* 18 */ @js.native
  object CURLYCLOSE extends TopLevel[CURLYCLOSE with Double]
  
  /** End of an array
    * Currently unused
    ARRAYCLOSE = 16, */
  /** Open curly brace */
  @js.native
  sealed trait CURLYOPEN extends TYPES
  /* 17 */ @js.native
  object CURLYOPEN extends TopLevel[CURLYOPEN with Double]
  
  /** Key on an object using dot-notation */
  @js.native
  sealed trait DOTKEY extends TYPES
  /* 14 */ @js.native
  object DOTKEY extends TopLevel[DOTKEY with Double]
  
  /** Variable filter */
  @js.native
  sealed trait FILTER extends TYPES
  /* 2 */ @js.native
  object FILTER extends TopLevel[FILTER with Double]
  
  /** Empty variable filter */
  @js.native
  sealed trait FILTEREMPTY extends TYPES
  /* 3 */ @js.native
  object FILTEREMPTY extends TopLevel[FILTEREMPTY with Double]
  
  /** Function */
  @js.native
  sealed trait FUNCTION extends TYPES
  /* 4 */ @js.native
  object FUNCTION extends TopLevel[FUNCTION with Double]
  
  /** Function with no arguments */
  @js.native
  sealed trait FUNCTIONEMPTY extends TYPES
  /* 5 */ @js.native
  object FUNCTIONEMPTY extends TopLevel[FUNCTIONEMPTY with Double]
  
  /** Boolean logic */
  @js.native
  sealed trait LOGIC extends TYPES
  /* 21 */ @js.native
  object LOGIC extends TopLevel[LOGIC with Double]
  
  /** Start of a method */
  @js.native
  sealed trait METHODOPEN extends TYPES
  /* 25 */ @js.native
  object METHODOPEN extends TopLevel[METHODOPEN with Double]
  
  /** Boolean logic "not" */
  @js.native
  sealed trait NOT extends TYPES
  /* 22 */ @js.native
  object NOT extends TopLevel[NOT with Double]
  
  /** Number */
  @js.native
  sealed trait NUMBER extends TYPES
  /* 10 */ @js.native
  object NUMBER extends TopLevel[NUMBER with Double]
  
  /** Math operator */
  @js.native
  sealed trait OPERATOR extends TYPES
  /* 11 */ @js.native
  object OPERATOR extends TopLevel[OPERATOR with Double]
  
  /** Close parenthesis */
  @js.native
  sealed trait PARENCLOSE extends TYPES
  /* 7 */ @js.native
  object PARENCLOSE extends TopLevel[PARENCLOSE with Double]
  
  /** Open parenthesis */
  @js.native
  sealed trait PARENOPEN extends TYPES
  /* 6 */ @js.native
  object PARENOPEN extends TopLevel[PARENOPEN with Double]
  
  /** Plain string */
  @js.native
  sealed trait STRING extends TYPES
  /* 1 */ @js.native
  object STRING extends TopLevel[STRING with Double]
  
  /** End of a method
    * Currently unused
    METHODEND = 26, */
  /** Unknown type */
  @js.native
  sealed trait UNKNOWN extends TYPES
  /* 100 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
  
  /** Variable */
  @js.native
  sealed trait VAR extends TYPES
  /* 9 */ @js.native
  object VAR extends TopLevel[VAR with Double]
  
  /** Whitespace */
  @js.native
  sealed trait WHITESPACE extends TYPES
  /* 0 */ @js.native
  object WHITESPACE extends TopLevel[WHITESPACE with Double]
}
