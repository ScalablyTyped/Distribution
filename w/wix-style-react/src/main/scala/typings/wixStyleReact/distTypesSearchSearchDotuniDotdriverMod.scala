package typings.wixStyleReact

import typings.wixStyleReact.anon.IsEditable
import typings.wixStyleReact.anon.IsExpandable
import typings.wixStyleReact.distTypesDropdownLayoutDropdownLayoutDotuniDotdriverMod.DropdownLayoutUniDriver
import typings.wixStyleReact.distTypesInputInputDotuniDotdriverMod.InputUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSearchSearchDotuniDotdriverMod {
  
  /* Inlined parent wix-style-react.wix-style-react/dist/types/common.OmitPolyfill<wix-style-react.wix-style-react/dist/types/InputWithOptions/InputWithOptions.uni.driver.InputWithOptionsUniDriver, 'driver'> */
  trait SearchUniDriver extends StObject {
    
    var click: js.Function0[js.Promise[Unit]]
    
    var driver: IsEditable & IsExpandable
    
    var dropdownLayoutDriver: DropdownLayoutUniDriver
    
    var element: js.Function0[js.Promise[Any]]
    
    var exists: js.Function0[js.Promise[Boolean]]
    
    var inputDriver: InputUniDriver
  }
  object SearchUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      driver: IsEditable & IsExpandable,
      dropdownLayoutDriver: DropdownLayoutUniDriver,
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      inputDriver: InputUniDriver
    ): SearchUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), driver = driver.asInstanceOf[js.Any], dropdownLayoutDriver = dropdownLayoutDriver.asInstanceOf[js.Any], element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), inputDriver = inputDriver.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchUniDriver]
    }
    
    extension [Self <: SearchUniDriver](x: Self) {
      
      inline def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setDriver(value: IsEditable & IsExpandable): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setDropdownLayoutDriver(value: DropdownLayoutUniDriver): Self = StObject.set(x, "dropdownLayoutDriver", value.asInstanceOf[js.Any])
      
      inline def setElement(value: () => js.Promise[Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
      
      inline def setInputDriver(value: InputUniDriver): Self = StObject.set(x, "inputDriver", value.asInstanceOf[js.Any])
    }
  }
}
