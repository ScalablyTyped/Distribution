package typings.wixStyleReact

import typings.wixStyleReact.anon.InputWrapper
import typings.wixStyleReact.distTypesDropdownLayoutDropdownLayoutDotdriverMod.DropdownLayoutDriver
import typings.wixStyleReact.distTypesInputInputDotdriverMod.InputDriver
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputWithOptionsInputWithOptionsDotdriverMod {
  
  trait InputWithOptionsDriver
    extends StObject
       with BaseDriver {
    
    var driver: InputWrapper
    
    var dropdownLayoutDriver: DropdownLayoutDriver
    
    var inputDriver: InputDriver
  }
  object InputWithOptionsDriver {
    
    inline def apply(
      driver: InputWrapper,
      dropdownLayoutDriver: DropdownLayoutDriver,
      exists: () => Boolean,
      inputDriver: InputDriver
    ): InputWithOptionsDriver = {
      val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], dropdownLayoutDriver = dropdownLayoutDriver.asInstanceOf[js.Any], exists = js.Any.fromFunction0(exists), inputDriver = inputDriver.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputWithOptionsDriver]
    }
    
    extension [Self <: InputWithOptionsDriver](x: Self) {
      
      inline def setDriver(value: InputWrapper): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setDropdownLayoutDriver(value: DropdownLayoutDriver): Self = StObject.set(x, "dropdownLayoutDriver", value.asInstanceOf[js.Any])
      
      inline def setInputDriver(value: InputDriver): Self = StObject.set(x, "inputDriver", value.asInstanceOf[js.Any])
    }
  }
}
