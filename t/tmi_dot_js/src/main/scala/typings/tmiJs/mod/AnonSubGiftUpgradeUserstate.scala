package typings.tmiJs.mod

import typings.tmiJs.tmiJsStrings.anongiftpaidupgrade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnonSubGiftUpgradeUserstate
  extends StObject
     with CommonSubUserstate
     with Userstate {
  
  var `message-type`: js.UndefOr[anongiftpaidupgrade] = js.undefined
}
object AnonSubGiftUpgradeUserstate {
  
  @scala.inline
  def apply(): AnonSubGiftUpgradeUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSubGiftUpgradeUserstate]
  }
  
  @scala.inline
  implicit class AnonSubGiftUpgradeUserstateMutableBuilder[Self <: AnonSubGiftUpgradeUserstate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setMessage-type`(value: anongiftpaidupgrade): Self = StObject.set(x, "message-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMessage-typeUndefined`: Self = StObject.set(x, "message-type", js.undefined)
  }
}
