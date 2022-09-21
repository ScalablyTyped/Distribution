package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBeaconsRes extends StObject {
  
  /**
    * 接口调用成功的回调函数
    */
  var beacons: js.UndefOr[js.Array[Beacon]] = js.undefined
  
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[String] = js.undefined
}
object GetBeaconsRes {
  
  inline def apply(): GetBeaconsRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBeaconsRes]
  }
  
  extension [Self <: GetBeaconsRes](x: Self) {
    
    inline def setBeacons(value: js.Array[Beacon]): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
    
    inline def setBeaconsUndefined: Self = StObject.set(x, "beacons", js.undefined)
    
    inline def setBeaconsVarargs(value: Beacon*): Self = StObject.set(x, "beacons", js.Array(value*))
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
  }
}
