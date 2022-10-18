package typings.wxServerSdk.anon

import typings.wxServerSdk.wxServerSdkInts.`0`
import typings.wxServerSdk.wxServerSdkInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Removed extends StObject {
  
  var removed: `0` | `1`
}
object Removed {
  
  inline def apply(removed: `0` | `1`): Removed = {
    val __obj = js.Dynamic.literal(removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Removed]
  }
  
  extension [Self <: Removed](x: Self) {
    
    inline def setRemoved(value: `0` | `1`): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
  }
}
