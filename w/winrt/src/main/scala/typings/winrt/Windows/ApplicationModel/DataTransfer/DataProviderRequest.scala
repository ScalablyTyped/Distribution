package typings.winrt.Windows.ApplicationModel.DataTransfer

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProviderRequest
  extends StObject
     with IDataProviderRequest
object DataProviderRequest {
  
  inline def apply(deadline: Date, formatId: String, getDeferral: () => DataProviderDeferral, setData: js.Any => Unit): DataProviderRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], formatId = formatId.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[DataProviderRequest]
  }
}
