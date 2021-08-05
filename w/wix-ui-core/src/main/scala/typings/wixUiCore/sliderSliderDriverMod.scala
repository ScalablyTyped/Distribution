package typings.wixUiCore

import typings.wixUiCore.anon.AriaLabel
import typings.wixUiCore.anon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderSliderDriverMod {
  
  @JSImport("wix-ui-core/src/components/slider/Slider.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sliderDriverFactory(hasElementEventTrigger: Element): AriaLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("sliderDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[AriaLabel]
}
