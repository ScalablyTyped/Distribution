package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var removed: typings.wxServerSdk.wxServerSdkInts.`0` | typings.wxServerSdk.wxServerSdkInts.`1`
}
object `1` {
  
  inline def apply(removed: typings.wxServerSdk.wxServerSdkInts.`0` | typings.wxServerSdk.wxServerSdkInts.`1`): `1` = {
    val __obj = js.Dynamic.literal(removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setRemoved(value: typings.wxServerSdk.wxServerSdkInts.`0` | typings.wxServerSdk.wxServerSdkInts.`1`): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
  }
}
