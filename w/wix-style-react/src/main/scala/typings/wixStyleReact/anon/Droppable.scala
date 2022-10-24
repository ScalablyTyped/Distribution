package typings.wixStyleReact.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Droppable extends StObject {
  
  var actions: Requireable[js.Array[js.UndefOr[InferProps[OnClickPrefixIcon] | Null]]]
  
  var active: Requireable[Boolean]
  
  var disabled: Requireable[Boolean]
  
  var droppable: Requireable[Boolean]
  
  var items: Validator[js.Array[js.UndefOr[InferProps[ContentDisabled] | Null]]]
  
  var subtitle: Validator[String]
  
  var title: Validator[String]
}
object Droppable {
  
  inline def apply(
    actions: Requireable[js.Array[js.UndefOr[InferProps[OnClickPrefixIcon] | Null]]],
    active: Requireable[Boolean],
    disabled: Requireable[Boolean],
    droppable: Requireable[Boolean],
    items: Validator[js.Array[js.UndefOr[InferProps[ContentDisabled] | Null]]],
    subtitle: Validator[String],
    title: Validator[String]
  ): Droppable = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], droppable = droppable.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Droppable]
  }
  
  extension [Self <: Droppable](x: Self) {
    
    inline def setActions(value: Requireable[js.Array[js.UndefOr[InferProps[OnClickPrefixIcon] | Null]]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActive(value: Requireable[Boolean]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Requireable[Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDroppable(value: Requireable[Boolean]): Self = StObject.set(x, "droppable", value.asInstanceOf[js.Any])
    
    inline def setItems(value: Validator[js.Array[js.UndefOr[InferProps[ContentDisabled] | Null]]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: Validator[String]): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Validator[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
