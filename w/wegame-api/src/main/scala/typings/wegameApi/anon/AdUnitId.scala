package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdUnitId extends StObject {
  
  /**
    * 广告单元 id
    */
  var adUnitId: String
}
object AdUnitId {
  
  @scala.inline
  def apply(adUnitId: String): AdUnitId = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdUnitId]
  }
  
  @scala.inline
  implicit class AdUnitIdMutableBuilder[Self <: AdUnitId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
  }
}
