package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdUnitId extends StObject {
  
  /**
    * 推荐单元 id
    */
  var adUnitId: String
}
object AdUnitId {
  
  inline def apply(adUnitId: String): AdUnitId = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdUnitId]
  }
  
  extension [Self <: AdUnitId](x: Self) {
    
    inline def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
  }
}
