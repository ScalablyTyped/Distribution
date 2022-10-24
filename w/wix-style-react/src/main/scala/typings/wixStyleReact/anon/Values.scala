package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Values extends StObject {
  
  var label: Requireable[ReactNodeLike]
  
  var values: Requireable[js.Array[js.UndefOr[Double | Null]]]
}
object Values {
  
  inline def apply(label: Requireable[ReactNodeLike], values: Requireable[js.Array[js.UndefOr[Double | Null]]]): Values = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values]
  }
  
  extension [Self <: Values](x: Self) {
    
    inline def setLabel(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Requireable[js.Array[js.UndefOr[Double | Null]]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
