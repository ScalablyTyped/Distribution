package typings.xummSdk.anon

import typings.xummSdk.distSrcTypesXummApiMod.XummCancelReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancelled extends StObject {
  
  var cancelled: Boolean
  
  var reason: XummCancelReason
}
object Cancelled {
  
  inline def apply(cancelled: Boolean, reason: XummCancelReason): Cancelled = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cancelled] (val x: Self) extends AnyVal {
    
    inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setReason(value: XummCancelReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
