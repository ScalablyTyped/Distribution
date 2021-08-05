package typings.vegaLite.srcDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaLite.srcDataMod.CsvDataFormat
  - typings.vegaLite.srcDataMod.DsvDataFormat
  - typings.vegaLite.srcDataMod.JsonDataFormat
  - typings.vegaLite.srcDataMod.TopoDataFormat
*/
trait DataFormat extends StObject
object DataFormat {
  
  inline def CsvDataFormat(): typings.vegaLite.srcDataMod.CsvDataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.vegaLite.srcDataMod.CsvDataFormat]
  }
  
  inline def DsvDataFormat(delimiter: String): typings.vegaLite.srcDataMod.DsvDataFormat = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.srcDataMod.DsvDataFormat]
  }
  
  inline def JsonDataFormat(): typings.vegaLite.srcDataMod.JsonDataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.vegaLite.srcDataMod.JsonDataFormat]
  }
  
  inline def TopoDataFormat(): typings.vegaLite.srcDataMod.TopoDataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.vegaLite.srcDataMod.TopoDataFormat]
  }
}
