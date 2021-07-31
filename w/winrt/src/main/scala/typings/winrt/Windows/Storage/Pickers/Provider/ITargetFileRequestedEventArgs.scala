package typings.winrt.Windows.Storage.Pickers.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITargetFileRequestedEventArgs extends StObject {
  
  var request: TargetFileRequest
}
object ITargetFileRequestedEventArgs {
  
  @scala.inline
  def apply(request: TargetFileRequest): ITargetFileRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITargetFileRequestedEventArgs]
  }
  
  @scala.inline
  implicit class ITargetFileRequestedEventArgsMutableBuilder[Self <: ITargetFileRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: TargetFileRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
