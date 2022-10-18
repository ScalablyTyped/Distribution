package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatedNumber extends StObject {
  
  var updated: Double
}
object UpdatedNumber {
  
  inline def apply(updated: Double): UpdatedNumber = {
    val __obj = js.Dynamic.literal(updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedNumber]
  }
  
  extension [Self <: UpdatedNumber](x: Self) {
    
    inline def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
