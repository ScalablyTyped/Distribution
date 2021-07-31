package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.baseDriverProtractorMod.BaseDriver
import typings.wixUiCore.baseDriverProtractorMod.DriverFactory
import typings.wixUiTestUtils.protractorHelpersMod.ILocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderProtractorDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/slider/Slider.protractor.driver", "sliderDriverFactory")
  @js.native
  val sliderDriverFactory: DriverFactory[SliderDriver] = js.native
  
  trait SliderDriver
    extends StObject
       with BaseDriver {
    
    def clickTrack(position: ILocation): js.Promise[Unit]
    
    def dragAndDropThumb(position: ILocation): js.Promise[Unit]
    
    def dragThumb(position: ILocation): js.Promise[Unit]
    
    def getSliderValue(): js.Promise[String]
    
    def getTooltipValue(): js.Promise[String]
  }
  object SliderDriver {
    
    @scala.inline
    def apply(
      clickTrack: ILocation => js.Promise[Unit],
      dragAndDropThumb: ILocation => js.Promise[Unit],
      dragThumb: ILocation => js.Promise[Unit],
      element: () => ElementFinder,
      getSliderValue: () => js.Promise[String],
      getTooltipValue: () => js.Promise[String]
    ): SliderDriver = {
      val __obj = js.Dynamic.literal(clickTrack = js.Any.fromFunction1(clickTrack), dragAndDropThumb = js.Any.fromFunction1(dragAndDropThumb), dragThumb = js.Any.fromFunction1(dragThumb), element = js.Any.fromFunction0(element), getSliderValue = js.Any.fromFunction0(getSliderValue), getTooltipValue = js.Any.fromFunction0(getTooltipValue))
      __obj.asInstanceOf[SliderDriver]
    }
    
    @scala.inline
    implicit class SliderDriverMutableBuilder[Self <: SliderDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickTrack(value: ILocation => js.Promise[Unit]): Self = StObject.set(x, "clickTrack", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragAndDropThumb(value: ILocation => js.Promise[Unit]): Self = StObject.set(x, "dragAndDropThumb", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragThumb(value: ILocation => js.Promise[Unit]): Self = StObject.set(x, "dragThumb", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSliderValue(value: () => js.Promise[String]): Self = StObject.set(x, "getSliderValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTooltipValue(value: () => js.Promise[String]): Self = StObject.set(x, "getTooltipValue", js.Any.fromFunction0(value))
    }
  }
}
