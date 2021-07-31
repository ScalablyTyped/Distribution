package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReginSuccessCallbackOptions extends StObject {
  
  //  东北角经纬度
  var northeast: Double
  
  //  西南角经纬度
  var southwest: Double
}
object GetReginSuccessCallbackOptions {
  
  @scala.inline
  def apply(northeast: Double, southwest: Double): GetReginSuccessCallbackOptions = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReginSuccessCallbackOptions]
  }
  
  @scala.inline
  implicit class GetReginSuccessCallbackOptionsMutableBuilder[Self <: GetReginSuccessCallbackOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNortheast(value: Double): Self = StObject.set(x, "northeast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouthwest(value: Double): Self = StObject.set(x, "southwest", value.asInstanceOf[js.Any])
  }
}
