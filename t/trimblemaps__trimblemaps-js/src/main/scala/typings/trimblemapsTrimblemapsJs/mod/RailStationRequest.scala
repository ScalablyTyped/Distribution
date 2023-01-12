package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.anon.DataAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RailStationRequest extends StObject {
  
  def callback(error: js.Error, result: DataAny): Unit
  @JSName("callback")
  var callback_Original: Callback[DataAny]
  
  var splc: String
}
object RailStationRequest {
  
  inline def apply(callback: (/* error */ js.Error, DataAny) => Unit, splc: String): RailStationRequest = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), splc = splc.asInstanceOf[js.Any])
    __obj.asInstanceOf[RailStationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RailStationRequest] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: (/* error */ js.Error, DataAny) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setSplc(value: String): Self = StObject.set(x, "splc", value.asInstanceOf[js.Any])
  }
}
