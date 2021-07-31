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
  
  @scala.inline
  def apply(all: scala.Double, queued: scala.Double, running: scala.Double): Queued = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queued]
  }
  
  @scala.inline
  implicit class QueuedMutableBuilder[Self <: Queued] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueued(value: scala.Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunning(value: scala.Double): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
  }
}
