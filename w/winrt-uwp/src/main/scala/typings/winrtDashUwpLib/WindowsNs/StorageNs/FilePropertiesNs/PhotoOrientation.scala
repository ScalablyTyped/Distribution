package typings
package winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoOrientation extends js.Object

/** Indicates the Exchangeable Image File (EXIF) orientation flag of the photo. This flag describes how to rotate the photo to display it correctly. */
@JSGlobal("Windows.Storage.FileProperties.PhotoOrientation")
@js.native
object PhotoOrientation extends js.Object {
  /** Flip the photo horizontally. */
  @js.native
  sealed trait flipHorizontal
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  /** Flip the photo vertically. */
  @js.native
  sealed trait flipVertical
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  /** No rotation needed. The photo can be displayed using its current orientation. */
  @js.native
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  /** Rotate the photo 180 degrees. */
  @js.native
  sealed trait rotate180
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  /** Rotate the photo counter-clockwise 270 degrees. */
  @js.native
  sealed trait rotate270
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  /** Rotate the photo counter-clockwise 90 degrees. */
  @js.native
  sealed trait rotate90
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  /** Rotate the photo counter-clockwise 90 degrees and then flip it horizontally. */
  @js.native
  sealed trait transpose
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  /** Rotate the photo counter-clockwise 270 degrees and then flip it horizontally. */
  @js.native
  sealed trait transverse
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  /** An orientation flag is not set. */
  @js.native
  sealed trait unspecified
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation
  
  val flipHorizontal: flipHorizontal with java.lang.String = js.native
  val flipVertical: flipVertical with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  val rotate180: rotate180 with java.lang.String = js.native
  val rotate270: rotate270 with java.lang.String = js.native
  val rotate90: rotate90 with java.lang.String = js.native
  val transpose: transpose with java.lang.String = js.native
  val transverse: transverse with java.lang.String = js.native
  val unspecified: unspecified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.PhotoOrientation with java.lang.String
  ] = js.native
}

