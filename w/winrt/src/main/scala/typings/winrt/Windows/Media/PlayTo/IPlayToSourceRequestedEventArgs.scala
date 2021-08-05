package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayToSourceRequestedEventArgs extends StObject {
  
  var sourceRequest: PlayToSourceRequest
}
object IPlayToSourceRequestedEventArgs {
  
  inline def apply(sourceRequest: PlayToSourceRequest): IPlayToSourceRequestedEventArgs = {
    val __obj = js.Dynamic.literal(sourceRequest = sourceRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToSourceRequestedEventArgs]
  }
  
  extension [Self <: IPlayToSourceRequestedEventArgs](x: Self) {
    
    inline def setSourceRequest(value: PlayToSourceRequest): Self = StObject.set(x, "sourceRequest", value.asInstanceOf[js.Any])
  }
}
