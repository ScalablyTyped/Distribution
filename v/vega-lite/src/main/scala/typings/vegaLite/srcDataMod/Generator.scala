package typings.vegaLite.srcDataMod

import typings.vegaLite.vegaLiteBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaLite.srcDataMod.SequenceGenerator
  - typings.vegaLite.srcDataMod.SphereGenerator
  - typings.vegaLite.srcDataMod.GraticuleGenerator
*/
trait Generator
  extends StObject
     with Data
object Generator {
  
  inline def GraticuleGenerator(graticule: `true` | GraticuleParams): typings.vegaLite.srcDataMod.GraticuleGenerator = {
    val __obj = js.Dynamic.literal(graticule = graticule.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.srcDataMod.GraticuleGenerator]
  }
  
  inline def SequenceGenerator(sequence: SequenceParams): typings.vegaLite.srcDataMod.SequenceGenerator = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.srcDataMod.SequenceGenerator]
  }
  
  inline def SphereGenerator(sphere: `true` | js.Object): typings.vegaLite.srcDataMod.SphereGenerator = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.srcDataMod.SphereGenerator]
  }
}
