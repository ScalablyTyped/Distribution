package typings.swig.swigMod

import typings.swig.swigMod.lexerNs.TYPES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swig", "lexer")
@js.native
object lexerNs extends js.Object {
  @js.native
  sealed trait TYPES extends js.Object
  
  def read(str: String): js.Array[String] = js.native
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
    
    /* 15 */ val ARRAYOPEN: typings.swig.swigMod.lexerNs.TYPES.ARRAYOPEN with Double = js.native
    /* 24 */ val ASSIGNMENT: typings.swig.swigMod.lexerNs.TYPES.ASSIGNMENT with Double = js.native
    /* 23 */ val BOOL: typings.swig.swigMod.lexerNs.TYPES.BOOL with Double = js.native
    /* 13 */ val BRACKETCLOSE: typings.swig.swigMod.lexerNs.TYPES.BRACKETCLOSE with Double = js.native
    /* 12 */ val BRACKETOPEN: typings.swig.swigMod.lexerNs.TYPES.BRACKETOPEN with Double = js.native
    /* 19 */ val COLON: typings.swig.swigMod.lexerNs.TYPES.COLON with Double = js.native
    /* 8 */ val COMMA: typings.swig.swigMod.lexerNs.TYPES.COMMA with Double = js.native
    /* 20 */ val COMPARATOR: typings.swig.swigMod.lexerNs.TYPES.COMPARATOR with Double = js.native
    /* 18 */ val CURLYCLOSE: typings.swig.swigMod.lexerNs.TYPES.CURLYCLOSE with Double = js.native
    /* 17 */ val CURLYOPEN: typings.swig.swigMod.lexerNs.TYPES.CURLYOPEN with Double = js.native
    /* 14 */ val DOTKEY: typings.swig.swigMod.lexerNs.TYPES.DOTKEY with Double = js.native
    /* 2 */ val FILTER: typings.swig.swigMod.lexerNs.TYPES.FILTER with Double = js.native
    /* 3 */ val FILTEREMPTY: typings.swig.swigMod.lexerNs.TYPES.FILTEREMPTY with Double = js.native
    /* 4 */ val FUNCTION: typings.swig.swigMod.lexerNs.TYPES.FUNCTION with Double = js.native
    /* 5 */ val FUNCTIONEMPTY: typings.swig.swigMod.lexerNs.TYPES.FUNCTIONEMPTY with Double = js.native
    /* 21 */ val LOGIC: typings.swig.swigMod.lexerNs.TYPES.LOGIC with Double = js.native
    /* 25 */ val METHODOPEN: typings.swig.swigMod.lexerNs.TYPES.METHODOPEN with Double = js.native
    /* 22 */ val NOT: typings.swig.swigMod.lexerNs.TYPES.NOT with Double = js.native
    /* 10 */ val NUMBER: typings.swig.swigMod.lexerNs.TYPES.NUMBER with Double = js.native
    /* 11 */ val OPERATOR: typings.swig.swigMod.lexerNs.TYPES.OPERATOR with Double = js.native
    /* 7 */ val PARENCLOSE: typings.swig.swigMod.lexerNs.TYPES.PARENCLOSE with Double = js.native
    /* 6 */ val PARENOPEN: typings.swig.swigMod.lexerNs.TYPES.PARENOPEN with Double = js.native
    /* 1 */ val STRING: typings.swig.swigMod.lexerNs.TYPES.STRING with Double = js.native
    /* 100 */ val UNKNOWN: typings.swig.swigMod.lexerNs.TYPES.UNKNOWN with Double = js.native
    /* 9 */ val VAR: typings.swig.swigMod.lexerNs.TYPES.VAR with Double = js.native
    /* 0 */ val WHITESPACE: typings.swig.swigMod.lexerNs.TYPES.WHITESPACE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TYPES with Double] = js.native
  }
  
}

