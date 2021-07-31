package typings.tmiJs.mod

import typings.tmiJs.tmiJsStrings.anonsubgift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnonSubGiftUserstate
  extends StObject
     with CommonGiftSubUserstate
     with Userstate {
  
  var `message-type`: js.UndefOr[anonsubgift] = js.undefined
}
object AnonSubGiftUserstate {
  
  @scala.inline
  def apply(): AnonSubGiftUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSubGiftUserstate]
  }
  
  @scala.inline
  implicit class AnonSubGiftUserstateMutableBuilder[Self <: AnonSubGiftUserstate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setMessage-type`(value: anonsubgift): Self = StObject.set(x, "message-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMessage-typeUndefined`: Self = StObject.set(x, "message-type", js.undefined)
  }
}
