package typings.swiper.anon

import typings.swiper.angularAngularSrcUtilsGetParamsMod.KeyValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params extends StObject {
  
  var params: Any
  
  var passedParams: KeyValueType
  
  var rest: KeyValueType
}
object Params {
  
  inline def apply(params: Any, passedParams: KeyValueType, rest: KeyValueType): Params = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], passedParams = passedParams.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setPassedParams(value: KeyValueType): Self = StObject.set(x, "passedParams", value.asInstanceOf[js.Any])
    
    inline def setRest(value: KeyValueType): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
  }
}
