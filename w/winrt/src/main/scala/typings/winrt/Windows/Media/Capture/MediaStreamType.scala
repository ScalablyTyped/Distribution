package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaStreamType extends StObject
@JSGlobal("Windows.Media.Capture.MediaStreamType")
@js.native
object MediaStreamType extends StObject {
  
  @js.native
  sealed trait audio
    extends StObject
       with MediaStreamType
  
  @js.native
  sealed trait photo
    extends StObject
       with MediaStreamType
  
  @js.native
  sealed trait videoPreview
    extends StObject
       with MediaStreamType
  
  @js.native
  sealed trait videoRecord
    extends StObject
       with MediaStreamType
}
