package typings.tmiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonGiftSubUserstate
  extends StObject
     with CommonSubUserstate {
  
  var `msg-param-months`: js.UndefOr[Boolean | String] = js.undefined
  
  var `msg-param-recipient-display-name`: js.UndefOr[String] = js.undefined
  
  var `msg-param-recipient-id`: js.UndefOr[String] = js.undefined
  
  var `msg-param-recipient-user-name`: js.UndefOr[String] = js.undefined
}
object CommonGiftSubUserstate {
  
  @scala.inline
  def apply(): CommonGiftSubUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonGiftSubUserstate]
  }
  
  @scala.inline
  implicit class CommonGiftSubUserstateMutableBuilder[Self <: CommonGiftSubUserstate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setMsg-param-months`(value: Boolean | String): Self = StObject.set(x, "msg-param-months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMsg-param-monthsUndefined`: Self = StObject.set(x, "msg-param-months", js.undefined)
    
    @scala.inline
    def `setMsg-param-recipient-display-name`(value: String): Self = StObject.set(x, "msg-param-recipient-display-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMsg-param-recipient-display-nameUndefined`: Self = StObject.set(x, "msg-param-recipient-display-name", js.undefined)
    
    @scala.inline
    def `setMsg-param-recipient-id`(value: String): Self = StObject.set(x, "msg-param-recipient-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMsg-param-recipient-idUndefined`: Self = StObject.set(x, "msg-param-recipient-id", js.undefined)
    
    @scala.inline
    def `setMsg-param-recipient-user-name`(value: String): Self = StObject.set(x, "msg-param-recipient-user-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMsg-param-recipient-user-nameUndefined`: Self = StObject.set(x, "msg-param-recipient-user-name", js.undefined)
  }
}
