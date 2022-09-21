package typings.vegaLite.srcDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedData
  extends StObject
     with DataBase
     with DataSource {
  
  /**
    * Provide a placeholder name and bind data at runtime.
    *
    * New data may change the layout but Vega does not always resize the chart. To update the layout when the data updates, set [autosize](https://vega.github.io/vega-lite/docs/size.html#autosize) or explicitly use [view.resize](https://vega.github.io/vega/docs/api/view/#view_resize).
    */
  @JSName("name")
  var name_NamedData: String
}
object NamedData {
  
  inline def apply(name: String): NamedData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedData]
  }
  
  extension [Self <: NamedData](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
