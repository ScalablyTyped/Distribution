package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHook_ extends StObject {
  
  var dataHook: String
  
  var wrapper: js.Any
}
object DataHook_ {
  
  @scala.inline
  def apply(dataHook: String, wrapper: js.Any): DataHook_ = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHook_]
  }
  
  @scala.inline
  implicit class DataHook_MutableBuilder[Self <: DataHook_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapper(value: js.Any): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
  }
}
