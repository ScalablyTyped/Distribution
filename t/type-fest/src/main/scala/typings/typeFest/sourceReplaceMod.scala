package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceReplaceMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Input extends / * template literal string: ${inferHead}${Search}${inferTail} * / string ? Options['all'] extends true ? / * template literal string: ${Head}${Replacement}${Replace<Tail,Search,Replacement,Options>} * / string : / * template literal string: ${Head}${Replacement}${Tail} * / string : Input
    }}}
    */
  @js.native
  trait Replace[Input /* <: String */, Search /* <: String */, Replacement /* <: String */, Options /* <: ReplaceOptions */] extends StObject
  
  trait ReplaceOptions extends StObject {
    
    var all: js.UndefOr[Boolean] = js.undefined
  }
  object ReplaceOptions {
    
    inline def apply(): ReplaceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplaceOptions]
    }
    
    extension [Self <: ReplaceOptions](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    }
  }
}
