package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomElement extends StObject {
  
  var customElement: Requireable[Any]
  
  var disabled: Requireable[Boolean]
  
  var id: Validator[String | Double]
  
  var link: Requireable[String]
  
  var value: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]
}
object CustomElement {
  
  inline def apply(
    customElement: Requireable[Any],
    disabled: Requireable[Boolean],
    id: Validator[String | Double],
    link: Requireable[String],
    value: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]
  ): CustomElement = {
    val __obj = js.Dynamic.literal(customElement = customElement.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomElement]
  }
  
  extension [Self <: CustomElement](x: Self) {
    
    inline def setCustomElement(value: Requireable[Any]): Self = StObject.set(x, "customElement", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Requireable[Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: Validator[String | Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLink(value: Requireable[String]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
