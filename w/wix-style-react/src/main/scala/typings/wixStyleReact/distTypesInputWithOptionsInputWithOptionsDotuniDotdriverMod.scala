package typings.wixStyleReact

import typings.wixStyleReact.anon.IsDisabled
import typings.wixStyleReact.distTypesDropdownLayoutDropdownLayoutDotuniDotdriverMod.DropdownLayoutUniDriver
import typings.wixStyleReact.distTypesInputInputDotuniDotdriverMod.InputUniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputWithOptionsInputWithOptionsDotuniDotdriverMod {
  
  trait InputWithOptionsUniDriver
    extends StObject
       with BaseUniDriver {
    
    var driver: IsDisabled
    
    var dropdownLayoutDriver: DropdownLayoutUniDriver
    
    var inputDriver: InputUniDriver
  }
  object InputWithOptionsUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      driver: IsDisabled,
      dropdownLayoutDriver: DropdownLayoutUniDriver,
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      inputDriver: InputUniDriver
    ): InputWithOptionsUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), driver = driver.asInstanceOf[js.Any], dropdownLayoutDriver = dropdownLayoutDriver.asInstanceOf[js.Any], element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), inputDriver = inputDriver.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputWithOptionsUniDriver]
    }
    
    extension [Self <: InputWithOptionsUniDriver](x: Self) {
      
      inline def setDriver(value: IsDisabled): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setDropdownLayoutDriver(value: DropdownLayoutUniDriver): Self = StObject.set(x, "dropdownLayoutDriver", value.asInstanceOf[js.Any])
      
      inline def setInputDriver(value: InputUniDriver): Self = StObject.set(x, "inputDriver", value.asInstanceOf[js.Any])
    }
  }
}
