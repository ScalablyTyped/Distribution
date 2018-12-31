package typings
package swigLib.swigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swig", "lexer")
@js.native
object lexerNs extends js.Object {
  @js.native
  sealed trait TYPES extends js.Object
  
  def read(str: java.lang.String): js.Array[java.lang.String] = js.native
  @js.native
  object TYPES extends js.Object {
    /** Start of an array */
    @js.native
    sealed trait ARRAYOPEN
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Variable assignment */
    @js.native
    sealed trait ASSIGNMENT
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** true or false */
    @js.native
    sealed trait BOOL
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Close square bracket */
    @js.native
    sealed trait BRACKETCLOSE
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Open square bracket */
    @js.native
    sealed trait BRACKETOPEN
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Colon (:) */
    @js.native
    sealed trait COLON
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Comma */
    @js.native
    sealed trait COMMA
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** JavaScript-valid comparator */
    @js.native
    sealed trait COMPARATOR
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Close curly brace */
    @js.native
    sealed trait CURLYCLOSE
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** End of an array
      * Currently unused
      ARRAYCLOSE = 16, */
    /** Open curly brace */
    @js.native
    sealed trait CURLYOPEN
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Key on an object using dot-notation */
    @js.native
    sealed trait DOTKEY
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Variable filter */
    @js.native
    sealed trait FILTER
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Empty variable filter */
    @js.native
    sealed trait FILTEREMPTY
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Function */
    @js.native
    sealed trait FUNCTION
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Function with no arguments */
    @js.native
    sealed trait FUNCTIONEMPTY
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Boolean logic */
    @js.native
    sealed trait LOGIC
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Start of a method */
    @js.native
    sealed trait METHODOPEN
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Boolean logic "not" */
    @js.native
    sealed trait NOT
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Number */
    @js.native
    sealed trait NUMBER
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Math operator */
    @js.native
    sealed trait OPERATOR
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Close parenthesis */
    @js.native
    sealed trait PARENCLOSE
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Open parenthesis */
    @js.native
    sealed trait PARENOPEN
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Plain string */
    @js.native
    sealed trait STRING
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** End of a method
      * Currently unused
      METHODEND = 26, */
    /** Unknown type */
    @js.native
    sealed trait UNKNOWN
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Variable */
    @js.native
    sealed trait VAR
      extends swigLib.swigMod.lexerNs.TYPES
    
    /** Whitespace */
    @js.native
    sealed trait WHITESPACE
      extends swigLib.swigMod.lexerNs.TYPES
    
    /* 15 */ val ARRAYOPEN: ARRAYOPEN with scala.Double = js.native
    /* 24 */ val ASSIGNMENT: ASSIGNMENT with scala.Double = js.native
    /* 23 */ val BOOL: BOOL with scala.Double = js.native
    /* 13 */ val BRACKETCLOSE: BRACKETCLOSE with scala.Double = js.native
    /* 12 */ val BRACKETOPEN: BRACKETOPEN with scala.Double = js.native
    /* 19 */ val COLON: COLON with scala.Double = js.native
    /* 8 */ val COMMA: COMMA with scala.Double = js.native
    /* 20 */ val COMPARATOR: COMPARATOR with scala.Double = js.native
    /* 18 */ val CURLYCLOSE: CURLYCLOSE with scala.Double = js.native
    /* 17 */ val CURLYOPEN: CURLYOPEN with scala.Double = js.native
    /* 14 */ val DOTKEY: DOTKEY with scala.Double = js.native
    /* 2 */ val FILTER: FILTER with scala.Double = js.native
    /* 3 */ val FILTEREMPTY: FILTEREMPTY with scala.Double = js.native
    /* 4 */ val FUNCTION: FUNCTION with scala.Double = js.native
    /* 5 */ val FUNCTIONEMPTY: FUNCTIONEMPTY with scala.Double = js.native
    /* 21 */ val LOGIC: LOGIC with scala.Double = js.native
    /* 25 */ val METHODOPEN: METHODOPEN with scala.Double = js.native
    /* 22 */ val NOT: NOT with scala.Double = js.native
    /* 10 */ val NUMBER: NUMBER with scala.Double = js.native
    /* 11 */ val OPERATOR: OPERATOR with scala.Double = js.native
    /* 7 */ val PARENCLOSE: PARENCLOSE with scala.Double = js.native
    /* 6 */ val PARENOPEN: PARENOPEN with scala.Double = js.native
    /* 1 */ val STRING: STRING with scala.Double = js.native
    /* 100 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
    /* 9 */ val VAR: VAR with scala.Double = js.native
    /* 0 */ val WHITESPACE: WHITESPACE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[swigLib.swigMod.lexerNs.TYPES with scala.Double] = js.native
  }
  
}

