package typings.wixStyleReact

import typings.wixStyleReact.anon.getNumOfLabelsnumbergetLa
import typings.wixStyleReact.dropdownLayoutDriverMod.DropdownLayoutDriver
import typings.wixStyleReact.inputDriverMod.InputDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiSelectCheckboxDriverMod {
  
  /* Inlined parent wix-style-react.wix-style-react/dist/es/src/common.OmitPolyfill<wix-style-react.wix-style-react/dist/es/src/InputWithOptions/InputWithOptions.driver.InputWithOptionsDriver, 'driver'> */
  trait MultiSelectCheckboxDriver extends StObject {
    
    var driver: getNumOfLabelsnumbergetLa
    
    var dropdownLayoutDriver: DropdownLayoutDriver
    
    var exists: js.Function0[Boolean]
    
    var inputDriver: InputDriver
  }
  object MultiSelectCheckboxDriver {
    
    @scala.inline
    def apply(
      driver: getNumOfLabelsnumbergetLa,
      dropdownLayoutDriver: DropdownLayoutDriver,
      exists: () => Boolean,
      inputDriver: InputDriver
    ): MultiSelectCheckboxDriver = {
      val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], dropdownLayoutDriver = dropdownLayoutDriver.asInstanceOf[js.Any], exists = js.Any.fromFunction0(exists), inputDriver = inputDriver.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiSelectCheckboxDriver]
    }
    
    @scala.inline
    implicit class MultiSelectCheckboxDriverMutableBuilder[Self <: MultiSelectCheckboxDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDriver(value: getNumOfLabelsnumbergetLa): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownLayoutDriver(value: DropdownLayoutDriver): Self = StObject.set(x, "dropdownLayoutDriver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInputDriver(value: InputDriver): Self = StObject.set(x, "inputDriver", value.asInstanceOf[js.Any])
    }
  }
}
