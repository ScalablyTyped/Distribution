package typings.vegaLite.srcDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineData
  extends StObject
     with DataBase
     with DataSource {
  
  /**
    * The full data set, included inline. This can be an array of objects or primitive values, an object, or a string.
    * Arrays of primitive values are ingested as objects with a `data` property. Strings are parsed according to the specified format type.
    */
  var values: InlineDataset
}
object InlineData {
  
  @scala.inline
  def apply(values: InlineDataset): InlineData = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineData]
  }
  
  @scala.inline
  implicit class InlineDataMutableBuilder[Self <: InlineData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: InlineDataset): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: (Boolean | Double | js.Object | String)*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
