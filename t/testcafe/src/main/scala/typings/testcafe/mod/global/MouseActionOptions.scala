package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseActionOptions
  extends StObject
     with OffsetOptions {
  
  /**
    * Indicate which modifier keys are to be pressed during the mouse action.
    */
  var modifiers: js.UndefOr[KeyModifiers] = js.undefined
}
object MouseActionOptions {
  
  inline def apply(): MouseActionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseActionOptions]
  }
  
  extension [Self <: MouseActionOptions](x: Self) {
    
    inline def setModifiers(value: KeyModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
  }
}
