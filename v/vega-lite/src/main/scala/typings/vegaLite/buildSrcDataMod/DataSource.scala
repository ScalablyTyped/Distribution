package typings.vegaLite.buildSrcDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaLite.buildSrcDataMod.UrlData
  - typings.vegaLite.buildSrcDataMod.InlineData
  - typings.vegaLite.buildSrcDataMod.NamedData
*/
trait DataSource
  extends StObject
     with Data
object DataSource {
  
  inline def InlineData(values: InlineDataset): typings.vegaLite.buildSrcDataMod.InlineData = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcDataMod.InlineData]
  }
  
  inline def NamedData(name: String): typings.vegaLite.buildSrcDataMod.NamedData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcDataMod.NamedData]
  }
  
  inline def UrlData(url: String): typings.vegaLite.buildSrcDataMod.UrlData = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcDataMod.UrlData]
  }
}
