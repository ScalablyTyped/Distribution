package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBeaconsSuccess extends StObject {
  
  var beacons: js.Array[Beacon]
  
  var errMsg: String
}
object GetBeaconsSuccess {
  
  @scala.inline
  def apply(beacons: js.Array[Beacon], errMsg: String): GetBeaconsSuccess = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBeaconsSuccess]
  }
  
  @scala.inline
  implicit class GetBeaconsSuccessMutableBuilder[Self <: GetBeaconsSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeacons(value: js.Array[Beacon]): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeaconsVarargs(value: Beacon*): Self = StObject.set(x, "beacons", js.Array(value :_*))
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
