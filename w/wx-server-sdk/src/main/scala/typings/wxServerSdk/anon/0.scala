package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var updated: typings.wxServerSdk.wxServerSdkInts.`0` | typings.wxServerSdk.wxServerSdkInts.`1`
}
object `0` {
  
  inline def apply(updated: typings.wxServerSdk.wxServerSdkInts.`0` | typings.wxServerSdk.wxServerSdkInts.`1`): `0` = {
    val __obj = js.Dynamic.literal(updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setUpdated(value: typings.wxServerSdk.wxServerSdkInts.`0` | typings.wxServerSdk.wxServerSdkInts.`1`): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
