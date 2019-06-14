package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

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
  sealed trait colorManageToSRgb
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.ColorManagementMode
  
  /** No color management is performed */
  @js.native
  sealed trait doNotColorManage
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.ColorManagementMode
  
  /* 1 */ val colorManageToSRgb: colorManageToSRgb with scala.Double = js.native
  /* 0 */ val doNotColorManage: doNotColorManage with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.ColorManagementMode with scala.Double
  ] = js.native
}

