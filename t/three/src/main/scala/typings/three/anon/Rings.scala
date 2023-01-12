package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rings extends StObject {
  
  var rings: Double
  
  var samples: Double
}
object Rings {
  
  inline def apply(rings: Double, samples: Double): Rings = {
    val __obj = js.Dynamic.literal(rings = rings.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rings] (val x: Self) extends AnyVal {
    
    inline def setRings(value: Double): Self = StObject.set(x, "rings", value.asInstanceOf[js.Any])
    
    inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
  }
}
