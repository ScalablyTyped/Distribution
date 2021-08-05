package typings.wixUiCore

import typings.wixUiCore.anon.ClickTickerDown
import typings.wixUiCore.anon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timePickerTimePickerDriverMod {
  
  @JSImport("wix-ui-core/src/components/time-picker/TimePicker.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timePickerDriverFactory(hasElementEventTrigger: Element): ClickTickerDown = ^.asInstanceOf[js.Dynamic].applyDynamic("timePickerDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[ClickTickerDown]
}
