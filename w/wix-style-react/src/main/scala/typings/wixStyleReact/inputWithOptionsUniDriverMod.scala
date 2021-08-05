package typings.wixStyleReact

import typings.wixStyleReact.anon.Focus
import typings.wixStyleReact.dropdownLayoutUniDriverMod.DropdownLayoutUniDriver
import typings.wixStyleReact.inputUniDriverMod.InputUniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputWithOptionsUniDriverMod {
  
  trait InputWithOptionsUniDriver
    extends StObject
       with BaseUniDriver {
    
    var driver: Focus
    
    var dropdownLayoutDriver: DropdownLayoutUniDriver
    
    var inputDriver: InputUniDriver
  }
  object InputWithOptionsUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      driver: Focus,
      dropdownLayoutDriver: DropdownLayoutUniDriver,
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      inputDriver: InputUniDriver
    ): InputWithOptionsUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), driver = driver.asInstanceOf[js.Any], dropdownLayoutDriver = dropdownLayoutDriver.asInstanceOf[js.Any], element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), inputDriver = inputDriver.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputWithOptionsUniDriver]
    }
    
    extension [Self <: InputWithOptionsUniDriver](x: Self) {
      
      inline def setDriver(value: Focus): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setDropdownLayoutDriver(value: DropdownLayoutUniDriver): Self = StObject.set(x, "dropdownLayoutDriver", value.asInstanceOf[js.Any])
      
      inline def setInputDriver(value: InputUniDriver): Self = StObject.set(x, "inputDriver", value.asInstanceOf[js.Any])
    }
  }
}
