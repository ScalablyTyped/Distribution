package typings.vegaLite.buildSrcDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaLite.buildSrcDataMod.CsvDataFormat
  - typings.vegaLite.buildSrcDataMod.DsvDataFormat
  - typings.vegaLite.buildSrcDataMod.JsonDataFormat
  - typings.vegaLite.buildSrcDataMod.TopoDataFormat
*/
trait DataFormat extends StObject
object DataFormat {
  
  inline def CsvDataFormat(): typings.vegaLite.buildSrcDataMod.CsvDataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.vegaLite.buildSrcDataMod.CsvDataFormat]
  }
  
  inline def DsvDataFormat(delimiter: String): typings.vegaLite.buildSrcDataMod.DsvDataFormat = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcDataMod.DsvDataFormat]
  }
  
  inline def JsonDataFormat(): typings.vegaLite.buildSrcDataMod.JsonDataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.vegaLite.buildSrcDataMod.JsonDataFormat]
  }
  
  inline def TopoDataFormat(): typings.vegaLite.buildSrcDataMod.TopoDataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.vegaLite.buildSrcDataMod.TopoDataFormat]
  }
}
