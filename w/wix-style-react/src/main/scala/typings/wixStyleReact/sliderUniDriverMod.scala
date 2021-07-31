package typings.wixStyleReact

import typings.wixStyleReact.anon.HandleIndex
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderUniDriverMod {
  
  trait SliderUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getToolTipValue(): js.Promise[String]
    
    def hoverHandle(payload: HandleIndex): js.Promise[Unit]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isDotSelected(value: Double): js.Promise[Boolean]
    
    def numOfSliderDots(): js.Promise[Double]
    
    def numOfSliderHandles(): js.Promise[Double]
    
    def numOfSliderMarksLabels(): js.Promise[Double]
    
    def unHoverHandle(payload: HandleIndex): js.Promise[Unit]
  }
  object SliderUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getToolTipValue: () => js.Promise[String],
      hoverHandle: HandleIndex => js.Promise[Unit],
      isDisabled: () => js.Promise[Boolean],
      isDotSelected: Double => js.Promise[Boolean],
      numOfSliderDots: () => js.Promise[Double],
      numOfSliderHandles: () => js.Promise[Double],
      numOfSliderMarksLabels: () => js.Promise[Double],
      unHoverHandle: HandleIndex => js.Promise[Unit]
    ): SliderUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getToolTipValue = js.Any.fromFunction0(getToolTipValue), hoverHandle = js.Any.fromFunction1(hoverHandle), isDisabled = js.Any.fromFunction0(isDisabled), isDotSelected = js.Any.fromFunction1(isDotSelected), numOfSliderDots = js.Any.fromFunction0(numOfSliderDots), numOfSliderHandles = js.Any.fromFunction0(numOfSliderHandles), numOfSliderMarksLabels = js.Any.fromFunction0(numOfSliderMarksLabels), unHoverHandle = js.Any.fromFunction1(unHoverHandle))
      __obj.asInstanceOf[SliderUniDriver]
    }
    
    @scala.inline
    implicit class SliderUniDriverMutableBuilder[Self <: SliderUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetToolTipValue(value: () => js.Promise[String]): Self = StObject.set(x, "getToolTipValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHoverHandle(value: HandleIndex => js.Promise[Unit]): Self = StObject.set(x, "hoverHandle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDotSelected(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isDotSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNumOfSliderDots(value: () => js.Promise[Double]): Self = StObject.set(x, "numOfSliderDots", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNumOfSliderHandles(value: () => js.Promise[Double]): Self = StObject.set(x, "numOfSliderHandles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNumOfSliderMarksLabels(value: () => js.Promise[Double]): Self = StObject.set(x, "numOfSliderMarksLabels", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnHoverHandle(value: HandleIndex => js.Promise[Unit]): Self = StObject.set(x, "unHoverHandle", js.Any.fromFunction1(value))
    }
  }
}
