package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Created extends StObject {
  
  var created: typings.wxServerSdk.wxServerSdkInts.`0` | typings.wxServerSdk.wxServerSdkInts.`1`
  
  var updated: typings.wxServerSdk.wxServerSdkInts.`0` | typings.wxServerSdk.wxServerSdkInts.`1`
}
object Created {
  
  inline def apply(
    created: typings.wxServerSdk.wxServerSdkInts.`0` | typings.wxServerSdk.wxServerSdkInts.`1`,
    updated: typings.wxServerSdk.wxServerSdkInts.`0` | typings.wxServerSdk.wxServerSdkInts.`1`
  ): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
  
  extension [Self <: Created](x: Self) {
    
    inline def setCreated(value: typings.wxServerSdk.wxServerSdkInts.`0` | typings.wxServerSdk.wxServerSdkInts.`1`): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: typings.wxServerSdk.wxServerSdkInts.`0` | typings.wxServerSdk.wxServerSdkInts.`1`): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
