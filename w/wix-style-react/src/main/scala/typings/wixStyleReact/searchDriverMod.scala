package typings.wixStyleReact

import typings.wixStyleReact.anon.Blur
import typings.wixStyleReact.anon.IsCollapsed
import typings.wixStyleReact.dropdownLayoutDriverMod.DropdownLayoutDriver
import typings.wixStyleReact.inputDriverMod.InputDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchDriverMod {
  
  /* Inlined parent wix-style-react.wix-style-react/dist/es/src/common.OmitPolyfill<wix-style-react.wix-style-react/dist/es/src/InputWithOptions/InputWithOptions.driver.InputWithOptionsDriver, 'driver'> */
  trait SearchDriver extends StObject {
    
    var driver: Blur & IsCollapsed
    
    var dropdownLayoutDriver: DropdownLayoutDriver
    
    var exists: js.Function0[Boolean]
    
    var inputDriver: InputDriver
  }
  object SearchDriver {
    
    @scala.inline
    def apply(
      driver: Blur & IsCollapsed,
      dropdownLayoutDriver: DropdownLayoutDriver,
      exists: () => Boolean,
      inputDriver: InputDriver
    ): SearchDriver = {
      val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], dropdownLayoutDriver = dropdownLayoutDriver.asInstanceOf[js.Any], exists = js.Any.fromFunction0(exists), inputDriver = inputDriver.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchDriver]
    }
    
    @scala.inline
    implicit class SearchDriverMutableBuilder[Self <: SearchDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDriver(value: Blur & IsCollapsed): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownLayoutDriver(value: DropdownLayoutDriver): Self = StObject.set(x, "dropdownLayoutDriver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInputDriver(value: InputDriver): Self = StObject.set(x, "inputDriver", value.asInstanceOf[js.Any])
    }
  }
}
