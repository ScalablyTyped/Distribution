package typings.vegaLite.srcDataMod

import typings.vegaLite.vegaLiteBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SphereGenerator
  extends Generator
     with GeneratorBase {
  
  /**
    * Generate sphere GeoJSON data for the full globe.
    */
  var sphere: `true` | js.Object = js.native
}
object SphereGenerator {
  
  @scala.inline
  def apply(sphere: `true` | js.Object): SphereGenerator = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[SphereGenerator]
  }
  
  @scala.inline
  implicit class SphereGeneratorMutableBuilder[Self <: SphereGenerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSphere(value: `true` | js.Object): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
  }
}
