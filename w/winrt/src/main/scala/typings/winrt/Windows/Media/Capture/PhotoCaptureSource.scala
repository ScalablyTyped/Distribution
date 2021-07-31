package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhotoCaptureSource extends StObject
@JSGlobal("Windows.Media.Capture.PhotoCaptureSource")
@js.native
object PhotoCaptureSource extends StObject {
  
  @js.native
  sealed trait auto
    extends StObject
       with PhotoCaptureSource
  
  @js.native
  sealed trait photo
    extends StObject
       with PhotoCaptureSource
  
  @js.native
  sealed trait videoPreview
    extends StObject
       with PhotoCaptureSource
}
