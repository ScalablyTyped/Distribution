package typings.winrtDashUwp.Windows.Storage.FileProperties

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoOrientation with Double] = js.native
  /* 2 */ @js.native
  object flipHorizontal extends TopLevel[flipHorizontal with Double]
  
  /* 4 */ @js.native
  object flipVertical extends TopLevel[flipVertical with Double]
  
  /* 1 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 3 */ @js.native
  object rotate180 extends TopLevel[rotate180 with Double]
  
  /* 6 */ @js.native
  object rotate270 extends TopLevel[rotate270 with Double]
  
  /* 8 */ @js.native
  object rotate90 extends TopLevel[rotate90 with Double]
  
  /* 5 */ @js.native
  object transpose extends TopLevel[transpose with Double]
  
  /* 7 */ @js.native
  object transverse extends TopLevel[transverse with Double]
  
  /* 0 */ @js.native
  object unspecified extends TopLevel[unspecified with Double]
  
}

