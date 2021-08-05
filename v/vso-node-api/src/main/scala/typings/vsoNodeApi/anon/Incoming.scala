package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Incoming extends StObject {
  
  var inProgress: scala.Double
  
  var incoming: scala.Double
  
  var outgoing: scala.Double
}
object Incoming {
  
  inline def apply(inProgress: scala.Double, incoming: scala.Double, outgoing: scala.Double): Incoming = {
    val __obj = js.Dynamic.literal(inProgress = inProgress.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Incoming]
  }
  
  extension [Self <: Incoming](x: Self) {
    
    inline def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    inline def setIncoming(value: scala.Double): Self = StObject.set(x, "incoming", value.asInstanceOf[js.Any])
    
    inline def setOutgoing(value: scala.Double): Self = StObject.set(x, "outgoing", value.asInstanceOf[js.Any])
  }
}
