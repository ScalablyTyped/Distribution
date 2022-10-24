package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentDisabled extends StObject {
  
  var content: Validator[
    String | Double | Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactElementLike | ReactNodeArray
  ]
  
  var disabled: Requireable[Boolean]
  
  var draggable: Requireable[Boolean]
}
object ContentDisabled {
  
  inline def apply(
    content: Validator[
      String | Double | Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactElementLike | ReactNodeArray
    ],
    disabled: Requireable[Boolean],
    draggable: Requireable[Boolean]
  ): ContentDisabled = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentDisabled]
  }
  
  extension [Self <: ContentDisabled](x: Self) {
    
    inline def setContent(
      value: Validator[
          String | Double | Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactElementLike | ReactNodeArray
        ]
    ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Requireable[Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDraggable(value: Requireable[Boolean]): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
  }
}
