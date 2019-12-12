package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Graphics.Imaging.ColorManagementMode.colorManageToSRgb
import typings.winrt.Windows.Graphics.Imaging.ColorManagementMode.doNotColorManage
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorManagementMode with Double] = js.native
  /* 1 */ @js.native
  object colorManageToSRgb extends TopLevel[colorManageToSRgb with Double]
  
  /* 0 */ @js.native
  object doNotColorManage extends TopLevel[doNotColorManage with Double]
  
}

