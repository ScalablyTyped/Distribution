package typings.wxServerSdk.anon

import typings.wxServerSdk.wxServerSdkInts.`0`
import typings.wxServerSdk.wxServerSdkInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Updated extends StObject {
  
  var updated: `0` | `1`
}
object Updated {
  
  inline def apply(updated: `0` | `1`): Updated = {
    val __obj = js.Dynamic.literal(updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Updated]
  }
  
  extension [Self <: Updated](x: Self) {
    
    inline def setUpdated(value: `0` | `1`): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
