package typings.winrt.Windows.Web

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebErrorStatics extends StObject {
  
  def getStatus(hresult: Double): WebErrorStatus
}
object IWebErrorStatics {
  
  inline def apply(getStatus: Double => WebErrorStatus): IWebErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
    __obj.asInstanceOf[IWebErrorStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebErrorStatics] (val x: Self) extends AnyVal {
    
    inline def setGetStatus(value: Double => WebErrorStatus): Self = StObject.set(x, "getStatus", js.Any.fromFunction1(value))
  }
}
