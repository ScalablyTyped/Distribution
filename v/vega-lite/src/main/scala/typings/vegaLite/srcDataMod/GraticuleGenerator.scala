package typings.vegaLite.srcDataMod

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
  
  @scala.inline
  def apply(graticule: `true` | GraticuleParams): GraticuleGenerator = {
    val __obj = js.Dynamic.literal(graticule = graticule.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraticuleGenerator]
  }
  
  @scala.inline
  implicit class GraticuleGeneratorMutableBuilder[Self <: GraticuleGenerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraticule(value: `true` | GraticuleParams): Self = StObject.set(x, "graticule", value.asInstanceOf[js.Any])
  }
}
