package typings.winrtDashUwp.Windows.Storage.FileProperties

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
  sealed trait flipHorizontal extends PhotoOrientation
  
  /** Flip the photo vertically. */
  @js.native
  sealed trait flipVertical extends PhotoOrientation
  
  /** No rotation needed. The photo can be displayed using its current orientation. */
  @js.native
  sealed trait normal extends PhotoOrientation
  
  /** Rotate the photo 180 degrees. */
  @js.native
  sealed trait rotate180 extends PhotoOrientation
  
  /** Rotate the photo counter-clockwise 270 degrees. */
  @js.native
  sealed trait rotate270 extends PhotoOrientation
  
  /** Rotate the photo counter-clockwise 90 degrees. */
  @js.native
  sealed trait rotate90 extends PhotoOrientation
  
  /** Rotate the photo counter-clockwise 90 degrees and then flip it horizontally. */
  @js.native
  sealed trait transpose extends PhotoOrientation
  
  /** Rotate the photo counter-clockwise 270 degrees and then flip it horizontally. */
  @js.native
  sealed trait transverse extends PhotoOrientation
  
  /** An orientation flag is not set. */
  @js.native
  sealed trait unspecified extends PhotoOrientation
  
  /* 2 */ val flipHorizontal: typings.winrtDashUwp.Windows.Storage.FileProperties.PhotoOrientation.flipHorizontal with Double = js.native
  /* 4 */ val flipVertical: typings.winrtDashUwp.Windows.Storage.FileProperties.PhotoOrientation.flipVertical with Double = js.native
  /* 1 */ val normal: typings.winrtDashUwp.Windows.Storage.FileProperties.PhotoOrientation.normal with Double = js.native
  /* 3 */ val rotate180: typings.winrtDashUwp.Windows.Storage.FileProperties.PhotoOrientation.rotate180 with Double = js.native
  /* 6 */ val rotate270: typings.winrtDashUwp.Windows.Storage.FileProperties.PhotoOrientation.rotate270 with Double = js.native
  /* 8 */ val rotate90: typings.winrtDashUwp.Windows.Storage.FileProperties.PhotoOrientation.rotate90 with Double = js.native
  /* 5 */ val transpose: typings.winrtDashUwp.Windows.Storage.FileProperties.PhotoOrientation.transpose with Double = js.native
  /* 7 */ val transverse: typings.winrtDashUwp.Windows.Storage.FileProperties.PhotoOrientation.transverse with Double = js.native
  /* 0 */ val unspecified: typings.winrtDashUwp.Windows.Storage.FileProperties.PhotoOrientation.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoOrientation with Double] = js.native
}

