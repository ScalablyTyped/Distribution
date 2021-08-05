package typings.vegaLite.srcDataMod

import typings.vegaLite.vegaLiteBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaLite.srcDataMod.DataSource
  - typings.vegaLite.srcDataMod.Generator
*/
trait Data extends StObject
object Data {
  
  inline def GraticuleGenerator(graticule: `true` | GraticuleParams): typings.vegaLite.srcDataMod.GraticuleGenerator = {
    val __obj = js.Dynamic.literal(graticule = graticule.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.srcDataMod.GraticuleGenerator]
  }
  
  inline def InlineData(values: InlineDataset): typings.vegaLite.srcDataMod.InlineData = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.srcDataMod.InlineData]
  }
  
  inline def NamedData(name: String): typings.vegaLite.srcDataMod.NamedData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.srcDataMod.NamedData]
  }
  
  inline def SequenceGenerator(sequence: SequenceParams): typings.vegaLite.srcDataMod.SequenceGenerator = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.srcDataMod.SequenceGenerator]
  }
  
  inline def SphereGenerator(sphere: `true` | js.Object): typings.vegaLite.srcDataMod.SphereGenerator = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.srcDataMod.SphereGenerator]
  }
  
  inline def UrlData(url: String): typings.vegaLite.srcDataMod.UrlData = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.srcDataMod.UrlData]
  }
}
