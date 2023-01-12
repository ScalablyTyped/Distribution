package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceReplaceMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Input extends / * template literal string: ${inferHead}${Search}${inferTail} * / string ? Options['all'] extends true ? / * template literal string: ${Head}${Replacement}${Replace<Tail,Search,Replacement,Options>} * / string : / * template literal string: ${Head}${Replacement}${Tail} * / string : Input
    }}}
    */
  type Replace[Input /* <: String */, Search /* <: String */, Replacement /* <: String */, Options /* <: ReplaceOptions */] = Input
  
  trait ReplaceOptions extends StObject {
    
    var all: js.UndefOr[Boolean] = js.undefined
  }
  object ReplaceOptions {
    
    inline def apply(): ReplaceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplaceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReplaceOptions] (val x: Self) extends AnyVal {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    }
  }
}
