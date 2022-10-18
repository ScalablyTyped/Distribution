package typings.wxServerSdk.anon

import typings.wxServerSdk.wxServerSdkInts.`0`
import typings.wxServerSdk.wxServerSdkInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Created extends StObject {
  
  var created: `0` | `1`
  
  var updated: `0` | `1`
}
object Created {
  
  inline def apply(created: `0` | `1`, updated: `0` | `1`): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
  
  extension [Self <: Created](x: Self) {
    
    inline def setCreated(value: `0` | `1`): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: `0` | `1`): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
