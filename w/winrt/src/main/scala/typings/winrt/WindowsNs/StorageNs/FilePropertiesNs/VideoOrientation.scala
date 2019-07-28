package typings.winrt.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoOrientation extends js.Object

@JSGlobal("Windows.Storage.FileProperties.VideoOrientation")
@js.native
object VideoOrientation extends js.Object {
  @js.native
  sealed trait normal extends VideoOrientation
  
  @js.native
  sealed trait rotate180 extends VideoOrientation
  
  @js.native
  sealed trait rotate270 extends VideoOrientation
  
  @js.native
  sealed trait rotate90 extends VideoOrientation
  
  /* 0 */ val normal: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation.normal with Double = js.native
  /* 2 */ val rotate180: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation.rotate180 with Double = js.native
  /* 3 */ val rotate270: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation.rotate270 with Double = js.native
  /* 1 */ val rotate90: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.VideoOrientation.rotate90 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoOrientation with Double] = js.native
}

