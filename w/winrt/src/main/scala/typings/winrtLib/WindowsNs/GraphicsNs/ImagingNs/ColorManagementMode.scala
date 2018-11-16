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
  
  val colorManageToSRgb: colorManageToSRgb with java.lang.String = js.native
  val doNotColorManage: doNotColorManage with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.GraphicsNs.ImagingNs.ColorManagementMode with java.lang.String
  ] = js.native
}

