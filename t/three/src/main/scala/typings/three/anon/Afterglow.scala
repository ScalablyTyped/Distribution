package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Afterglow extends StObject {
  
  var afterglow: Double
  
  var resetPhysicsOnLoop: Boolean
  
  var sync: Boolean
}
object Afterglow {
  
  inline def apply(afterglow: Double, resetPhysicsOnLoop: Boolean, sync: Boolean): Afterglow = {
    val __obj = js.Dynamic.literal(afterglow = afterglow.asInstanceOf[js.Any], resetPhysicsOnLoop = resetPhysicsOnLoop.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Afterglow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Afterglow] (val x: Self) extends AnyVal {
    
    inline def setAfterglow(value: Double): Self = StObject.set(x, "afterglow", value.asInstanceOf[js.Any])
    
    inline def setResetPhysicsOnLoop(value: Boolean): Self = StObject.set(x, "resetPhysicsOnLoop", value.asInstanceOf[js.Any])
    
    inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
  }
}
