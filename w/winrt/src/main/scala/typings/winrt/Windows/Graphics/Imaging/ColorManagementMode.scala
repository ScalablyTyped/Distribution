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
  
}

