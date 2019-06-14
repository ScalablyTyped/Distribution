package typings
package winrtLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoOrientation extends js.Object

@JSGlobal("Windows.Storage.FileProperties.VideoOrientation")
@js.native
object VideoOrientation extends js.Object {
  @js.native
  sealed trait normal
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation
  
  @js.native
  sealed trait rotate180
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation
  
  @js.native
  sealed trait rotate270
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation
  
  @js.native
  sealed trait rotate90
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation
  
  /* 0 */ val normal: normal with scala.Double = js.native
  /* 2 */ val rotate180: rotate180 with scala.Double = js.native
  /* 3 */ val rotate270: rotate270 with scala.Double = js.native
  /* 1 */ val rotate90: rotate90 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation with scala.Double] = js.native
}

