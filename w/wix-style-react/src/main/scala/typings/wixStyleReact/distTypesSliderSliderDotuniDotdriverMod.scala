package typings.wixStyleReact

import typings.wixStyleReact.wixStyleReactStrings.horizontal
import typings.wixStyleReact.wixStyleReactStrings.vertical
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSliderSliderDotuniDotdriverMod {
  
  trait SliderUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getDirection(): js.Promise[vertical | horizontal]
    
    def getToolTipValue(index: Double): js.Promise[String]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isDotSelected(value: Double): js.Promise[Boolean]
    
    def numOfSliderDots(): js.Promise[Double]
    
    def numOfSliderHandles(): js.Promise[Double]
    
    def numOfSliderMarksLabels(): js.Promise[Double]
  }
  object SliderUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getDirection: () => js.Promise[vertical | horizontal],
      getToolTipValue: Double => js.Promise[String],
      isDisabled: () => js.Promise[Boolean],
      isDotSelected: Double => js.Promise[Boolean],
      numOfSliderDots: () => js.Promise[Double],
      numOfSliderHandles: () => js.Promise[Double],
      numOfSliderMarksLabels: () => js.Promise[Double]
    ): SliderUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getDirection = js.Any.fromFunction0(getDirection), getToolTipValue = js.Any.fromFunction1(getToolTipValue), isDisabled = js.Any.fromFunction0(isDisabled), isDotSelected = js.Any.fromFunction1(isDotSelected), numOfSliderDots = js.Any.fromFunction0(numOfSliderDots), numOfSliderHandles = js.Any.fromFunction0(numOfSliderHandles), numOfSliderMarksLabels = js.Any.fromFunction0(numOfSliderMarksLabels))
      __obj.asInstanceOf[SliderUniDriver]
    }
    
    extension [Self <: SliderUniDriver](x: Self) {
      
      inline def setGetDirection(value: () => js.Promise[vertical | horizontal]): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
      
      inline def setGetToolTipValue(value: Double => js.Promise[String]): Self = StObject.set(x, "getToolTipValue", js.Any.fromFunction1(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsDotSelected(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isDotSelected", js.Any.fromFunction1(value))
      
      inline def setNumOfSliderDots(value: () => js.Promise[Double]): Self = StObject.set(x, "numOfSliderDots", js.Any.fromFunction0(value))
      
      inline def setNumOfSliderHandles(value: () => js.Promise[Double]): Self = StObject.set(x, "numOfSliderHandles", js.Any.fromFunction0(value))
      
      inline def setNumOfSliderMarksLabels(value: () => js.Promise[Double]): Self = StObject.set(x, "numOfSliderMarksLabels", js.Any.fromFunction0(value))
    }
  }
}
