package typings.wixStyleReact

import typings.wixStyleReact.anon.getNumOfLabelsPromisenumb
import typings.wixStyleReact.dropdownLayoutUniDriverMod.DropdownLayoutUniDriver
import typings.wixStyleReact.inputUniDriverMod.InputUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiSelectCheckboxUniDriverMod {
  
  /* Inlined parent wix-style-react.wix-style-react/dist/es/src/common.OmitPolyfill<wix-style-react.wix-style-react/dist/es/src/InputWithOptions/InputWithOptions.uni.driver.InputWithOptionsUniDriver, 'driver'> */
  trait MultiSelectCheckboxUniDriver extends StObject {
    
    var click: js.Function0[js.Promise[Unit]]
    
    var driver: getNumOfLabelsPromisenumb
    
    var dropdownLayoutDriver: DropdownLayoutUniDriver
    
    var element: js.Function0[js.Promise[js.Any]]
    
    var exists: js.Function0[js.Promise[Boolean]]
    
    var inputDriver: InputUniDriver
  }
  object MultiSelectCheckboxUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      driver: getNumOfLabelsPromisenumb,
      dropdownLayoutDriver: DropdownLayoutUniDriver,
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      inputDriver: InputUniDriver
    ): MultiSelectCheckboxUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), driver = driver.asInstanceOf[js.Any], dropdownLayoutDriver = dropdownLayoutDriver.asInstanceOf[js.Any], element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), inputDriver = inputDriver.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiSelectCheckboxUniDriver]
    }
    
    extension [Self <: MultiSelectCheckboxUniDriver](x: Self) {
      
      inline def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setDriver(value: getNumOfLabelsPromisenumb): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setDropdownLayoutDriver(value: DropdownLayoutUniDriver): Self = StObject.set(x, "dropdownLayoutDriver", value.asInstanceOf[js.Any])
      
      inline def setElement(value: () => js.Promise[js.Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
      
      inline def setInputDriver(value: InputUniDriver): Self = StObject.set(x, "inputDriver", value.asInstanceOf[js.Any])
    }
  }
}
