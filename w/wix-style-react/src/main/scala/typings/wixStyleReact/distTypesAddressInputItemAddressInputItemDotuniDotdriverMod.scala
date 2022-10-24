package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAddressInputItemAddressInputItemDotuniDotdriverMod {
  
  trait AddressInputItemUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getMainLabelText(): js.Promise[String]
    
    def getPrefix(): js.Promise[BaseUniDriver]
    
    def getSecondaryLabelText(): js.Promise[String]
    
    def getSuffix(): js.Promise[BaseUniDriver]
  }
  object AddressInputItemUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getMainLabelText: () => js.Promise[String],
      getPrefix: () => js.Promise[BaseUniDriver],
      getSecondaryLabelText: () => js.Promise[String],
      getSuffix: () => js.Promise[BaseUniDriver]
    ): AddressInputItemUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getMainLabelText = js.Any.fromFunction0(getMainLabelText), getPrefix = js.Any.fromFunction0(getPrefix), getSecondaryLabelText = js.Any.fromFunction0(getSecondaryLabelText), getSuffix = js.Any.fromFunction0(getSuffix))
      __obj.asInstanceOf[AddressInputItemUniDriver]
    }
    
    extension [Self <: AddressInputItemUniDriver](x: Self) {
      
      inline def setGetMainLabelText(value: () => js.Promise[String]): Self = StObject.set(x, "getMainLabelText", js.Any.fromFunction0(value))
      
      inline def setGetPrefix(value: () => js.Promise[BaseUniDriver]): Self = StObject.set(x, "getPrefix", js.Any.fromFunction0(value))
      
      inline def setGetSecondaryLabelText(value: () => js.Promise[String]): Self = StObject.set(x, "getSecondaryLabelText", js.Any.fromFunction0(value))
      
      inline def setGetSuffix(value: () => js.Promise[BaseUniDriver]): Self = StObject.set(x, "getSuffix", js.Any.fromFunction0(value))
    }
  }
}
