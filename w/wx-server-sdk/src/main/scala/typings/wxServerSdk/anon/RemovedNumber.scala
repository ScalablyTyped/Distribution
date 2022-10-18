package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemovedNumber extends StObject {
  
  var removed: Double
}
object RemovedNumber {
  
  inline def apply(removed: Double): RemovedNumber = {
    val __obj = js.Dynamic.literal(removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovedNumber]
  }
  
  extension [Self <: RemovedNumber](x: Self) {
    
    inline def setRemoved(value: Double): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
  }
}
