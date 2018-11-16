package typings
package winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoOrientation extends js.Object

/** Indicates how to rotate the video to display it correctly. */
@JSGlobal("Windows.Storage.FileProperties.VideoOrientation")
@js.native
object VideoOrientation extends js.Object {
  /** No rotation needed. The video can be displayed using its current orientation. */
  @js.native
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation
  
  /** Rotate the video counter-clockwise 180 degrees. */
  @js.native
  sealed trait rotate180
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation
  
  /** Rotate the video counter-clockwise 270 degrees. */
  @js.native
  sealed trait rotate270
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation
  
  /** Rotate the video 90 degrees. */
  @js.native
  sealed trait rotate90
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation
  
  val normal: normal with java.lang.String = js.native
  val rotate180: rotate180 with java.lang.String = js.native
  val rotate270: rotate270 with java.lang.String = js.native
  val rotate90: rotate90 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation with java.lang.String
  ] = js.native
}

