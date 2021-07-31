package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Web.WebErrorStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebSocketErrorStatics extends StObject {
  
  def getStatus(hresult: Double): WebErrorStatus
}
object IWebSocketErrorStatics {
  
  @scala.inline
  def apply(getStatus: Double => WebErrorStatus): IWebSocketErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
    __obj.asInstanceOf[IWebSocketErrorStatics]
  }
  
  @scala.inline
  implicit class IWebSocketErrorStaticsMutableBuilder[Self <: IWebSocketErrorStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetStatus(value: Double => WebErrorStatus): Self = StObject.set(x, "getStatus", js.Any.fromFunction1(value))
  }
}
