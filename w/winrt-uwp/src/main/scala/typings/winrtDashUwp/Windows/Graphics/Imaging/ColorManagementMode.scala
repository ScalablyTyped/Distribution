package typings.winrtDashUwp.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColorManagementMode extends js.Object

/** Specifies the color management behavior when obtaining pixel data. */
@JSGlobal("Windows.Graphics.Imaging.ColorManagementMode")
@js.native
object ColorManagementMode extends js.Object {
  /** Color management is performed from the color space embedded with the source bitmap to the sRGB color space. */
  @js.native
  sealed trait colorManageToSRgb extends ColorManagementMode
  
  /** No color management is performed */
  @js.native
  sealed trait doNotColorManage extends ColorManagementMode
  
  /* 1 */ val colorManageToSRgb: typings.winrtDashUwp.Windows.Graphics.Imaging.ColorManagementMode.colorManageToSRgb with Double = js.native
  /* 0 */ val doNotColorManage: typings.winrtDashUwp.Windows.Graphics.Imaging.ColorManagementMode.doNotColorManage with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorManagementMode with Double] = js.native
}

