package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRequestedEventArgs
  extends StObject
     with IDataRequestedEventArgs
object DataRequestedEventArgs {
  
  inline def apply(request: DataRequest): DataRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequestedEventArgs]
  }
}
