package typings.vegaLite.buildSrcDataMod

import typings.vegaLite.vegaLiteBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaLite.buildSrcDataMod.DataSource
  - typings.vegaLite.buildSrcDataMod.Generator
*/
trait Data extends StObject
object Data {
  
  inline def GraticuleGenerator(graticule: `true` | GraticuleParams): typings.vegaLite.buildSrcDataMod.GraticuleGenerator = {
    val __obj = js.Dynamic.literal(graticule = graticule.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcDataMod.GraticuleGenerator]
  }
  
  inline def InlineData(values: InlineDataset): typings.vegaLite.buildSrcDataMod.InlineData = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcDataMod.InlineData]
  }
  
  inline def NamedData(name: String): typings.vegaLite.buildSrcDataMod.NamedData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcDataMod.NamedData]
  }
  
  inline def SequenceGenerator(sequence: SequenceParams): typings.vegaLite.buildSrcDataMod.SequenceGenerator = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcDataMod.SequenceGenerator]
  }
  
  inline def SphereGenerator(sphere: `true` | js.Object): typings.vegaLite.buildSrcDataMod.SphereGenerator = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcDataMod.SphereGenerator]
  }
  
  inline def UrlData(url: String): typings.vegaLite.buildSrcDataMod.UrlData = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcDataMod.UrlData]
  }
}
