package typings.vegaLite.buildSrcDataMod

import typings.vegaLite.vegaLiteBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SphereGenerator
  extends StObject
     with GeneratorBase
     with Generator {
  
  /**
    * Generate sphere GeoJSON data for the full globe.
    */
  var sphere: `true` | js.Object
}
object SphereGenerator {
  
  inline def apply(sphere: `true` | js.Object): SphereGenerator = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[SphereGenerator]
  }
  
  extension [Self <: SphereGenerator](x: Self) {
    
    inline def setSphere(value: `true` | js.Object): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
  }
}
