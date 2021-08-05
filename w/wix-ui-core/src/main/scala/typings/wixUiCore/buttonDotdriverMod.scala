package typings.wixUiCore

import typings.wixUiCore.anon.GetBorderRadius
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import typings.wixUiTestUtils.createDriverFactoryMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonDotdriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/deprecated/button/Button.driver", "buttonDriverFactory")
  @js.native
  val buttonDriverFactory: DriverFactory[ButtonDriver] = js.native
  
  trait ButtonDriver
    extends StObject
       with BaseDriver {
    
    /** click on the button root element */
    def click(): js.Any
    
    /** returns elements textContent */
    def getTextContent(): js.Any
    
    /** returns elements type attribute */
    def getType(): js.Any
    
    /** returns if the element is disabled */
    def isDisabled(): Boolean
    
    var styles: GetBorderRadius
  }
  object ButtonDriver {
    
    inline def apply(
      click: () => js.Any,
      exists: () => Boolean,
      getTextContent: () => js.Any,
      getType: () => js.Any,
      isDisabled: () => Boolean,
      styles: GetBorderRadius
    ): ButtonDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), getTextContent = js.Any.fromFunction0(getTextContent), getType = js.Any.fromFunction0(getType), isDisabled = js.Any.fromFunction0(isDisabled), styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonDriver]
    }
    
    extension [Self <: ButtonDriver](x: Self) {
      
      inline def setClick(value: () => js.Any): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setGetTextContent(value: () => js.Any): Self = StObject.set(x, "getTextContent", js.Any.fromFunction0(value))
      
      inline def setGetType(value: () => js.Any): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setStyles(value: GetBorderRadius): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
}
