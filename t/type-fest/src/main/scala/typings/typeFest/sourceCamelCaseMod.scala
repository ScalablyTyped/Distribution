package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCamelCaseMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Type extends string ? string extends Type ? Type : std.Uncapitalize<type-fest.type-fest/source/camel-case.CamelCaseFromArray<type-fest.type-fest/source/split-words.SplitWords<Type extends std.Uppercase<Type> ? std.Lowercase<Type> : Type, '', ''>, Options, ''>> : Type
    }}}
    */
  type CamelCase[Type, Options /* <: CamelCaseOptions */] = Type
  
  /**
  Convert an array of words to camel-case.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Words extends [infer FirstWord, ...infer RemainingWords] ? Options['preserveConsecutiveUppercase'] extends true ? / * template literal string: ${Capitalize<FirstWord>}${CamelCaseFromArray<RemainingWords,Options>} * / string : / * template literal string: ${Capitalize<Lowercase<FirstWord>>}${CamelCaseFromArray<RemainingWords,Options>} * / string : OutputString
    }}}
    */
  type CamelCaseFromArray[Words /* <: js.Array[String] */, Options /* <: CamelCaseOptions */, OutputString /* <: String */] = OutputString
  
  trait CamelCaseOptions extends StObject {
    
    /**
    	Whether to preserved consecutive uppercase letter.
    	@default true
    	*/
    var preserveConsecutiveUppercase: js.UndefOr[Boolean] = js.undefined
  }
  object CamelCaseOptions {
    
    inline def apply(): CamelCaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CamelCaseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CamelCaseOptions] (val x: Self) extends AnyVal {
      
      inline def setPreserveConsecutiveUppercase(value: Boolean): Self = StObject.set(x, "preserveConsecutiveUppercase", value.asInstanceOf[js.Any])
      
      inline def setPreserveConsecutiveUppercaseUndefined: Self = StObject.set(x, "preserveConsecutiveUppercase", js.undefined)
    }
  }
}
