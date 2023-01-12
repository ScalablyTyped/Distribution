package typings.tmiJs.mod

import typings.tmiJs.tmiJsStrings.raid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaidUserstate
  extends StObject
     with UserNoticeState
     with Userstate {
  
  var `message-type`: js.UndefOr[raid] = js.undefined
  
  var `msg-param-displayName`: js.UndefOr[String] = js.undefined
  
  var `msg-param-login`: js.UndefOr[String] = js.undefined
  
  var `msg-param-viewerCount`: js.UndefOr[String] = js.undefined
}
object RaidUserstate {
  
  inline def apply(): RaidUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RaidUserstate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RaidUserstate] (val x: Self) extends AnyVal {
    
    inline def `setMessage-type`(value: raid): Self = StObject.set(x, "message-type", value.asInstanceOf[js.Any])
    
    inline def `setMessage-typeUndefined`: Self = StObject.set(x, "message-type", js.undefined)
    
    inline def `setMsg-param-displayName`(value: String): Self = StObject.set(x, "msg-param-displayName", value.asInstanceOf[js.Any])
    
    inline def `setMsg-param-displayNameUndefined`: Self = StObject.set(x, "msg-param-displayName", js.undefined)
    
    inline def `setMsg-param-login`(value: String): Self = StObject.set(x, "msg-param-login", value.asInstanceOf[js.Any])
    
    inline def `setMsg-param-loginUndefined`: Self = StObject.set(x, "msg-param-login", js.undefined)
    
    inline def `setMsg-param-viewerCount`(value: String): Self = StObject.set(x, "msg-param-viewerCount", value.asInstanceOf[js.Any])
    
    inline def `setMsg-param-viewerCountUndefined`: Self = StObject.set(x, "msg-param-viewerCount", js.undefined)
  }
}
