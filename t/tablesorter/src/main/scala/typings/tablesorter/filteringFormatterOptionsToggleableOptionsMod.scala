package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringFormatterOptionsToggleableOptionsMod {
  
  trait ToggleableOptions extends StObject {
    
    /**
      * A value indicating whether to add a box for enabling/disabling the control.
      */
    var addToggle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether the control is initially disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object ToggleableOptions {
    
    inline def apply(): ToggleableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToggleableOptions] (val x: Self) extends AnyVal {
      
      inline def setAddToggle(value: Boolean): Self = StObject.set(x, "addToggle", value.asInstanceOf[js.Any])
      
      inline def setAddToggleUndefined: Self = StObject.set(x, "addToggle", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
}
