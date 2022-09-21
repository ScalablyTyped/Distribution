package typings.tmiJs.mod

import typings.tmiJs.tmiJsStrings.anonsubmysterygift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnonSubMysteryGiftUserstate
  extends StObject
     with CommonSubUserstate {
  
  var `message-type`: js.UndefOr[anonsubmysterygift] = js.undefined
}
object AnonSubMysteryGiftUserstate {
  
  inline def apply(): AnonSubMysteryGiftUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSubMysteryGiftUserstate]
  }
  
  extension [Self <: AnonSubMysteryGiftUserstate](x: Self) {
    
    inline def `setMessage-type`(value: anonsubmysterygift): Self = StObject.set(x, "message-type", value.asInstanceOf[js.Any])
    
    inline def `setMessage-typeUndefined`: Self = StObject.set(x, "message-type", js.undefined)
  }
}
