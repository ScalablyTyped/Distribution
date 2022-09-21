package typings.useGestureCore.anon

import typings.useGestureCore.utilsMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Velocity extends StObject {
  
  /**
    * The minimum distance per axis (in pixels) the drag gesture needs to
    * travel to trigger a swipe. Defaults to 50.
    */
  var distance: js.UndefOr[Double | Vector2] = js.undefined
  
  /**
    * The maximum duration in milliseconds that a swipe is detected. Defaults
    * to 250.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum velocity per axis (in pixels / ms) the drag gesture needs to
    * reach before the pointer is released.
    */
  var velocity: js.UndefOr[Double | Vector2] = js.undefined
}
object Velocity {
  
  inline def apply(): Velocity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Velocity]
  }
  
  extension [Self <: Velocity](x: Self) {
    
    inline def setDistance(value: Double | Vector2): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setVelocity(value: Double | Vector2): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
