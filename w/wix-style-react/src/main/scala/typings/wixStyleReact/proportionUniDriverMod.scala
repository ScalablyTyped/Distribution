package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proportionUniDriverMod {
  
  trait ProportionUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getAspectRatio(): js.Promise[Double]
    
    def isAspectRatioDisabled(): js.Promise[Boolean]
  }
  object ProportionUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getAspectRatio: () => js.Promise[Double],
      isAspectRatioDisabled: () => js.Promise[Boolean]
    ): ProportionUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getAspectRatio = js.Any.fromFunction0(getAspectRatio), isAspectRatioDisabled = js.Any.fromFunction0(isAspectRatioDisabled))
      __obj.asInstanceOf[ProportionUniDriver]
    }
    
    @scala.inline
    implicit class ProportionUniDriverMutableBuilder[Self <: ProportionUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAspectRatio(value: () => js.Promise[Double]): Self = StObject.set(x, "getAspectRatio", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsAspectRatioDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isAspectRatioDisabled", js.Any.fromFunction0(value))
    }
  }
}
