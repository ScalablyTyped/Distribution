package typings.vegaLite.buildSrcSpecBaseMod

import typings.vegaLite.buildSrcDataMod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataMixins extends StObject {
  
  /**
    * An object describing the data source.
    */
  var data: Data
}
object DataMixins {
  
  inline def apply(data: Data): DataMixins = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataMixins]
  }
  
  extension [Self <: DataMixins](x: Self) {
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
