package typings.wixUiCore.standaloneSrcMod

import typings.wixUiCore.anon.UseAmPm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/standalone/src", "TimePicker")
@js.native
class TimePicker protected ()
  extends typings.wixUiCore.componentsTimePickerMod.TimePicker {
  def this(props: js.Any) = this()
}
/* static members */
object TimePicker {
  
  @JSImport("wix-ui-core/dist/standalone/src", "TimePicker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src", "TimePicker.defaultProps")
  @js.native
  def defaultProps: UseAmPm = js.native
  inline def defaultProps_=(x: UseAmPm): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/standalone/src", "TimePicker.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
