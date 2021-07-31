package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleableOptionsMod {
  
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
    
    @scala.inline
    def apply(): ToggleableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleableOptions]
    }
    
    @scala.inline
    implicit class ToggleableOptionsMutableBuilder[Self <: ToggleableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddToggle(value: Boolean): Self = StObject.set(x, "addToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddToggleUndefined: Self = StObject.set(x, "addToggle", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
}
