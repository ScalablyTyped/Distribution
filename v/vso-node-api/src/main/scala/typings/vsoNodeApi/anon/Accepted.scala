package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accepted extends StObject {
  
  var accepted: scala.Double
  
  var open: scala.Double
  
  var rejected: scala.Double
}
object Accepted {
  
  inline def apply(accepted: scala.Double, open: scala.Double, rejected: scala.Double): Accepted = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accepted]
  }
  
  extension [Self <: Accepted](x: Self) {
    
    inline def setAccepted(value: scala.Double): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: scala.Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setRejected(value: scala.Double): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
  }
}
