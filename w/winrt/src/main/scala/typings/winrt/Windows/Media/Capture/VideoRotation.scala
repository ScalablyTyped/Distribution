package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VideoRotation extends StObject
@JSGlobal("Windows.Media.Capture.VideoRotation")
@js.native
object VideoRotation extends StObject {
  
  @js.native
  sealed trait clockwise180Degrees
    extends StObject
       with VideoRotation
  
  @js.native
  sealed trait clockwise270Degrees
    extends StObject
       with VideoRotation
  
  @js.native
  sealed trait clockwise90Degrees
    extends StObject
       with VideoRotation
  
  @js.native
  sealed trait none
    extends StObject
       with VideoRotation
}
