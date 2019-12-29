package typings.swig.swigMod.lexer

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TYPES extends js.Object

@JSImport("swig", "lexer.TYPES")
@js.native
object TYPES extends js.Object {
  /** Start of an array */
  @js.native
  sealed trait ARRAYOPEN extends TYPES
  
  /** Variable assignment */
  @js.native
  sealed trait ASSIGNMENT extends TYPES
  
  /** true or false */
  @js.native
  sealed trait BOOL extends TYPES
  
  /** Close square bracket */
  @js.native
  sealed trait BRACKETCLOSE extends TYPES
  
  /** Open square bracket */
  @js.native
  sealed trait BRACKETOPEN extends TYPES
  
  /** Colon (:) */
  @js.native
  sealed trait COLON extends TYPES
  
  /** Comma */
  @js.native
  sealed trait COMMA extends TYPES
  
  /** JavaScript-valid comparator */
  @js.native
  sealed trait COMPARATOR extends TYPES
  
  /** Close curly brace */
  @js.native
  sealed trait CURLYCLOSE extends TYPES
  
  /** End of an array
    * Currently unused
    ARRAYCLOSE = 16, */
  /** Open curly brace */
  @js.native
  sealed trait CURLYOPEN extends TYPES
  
  /** Key on an object using dot-notation */
  @js.native
  sealed trait DOTKEY extends TYPES
  
  /** Variable filter */
  @js.native
  sealed trait FILTER extends TYPES
  
  /** Empty variable filter */
  @js.native
  sealed trait FILTEREMPTY extends TYPES
  
  /** Function */
  @js.native
  sealed trait FUNCTION extends TYPES
  
  /** Function with no arguments */
  @js.native
  sealed trait FUNCTIONEMPTY extends TYPES
  
  /** Boolean logic */
  @js.native
  sealed trait LOGIC extends TYPES
  
  /** Start of a method */
  @js.native
  sealed trait METHODOPEN extends TYPES
  
  /** Boolean logic "not" */
  @js.native
  sealed trait NOT extends TYPES
  
  /** Number */
  @js.native
  sealed trait NUMBER extends TYPES
  
  /** Math operator */
  @js.native
  sealed trait OPERATOR extends TYPES
  
  /** Close parenthesis */
  @js.native
  sealed trait PARENCLOSE extends TYPES
  
  /** Open parenthesis */
  @js.native
  sealed trait PARENOPEN extends TYPES
  
  /** Plain string */
  @js.native
  sealed trait STRING extends TYPES
  
  /** End of a method
    * Currently unused
    METHODEND = 26, */
  /** Unknown type */
  @js.native
  sealed trait UNKNOWN extends TYPES
  
  /** Variable */
  @js.native
  sealed trait VAR extends TYPES
  
  /** Whitespace */
  @js.native
  sealed trait WHITESPACE extends TYPES
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TYPES with Double] = js.native
  /* 15 */ @js.native
  object ARRAYOPEN extends TopLevel[ARRAYOPEN with Double]
  
  /* 24 */ @js.native
  object ASSIGNMENT extends TopLevel[ASSIGNMENT with Double]
  
  /* 23 */ @js.native
  object BOOL extends TopLevel[BOOL with Double]
  
  /* 13 */ @js.native
  object BRACKETCLOSE extends TopLevel[BRACKETCLOSE with Double]
  
  /* 12 */ @js.native
  object BRACKETOPEN extends TopLevel[BRACKETOPEN with Double]
  
  /* 19 */ @js.native
  object COLON extends TopLevel[COLON with Double]
  
  /* 8 */ @js.native
  object COMMA extends TopLevel[COMMA with Double]
  
  /* 20 */ @js.native
  object COMPARATOR extends TopLevel[COMPARATOR with Double]
  
  /* 18 */ @js.native
  object CURLYCLOSE extends TopLevel[CURLYCLOSE with Double]
  
  /* 17 */ @js.native
  object CURLYOPEN extends TopLevel[CURLYOPEN with Double]
  
  /* 14 */ @js.native
  object DOTKEY extends TopLevel[DOTKEY with Double]
  
  /* 2 */ @js.native
  object FILTER extends TopLevel[FILTER with Double]
  
  /* 3 */ @js.native
  object FILTEREMPTY extends TopLevel[FILTEREMPTY with Double]
  
  /* 4 */ @js.native
  object FUNCTION extends TopLevel[FUNCTION with Double]
  
  /* 5 */ @js.native
  object FUNCTIONEMPTY extends TopLevel[FUNCTIONEMPTY with Double]
  
  /* 21 */ @js.native
  object LOGIC extends TopLevel[LOGIC with Double]
  
  /* 25 */ @js.native
  object METHODOPEN extends TopLevel[METHODOPEN with Double]
  
  /* 22 */ @js.native
  object NOT extends TopLevel[NOT with Double]
  
  /* 10 */ @js.native
  object NUMBER extends TopLevel[NUMBER with Double]
  
  /* 11 */ @js.native
  object OPERATOR extends TopLevel[OPERATOR with Double]
  
  /* 7 */ @js.native
  object PARENCLOSE extends TopLevel[PARENCLOSE with Double]
  
  /* 6 */ @js.native
  object PARENOPEN extends TopLevel[PARENOPEN with Double]
  
  /* 1 */ @js.native
  object STRING extends TopLevel[STRING with Double]
  
  /* 100 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
  
  /* 9 */ @js.native
  object VAR extends TopLevel[VAR with Double]
  
  /* 0 */ @js.native
  object WHITESPACE extends TopLevel[WHITESPACE with Double]
  
}

