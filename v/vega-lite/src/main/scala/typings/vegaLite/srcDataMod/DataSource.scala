package typings.vegaLite.srcDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaLite.srcDataMod.UrlData
  - typings.vegaLite.srcDataMod.InlineData
  - typings.vegaLite.srcDataMod.NamedData
*/
trait DataSource
  extends StObject
     with Data
object DataSource {
  
  inline def InlineData(values: InlineDataset): typings.vegaLite.srcDataMod.InlineData = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.srcDataMod.InlineData]
  }
  
  inline def NamedData(name: String): typings.vegaLite.srcDataMod.NamedData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.srcDataMod.NamedData]
  }
  
  inline def UrlData(url: String): typings.vegaLite.srcDataMod.UrlData = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.srcDataMod.UrlData]
  }
}
