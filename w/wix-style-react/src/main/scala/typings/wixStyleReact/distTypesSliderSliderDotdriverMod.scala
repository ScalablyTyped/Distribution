package typings.wixStyleReact

import typings.wixStyleReact.wixStyleReactStrings.horizontal
import typings.wixStyleReact.wixStyleReactStrings.vertical
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSliderSliderDotdriverMod {
  
  trait SliderDriver
    extends StObject
       with BaseDriver {
    
    def getDirection(): vertical | horizontal
    
    def getToolTipValue(index: Double): String
    
    def isDisabled(): Boolean
    
    def isDotSelected(value: Double): Boolean
    
    def numOfSliderDots(): Double
    
    def numOfSliderHandles(): Double
    
    def numOfSliderMarksLabels(): Double
  }
  object SliderDriver {
    
    inline def apply(
      exists: () => Boolean,
      getDirection: () => vertical | horizontal,
      getToolTipValue: Double => String,
      isDisabled: () => Boolean,
      isDotSelected: Double => Boolean,
      numOfSliderDots: () => Double,
      numOfSliderHandles: () => Double,
      numOfSliderMarksLabels: () => Double
    ): SliderDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getDirection = js.Any.fromFunction0(getDirection), getToolTipValue = js.Any.fromFunction1(getToolTipValue), isDisabled = js.Any.fromFunction0(isDisabled), isDotSelected = js.Any.fromFunction1(isDotSelected), numOfSliderDots = js.Any.fromFunction0(numOfSliderDots), numOfSliderHandles = js.Any.fromFunction0(numOfSliderHandles), numOfSliderMarksLabels = js.Any.fromFunction0(numOfSliderMarksLabels))
      __obj.asInstanceOf[SliderDriver]
    }
    
    extension [Self <: SliderDriver](x: Self) {
      
      inline def setGetDirection(value: () => vertical | horizontal): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
      
      inline def setGetToolTipValue(value: Double => String): Self = StObject.set(x, "getToolTipValue", js.Any.fromFunction1(value))
      
      inline def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsDotSelected(value: Double => Boolean): Self = StObject.set(x, "isDotSelected", js.Any.fromFunction1(value))
      
      inline def setNumOfSliderDots(value: () => Double): Self = StObject.set(x, "numOfSliderDots", js.Any.fromFunction0(value))
      
      inline def setNumOfSliderHandles(value: () => Double): Self = StObject.set(x, "numOfSliderHandles", js.Any.fromFunction0(value))
      
      inline def setNumOfSliderMarksLabels(value: () => Double): Self = StObject.set(x, "numOfSliderMarksLabels", js.Any.fromFunction0(value))
    }
  }
}
