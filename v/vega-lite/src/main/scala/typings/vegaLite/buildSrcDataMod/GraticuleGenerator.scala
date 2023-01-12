package typings.vegaLite.buildSrcDataMod

import typings.vegaLite.vegaLiteBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraticuleGenerator
  extends StObject
     with GeneratorBase
     with Generator {
  
  /**
    * Generate graticule GeoJSON data for geographic reference lines.
    */
  var graticule: `true` | GraticuleParams
}
object GraticuleGenerator {
  
  inline def apply(graticule: `true` | GraticuleParams): GraticuleGenerator = {
    val __obj = js.Dynamic.literal(graticule = graticule.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraticuleGenerator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraticuleGenerator] (val x: Self) extends AnyVal {
    
    inline def setGraticule(value: `true` | GraticuleParams): Self = StObject.set(x, "graticule", value.asInstanceOf[js.Any])
  }
}
