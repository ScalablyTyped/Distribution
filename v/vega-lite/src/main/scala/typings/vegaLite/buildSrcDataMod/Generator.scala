package typings.vegaLite.buildSrcDataMod

import typings.vegaLite.vegaLiteBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaLite.buildSrcDataMod.SequenceGenerator
  - typings.vegaLite.buildSrcDataMod.SphereGenerator
  - typings.vegaLite.buildSrcDataMod.GraticuleGenerator
*/
trait Generator
  extends StObject
     with Data
object Generator {
  
  inline def GraticuleGenerator(graticule: `true` | GraticuleParams): typings.vegaLite.buildSrcDataMod.GraticuleGenerator = {
    val __obj = js.Dynamic.literal(graticule = graticule.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcDataMod.GraticuleGenerator]
  }
  
  inline def SequenceGenerator(sequence: SequenceParams): typings.vegaLite.buildSrcDataMod.SequenceGenerator = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcDataMod.SequenceGenerator]
  }
  
  inline def SphereGenerator(sphere: `true` | js.Object): typings.vegaLite.buildSrcDataMod.SphereGenerator = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcDataMod.SphereGenerator]
  }
}
