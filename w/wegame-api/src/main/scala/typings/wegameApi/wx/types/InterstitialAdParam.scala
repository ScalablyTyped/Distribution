package typings.wegameApi.wx.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterstitialAdParam extends StObject {
  
  /**
    * 广告单元 id
    */
  var adUnitId: String
}
object InterstitialAdParam {
  
  inline def apply(adUnitId: String): InterstitialAdParam = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterstitialAdParam]
  }
  
  extension [Self <: InterstitialAdParam](x: Self) {
    
    inline def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
  }
}
