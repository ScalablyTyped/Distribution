package typings.vegaLite.specBaseMod

import typings.vegaLite.srcDataMod.Data
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
  
  @scala.inline
  def apply(data: Data): DataMixins = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataMixins]
  }
  
  @scala.inline
  implicit class DataMixinsMutableBuilder[Self <: DataMixins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
