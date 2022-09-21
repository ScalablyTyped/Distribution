package typings.tmiJs.mod

import typings.tmiJs.tmiJsStrings.primepaidupgrade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrimeUpgradeUserstate
  extends StObject
     with CommonSubUserstate {
  
  var `message-type`: js.UndefOr[primepaidupgrade] = js.undefined
}
object PrimeUpgradeUserstate {
  
  inline def apply(): PrimeUpgradeUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimeUpgradeUserstate]
  }
  
  extension [Self <: PrimeUpgradeUserstate](x: Self) {
    
    inline def `setMessage-type`(value: primepaidupgrade): Self = StObject.set(x, "message-type", value.asInstanceOf[js.Any])
    
    inline def `setMessage-typeUndefined`: Self = StObject.set(x, "message-type", js.undefined)
  }
}
