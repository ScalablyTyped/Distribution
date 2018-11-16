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
  
  val normal: normal with java.lang.String = js.native
  val rotate180: rotate180 with java.lang.String = js.native
  val rotate270: rotate270 with java.lang.String = js.native
  val rotate90: rotate90 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation with java.lang.String
  ] = js.native
}

