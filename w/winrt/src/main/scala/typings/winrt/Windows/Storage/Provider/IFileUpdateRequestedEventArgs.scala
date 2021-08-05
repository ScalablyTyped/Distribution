package typings.winrt.Windows.Storage.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileUpdateRequestedEventArgs extends StObject {
  
  var request: FileUpdateRequest
}
object IFileUpdateRequestedEventArgs {
  
  inline def apply(request: FileUpdateRequest): IFileUpdateRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileUpdateRequestedEventArgs]
  }
  
  extension [Self <: IFileUpdateRequestedEventArgs](x: Self) {
    
    inline def setRequest(value: FileUpdateRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
