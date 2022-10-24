package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideStyle extends StObject {
  
  var disabled: Requireable[Boolean]
  
  var id: Validator[String | Double]
  
  var overrideStyle: Requireable[Boolean]
  
  var value: Validator[
    String | Double | Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactElementLike | ReactNodeArray
  ]
}
object OverrideStyle {
  
  inline def apply(
    disabled: Requireable[Boolean],
    id: Validator[String | Double],
    overrideStyle: Requireable[Boolean],
    value: Validator[
      String | Double | Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactElementLike | ReactNodeArray
    ]
  ): OverrideStyle = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], overrideStyle = overrideStyle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideStyle]
  }
  
  extension [Self <: OverrideStyle](x: Self) {
    
    inline def setDisabled(value: Requireable[Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: Validator[String | Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOverrideStyle(value: Requireable[Boolean]): Self = StObject.set(x, "overrideStyle", value.asInstanceOf[js.Any])
    
    inline def setValue(
      value: Validator[
          String | Double | Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactElementLike | ReactNodeArray
        ]
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
