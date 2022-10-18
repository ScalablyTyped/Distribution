package typings.vueReactivity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * wasTracked and newTracked maintain the status for several levels of effect
  * tracking recursion. One bit per level is used to define whether the dependency
  * was/is tracked.
  */
trait TrackedMarkers extends StObject {
  
  /**
    * newTracked
    */
  var n: Double
  
  /**
    * wasTracked
    */
  var w: Double
}
object TrackedMarkers {
  
  inline def apply(n: Double, w: Double): TrackedMarkers = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackedMarkers]
  }
  
  extension [Self <: TrackedMarkers](x: Self) {
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}
