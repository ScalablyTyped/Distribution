package typings.winrt.Windows.Data.Json

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IJsonErrorStatics extends StObject {
  
  def getStatus(hresult: Double): JsonErrorStatus
}
object IJsonErrorStatics {
  
  inline def apply(getStatus: Double => JsonErrorStatus): IJsonErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
    __obj.asInstanceOf[IJsonErrorStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IJsonErrorStatics] (val x: Self) extends AnyVal {
    
    inline def setGetStatus(value: Double => JsonErrorStatus): Self = StObject.set(x, "getStatus", js.Any.fromFunction1(value))
  }
}
