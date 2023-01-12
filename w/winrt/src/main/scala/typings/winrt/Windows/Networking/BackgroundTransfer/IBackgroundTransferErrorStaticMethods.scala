package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Web.WebErrorStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackgroundTransferErrorStaticMethods extends StObject {
  
  def getStatus(hresult: Double): WebErrorStatus
}
object IBackgroundTransferErrorStaticMethods {
  
  inline def apply(getStatus: Double => WebErrorStatus): IBackgroundTransferErrorStaticMethods = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
    __obj.asInstanceOf[IBackgroundTransferErrorStaticMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBackgroundTransferErrorStaticMethods] (val x: Self) extends AnyVal {
    
    inline def setGetStatus(value: Double => WebErrorStatus): Self = StObject.set(x, "getStatus", js.Any.fromFunction1(value))
  }
}
