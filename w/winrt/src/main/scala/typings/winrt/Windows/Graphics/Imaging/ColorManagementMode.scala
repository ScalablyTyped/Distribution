package typings.winrt.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColorManagementMode extends js.Object

@JSGlobal("Windows.Graphics.Imaging.ColorManagementMode")
@js.native
object ColorManagementMode extends js.Object {
  @js.native
  sealed trait colorManageToSRgb extends ColorManagementMode
  
  @js.native
  sealed trait doNotColorManage extends ColorManagementMode
  
  /* 1 */ val colorManageToSRgb: typings.winrt.Windows.Graphics.Imaging.ColorManagementMode.colorManageToSRgb with Double = js.native
  /* 0 */ val doNotColorManage: typings.winrt.Windows.Graphics.Imaging.ColorManagementMode.doNotColorManage with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorManagementMode with Double] = js.native
}

