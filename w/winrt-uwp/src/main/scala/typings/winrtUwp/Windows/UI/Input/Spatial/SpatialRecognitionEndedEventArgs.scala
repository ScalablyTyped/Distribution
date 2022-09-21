package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialRecognitionEndedEventArgs extends StObject {
  
  var interactionSourceKind: Any
}
object SpatialRecognitionEndedEventArgs {
  
  inline def apply(interactionSourceKind: Any): SpatialRecognitionEndedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialRecognitionEndedEventArgs]
  }
  
  extension [Self <: SpatialRecognitionEndedEventArgs](x: Self) {
    
    inline def setInteractionSourceKind(value: Any): Self = StObject.set(x, "interactionSourceKind", value.asInstanceOf[js.Any])
  }
}
