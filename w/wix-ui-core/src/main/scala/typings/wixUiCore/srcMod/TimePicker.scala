package typings.wixUiCore.srcMod

import typings.wixUiCore.anon.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/src", "TimePicker")
@js.native
class TimePicker protected ()
  extends typings.wixUiCore.timePickerMod.TimePicker {
  def this(props: js.Any) = this()
}
/* static members */
object TimePicker {
  
  @JSImport("wix-ui-core/dist/src", "TimePicker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/src", "TimePicker.defaultProps")
  @js.native
  def defaultProps: Step = js.native
  @scala.inline
  def defaultProps_=(x: Step): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/src", "TimePicker.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
