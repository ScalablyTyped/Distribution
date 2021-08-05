package typings.wixStyleReact

import typings.wixStyleReact.anon.Blur
import typings.wixStyleReact.anon.ClickOnInputWrapper
import typings.wixStyleReact.dropdownLayoutDriverMod.DropdownLayoutDriver
import typings.wixStyleReact.inputDriverMod.InputDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiSelectDriverMod {
  
  /* Inlined parent wix-style-react.wix-style-react/dist/es/src/common.OmitPolyfill<wix-style-react.wix-style-react/dist/es/src/InputWithOptions/InputWithOptions.driver.InputWithOptionsDriver, 'driver'> */
  trait MultiSelectDriver extends StObject {
    
    var driver: Blur & ClickOnInputWrapper
    
    var dropdownLayoutDriver: DropdownLayoutDriver
    
    var exists: js.Function0[Boolean]
    
    var inputDriver: InputDriver
  }
  object MultiSelectDriver {
    
    inline def apply(
      driver: Blur & ClickOnInputWrapper,
      dropdownLayoutDriver: DropdownLayoutDriver,
      exists: () => Boolean,
      inputDriver: InputDriver
    ): MultiSelectDriver = {
      val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], dropdownLayoutDriver = dropdownLayoutDriver.asInstanceOf[js.Any], exists = js.Any.fromFunction0(exists), inputDriver = inputDriver.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiSelectDriver]
    }
    
    extension [Self <: MultiSelectDriver](x: Self) {
      
      inline def setDriver(value: Blur & ClickOnInputWrapper): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setDropdownLayoutDriver(value: DropdownLayoutDriver): Self = StObject.set(x, "dropdownLayoutDriver", value.asInstanceOf[js.Any])
      
      inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
      
      inline def setInputDriver(value: InputDriver): Self = StObject.set(x, "inputDriver", value.asInstanceOf[js.Any])
    }
  }
}
