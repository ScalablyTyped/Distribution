package typings.winrtUwp.Windows.Storage.FileProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhotoOrientation extends StObject
/** Indicates the Exchangeable Image File (EXIF) orientation flag of the photo. This flag describes how to rotate the photo to display it correctly. */
@JSGlobal("Windows.Storage.FileProperties.PhotoOrientation")
@js.native
object PhotoOrientation extends StObject {
  
  /** Flip the photo horizontally. */
  @js.native
  sealed trait flipHorizontal
    extends StObject
       with PhotoOrientation
  
  /** Flip the photo vertically. */
  @js.native
  sealed trait flipVertical
    extends StObject
       with PhotoOrientation
  
  /** No rotation needed. The photo can be displayed using its current orientation. */
  @js.native
  sealed trait normal
    extends StObject
       with PhotoOrientation
  
  /** Rotate the photo 180 degrees. */
  @js.native
  sealed trait rotate180
    extends StObject
       with PhotoOrientation
  
  /** Rotate the photo counter-clockwise 270 degrees. */
  @js.native
  sealed trait rotate270
    extends StObject
       with PhotoOrientation
  
  /** Rotate the photo counter-clockwise 90 degrees. */
  @js.native
  sealed trait rotate90
    extends StObject
       with PhotoOrientation
  
  /** Rotate the photo counter-clockwise 90 degrees and then flip it horizontally. */
  @js.native
  sealed trait transpose
    extends StObject
       with PhotoOrientation
  
  /** Rotate the photo counter-clockwise 270 degrees and then flip it horizontally. */
  @js.native
  sealed trait transverse
    extends StObject
       with PhotoOrientation
  
  /** An orientation flag is not set. */
  @js.native
  sealed trait unspecified
    extends StObject
       with PhotoOrientation
}
