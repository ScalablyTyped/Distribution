package typings.tmiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonSubUserstate
  extends StObject
     with UserNoticeState {
  
  var `msg-param-sub-plan`: js.UndefOr[SubMethod] = js.undefined
  
  var `msg-param-sub-plan-name`: js.UndefOr[String] = js.undefined
}
object CommonSubUserstate {
  
  @scala.inline
  def apply(): CommonSubUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonSubUserstate]
  }
  
  @scala.inline
  implicit class CommonSubUserstateMutableBuilder[Self <: CommonSubUserstate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setMsg-param-sub-plan`(value: SubMethod): Self = StObject.set(x, "msg-param-sub-plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMsg-param-sub-plan-name`(value: String): Self = StObject.set(x, "msg-param-sub-plan-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMsg-param-sub-plan-nameUndefined`: Self = StObject.set(x, "msg-param-sub-plan-name", js.undefined)
    
    @scala.inline
    def `setMsg-param-sub-planUndefined`: Self = StObject.set(x, "msg-param-sub-plan", js.undefined)
  }
}
