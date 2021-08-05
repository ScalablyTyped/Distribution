package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Queued extends StObject {
  
  var all: scala.Double
  
  var queued: scala.Double
  
  var running: scala.Double
}
object Queued {
  
  inline def apply(all: scala.Double, queued: scala.Double, running: scala.Double): Queued = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queued]
  }
  
  extension [Self <: Queued](x: Self) {
    
    inline def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setQueued(value: scala.Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    inline def setRunning(value: scala.Double): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
  }
}
