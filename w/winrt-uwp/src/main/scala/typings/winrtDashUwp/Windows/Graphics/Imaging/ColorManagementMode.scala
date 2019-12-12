package typings.winrtDashUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Graphics.Imaging.ColorManagementMode.colorManageToSRgb
import typings.winrtDashUwp.Windows.Graphics.Imaging.ColorManagementMode.doNotColorManage
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorManagementMode with Double] = js.native
  /* 1 */ @js.native
  object colorManageToSRgb extends TopLevel[colorManageToSRgb with Double]
  
  /* 0 */ @js.native
  object doNotColorManage extends TopLevel[doNotColorManage with Double]
  
}

