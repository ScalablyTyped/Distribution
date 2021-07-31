package typings.wixStyleReact

import typings.wixStyleReact.anon.Blur
import typings.wixStyleReact.dropdownLayoutDriverMod.DropdownLayoutDriver
import typings.wixStyleReact.inputDriverMod.InputDriver
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputWithOptionsDriverMod {
  
  trait InputWithOptionsDriver
    extends StObject
       with BaseDriver {
    
    var driver: Blur
    
    var dropdownLayoutDriver: DropdownLayoutDriver
    
    var inputDriver: InputDriver
  }
  object InputWithOptionsDriver {
    
    @scala.inline
    def apply(
      driver: Blur,
      dropdownLayoutDriver: DropdownLayoutDriver,
      exists: () => Boolean,
      inputDriver: InputDriver
    ): InputWithOptionsDriver = {
      val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], dropdownLayoutDriver = dropdownLayoutDriver.asInstanceOf[js.Any], exists = js.Any.fromFunction0(exists), inputDriver = inputDriver.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputWithOptionsDriver]
    }
    
    @scala.inline
    implicit class InputWithOptionsDriverMutableBuilder[Self <: InputWithOptionsDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDriver(value: Blur): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownLayoutDriver(value: DropdownLayoutDriver): Self = StObject.set(x, "dropdownLayoutDriver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputDriver(value: InputDriver): Self = StObject.set(x, "inputDriver", value.asInstanceOf[js.Any])
    }
  }
}
