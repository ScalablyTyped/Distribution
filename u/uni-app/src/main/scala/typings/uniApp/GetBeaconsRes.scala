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
  
  @scala.inline
  def apply(): GetBeaconsRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBeaconsRes]
  }
  
  @scala.inline
  implicit class GetBeaconsResMutableBuilder[Self <: GetBeaconsRes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeacons(value: js.Array[Beacon]): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeaconsUndefined: Self = StObject.set(x, "beacons", js.undefined)
    
    @scala.inline
    def setBeaconsVarargs(value: Beacon*): Self = StObject.set(x, "beacons", js.Array(value :_*))
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
  }
}
