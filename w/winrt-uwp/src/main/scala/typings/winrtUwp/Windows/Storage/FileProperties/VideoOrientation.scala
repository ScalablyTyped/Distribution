package typings.winrtUwp.Windows.Storage.FileProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VideoOrientation extends StObject
/** Indicates how to rotate the video to display it correctly. */
@JSGlobal("Windows.Storage.FileProperties.VideoOrientation")
@js.native
object VideoOrientation extends StObject {
  
  /** No rotation needed. The video can be displayed using its current orientation. */
  @js.native
  sealed trait normal
    extends StObject
       with VideoOrientation
  
  /** Rotate the video counter-clockwise 180 degrees. */
  @js.native
  sealed trait rotate180
    extends StObject
       with VideoOrientation
  
  /** Rotate the video counter-clockwise 270 degrees. */
  @js.native
  sealed trait rotate270
    extends StObject
       with VideoOrientation
  
  /** Rotate the video 90 degrees. */
  @js.native
  sealed trait rotate90
    extends StObject
       with VideoOrientation
}
