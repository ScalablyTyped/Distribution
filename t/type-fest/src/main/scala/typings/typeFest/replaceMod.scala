package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replaceMod {
  
  type Replace[Input /* <: String */, Search /* <: String */, Replacement /* <: String */, Options /* <: ReplaceOptions */] = Input | (/* template literal string: ${Head}${Replacement}${Tail} */ String)
  
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
