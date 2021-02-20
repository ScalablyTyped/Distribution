package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlayToSourceRequestedEventArgs extends StObject {
  
  var sourceRequest: PlayToSourceRequest = js.native
}
object IPlayToSourceRequestedEventArgs {
  
  @scala.inline
  def apply(sourceRequest: PlayToSourceRequest): IPlayToSourceRequestedEventArgs = {
    val __obj = js.Dynamic.literal(sourceRequest = sourceRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToSourceRequestedEventArgs]
  }
  
  @scala.inline
  implicit class IPlayToSourceRequestedEventArgsMutableBuilder[Self <: IPlayToSourceRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceRequest(value: PlayToSourceRequest): Self = StObject.set(x, "sourceRequest", value.asInstanceOf[js.Any])
  }
}
