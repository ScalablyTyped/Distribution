package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.commonBaseDriverProtractorMod.DriverFactory
import typings.wixUiCore.popoverProtractorDotDriverMod.PopoverDriver
import typings.wixUiTestUtils.protractorHelpersMod.ILocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipProtractorDotDriverMod {
  
  @JSImport("wix-ui-core/src/components/tooltip/Tooltip.protractor.driver", "tooltipDriverFactory")
  @js.native
  val tooltipDriverFactory: DriverFactory[TooltipDriver] = js.native
  
  trait TooltipDriver
    extends StObject
       with PopoverDriver {
    
    def getTooltipLocation(): js.Promise[ILocation]
  }
  object TooltipDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => ElementFinder,
      getContentElement: () => ElementFinder,
      getTargetElement: () => ElementFinder,
      getTooltipLocation: () => js.Promise[ILocation],
      isContentElementExists: () => js.Promise[Boolean],
      isTargetElementExists: () => js.Promise[Boolean],
      mouseEnter: () => js.Promise[Unit],
      mouseLeave: () => js.Promise[Unit]
    ): TooltipDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), getContentElement = js.Any.fromFunction0(getContentElement), getTargetElement = js.Any.fromFunction0(getTargetElement), getTooltipLocation = js.Any.fromFunction0(getTooltipLocation), isContentElementExists = js.Any.fromFunction0(isContentElementExists), isTargetElementExists = js.Any.fromFunction0(isTargetElementExists), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave))
      __obj.asInstanceOf[TooltipDriver]
    }
    
    extension [Self <: TooltipDriver](x: Self) {
      
      inline def setGetTooltipLocation(value: () => js.Promise[ILocation]): Self = StObject.set(x, "getTooltipLocation", js.Any.fromFunction0(value))
    }
  }
}
