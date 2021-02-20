package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorManagementMode extends StObject
@JSGlobal("Windows.Graphics.Imaging.ColorManagementMode")
@js.native
object ColorManagementMode extends StObject {
  
  @js.native
  sealed trait colorManageToSRgb extends ColorManagementMode
  
  @js.native
  sealed trait doNotColorManage extends ColorManagementMode
}
