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
  
  val colorManageToSRgb: colorManageToSRgb with java.lang.String = js.native
  val doNotColorManage: doNotColorManage with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.ColorManagementMode with java.lang.String
  ] = js.native
}

