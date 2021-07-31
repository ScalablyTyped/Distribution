package typings.winrtUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorManagementMode extends StObject
/** Specifies the color management behavior when obtaining pixel data. */
@JSGlobal("Windows.Graphics.Imaging.ColorManagementMode")
@js.native
object ColorManagementMode extends StObject {
  
  /** Color management is performed from the color space embedded with the source bitmap to the sRGB color space. */
  @js.native
  sealed trait colorManageToSRgb
    extends StObject
       with ColorManagementMode
  
  /** No color management is performed */
  @js.native
  sealed trait doNotColorManage
    extends StObject
       with ColorManagementMode
}
