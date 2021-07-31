package typings.tmiJs.mod

import typings.tmiJs.tmiJsStrings.giftpaidupgrade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubGiftUpgradeUserstate
  extends StObject
     with CommonSubUserstate
     with Userstate {
  
  var `message-type`: js.UndefOr[giftpaidupgrade] = js.undefined
  
  var `msg-param-sender-login`: js.UndefOr[String] = js.undefined
  
  var `msg-param-sender-name`: js.UndefOr[String] = js.undefined
}
object SubGiftUpgradeUserstate {
  
  @scala.inline
  def apply(): SubGiftUpgradeUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubGiftUpgradeUserstate]
  }
  
  @scala.inline
  implicit class SubGiftUpgradeUserstateMutableBuilder[Self <: SubGiftUpgradeUserstate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setMessage-type`(value: giftpaidupgrade): Self = StObject.set(x, "message-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMessage-typeUndefined`: Self = StObject.set(x, "message-type", js.undefined)
    
    @scala.inline
    def `setMsg-param-sender-login`(value: String): Self = StObject.set(x, "msg-param-sender-login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMsg-param-sender-loginUndefined`: Self = StObject.set(x, "msg-param-sender-login", js.undefined)
    
    @scala.inline
    def `setMsg-param-sender-name`(value: String): Self = StObject.set(x, "msg-param-sender-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMsg-param-sender-nameUndefined`: Self = StObject.set(x, "msg-param-sender-name", js.undefined)
  }
}
