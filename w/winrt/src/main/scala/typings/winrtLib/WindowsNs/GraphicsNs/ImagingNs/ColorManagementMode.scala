package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColorManagementMode extends js.Object

@JSGlobal("Windows.Graphics.Imaging.ColorManagementMode")
@js.native
object ColorManagementMode extends js.Object {
  @js.native
  sealed trait colorManageToSRgb
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.ColorManagementMode
  
  @js.native
  sealed trait doNotColorManage
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.ColorManagementMode
  
  /* 1 */ val colorManageToSRgb: colorManageToSRgb with scala.Double = js.native
  /* 0 */ val doNotColorManage: doNotColorManage with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.ImagingNs.ColorManagementMode with scala.Double] = js.native
}

