package typings.wixStyleReact

import typings.wixStyleReact.anon.HandleIndex
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderDriverMod {
  
  trait SliderDriver
    extends StObject
       with BaseDriver {
    
    def getToolTipValue(): String
    
    def hoverHandle(payload: HandleIndex): Unit
    
    def isDisabled(): Boolean
    
    def isDotSelected(value: Double): Boolean
    
    def numOfSliderDots(): Double
    
    def numOfSliderHandles(): Double
    
    def numOfSliderMarksLabels(): Double
    
    def unHoverHandle(payload: HandleIndex): Unit
  }
  object SliderDriver {
    
    @scala.inline
    def apply(
      exists: () => Boolean,
      getToolTipValue: () => String,
      hoverHandle: HandleIndex => Unit,
      isDisabled: () => Boolean,
      isDotSelected: Double => Boolean,
      numOfSliderDots: () => Double,
      numOfSliderHandles: () => Double,
      numOfSliderMarksLabels: () => Double,
      unHoverHandle: HandleIndex => Unit
    ): SliderDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getToolTipValue = js.Any.fromFunction0(getToolTipValue), hoverHandle = js.Any.fromFunction1(hoverHandle), isDisabled = js.Any.fromFunction0(isDisabled), isDotSelected = js.Any.fromFunction1(isDotSelected), numOfSliderDots = js.Any.fromFunction0(numOfSliderDots), numOfSliderHandles = js.Any.fromFunction0(numOfSliderHandles), numOfSliderMarksLabels = js.Any.fromFunction0(numOfSliderMarksLabels), unHoverHandle = js.Any.fromFunction1(unHoverHandle))
      __obj.asInstanceOf[SliderDriver]
    }
    
    @scala.inline
    implicit class SliderDriverMutableBuilder[Self <: SliderDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetToolTipValue(value: () => String): Self = StObject.set(x, "getToolTipValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHoverHandle(value: HandleIndex => Unit): Self = StObject.set(x, "hoverHandle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDotSelected(value: Double => Boolean): Self = StObject.set(x, "isDotSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNumOfSliderDots(value: () => Double): Self = StObject.set(x, "numOfSliderDots", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNumOfSliderHandles(value: () => Double): Self = StObject.set(x, "numOfSliderHandles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNumOfSliderMarksLabels(value: () => Double): Self = StObject.set(x, "numOfSliderMarksLabels", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnHoverHandle(value: HandleIndex => Unit): Self = StObject.set(x, "unHoverHandle", js.Any.fromFunction1(value))
    }
  }
}
