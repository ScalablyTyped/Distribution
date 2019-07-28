package typings.winrtDashUwp.WindowsNs.StorageNs.FilePropertiesNs

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
  sealed trait normal extends VideoOrientation
  
  /** Rotate the video counter-clockwise 180 degrees. */
  @js.native
  sealed trait rotate180 extends VideoOrientation
  
  /** Rotate the video counter-clockwise 270 degrees. */
  @js.native
  sealed trait rotate270 extends VideoOrientation
  
  /** Rotate the video 90 degrees. */
  @js.native
  sealed trait rotate90 extends VideoOrientation
  
  /* 0 */ val normal: typings.winrtDashUwp.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation.normal with Double = js.native
  /* 2 */ val rotate180: typings.winrtDashUwp.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation.rotate180 with Double = js.native
  /* 3 */ val rotate270: typings.winrtDashUwp.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation.rotate270 with Double = js.native
  /* 1 */ val rotate90: typings.winrtDashUwp.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation.rotate90 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoOrientation with Double] = js.native
}

