package typings.vuedraggable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Clone extends StObject {
    
    @JSName("clone")
    var clone_FClone: Any
    
    var componentData: Any
    
    var list: js.Array[Any]
    
    var move: Any
    
    var noTransitionOnDrag: js.UndefOr[Boolean] = js.undefined
    
    var options: Any
    
    var tag: js.UndefOr[String | Null] = js.undefined
    
    var value: js.Array[Any]
  }
  object Clone {
    
    inline def apply(
      clone_ : Any,
      componentData: Any,
      list: js.Array[Any],
      move: Any,
      options: Any,
      value: js.Array[Any]
    ): Clone = {
      val __obj = js.Dynamic.literal(componentData = componentData.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("clone")(clone_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Clone]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Clone] (val x: Self) extends AnyVal {
      
      inline def setClone_(value: Any): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setComponentData(value: Any): Self = StObject.set(x, "componentData", value.asInstanceOf[js.Any])
      
      inline def setList(value: js.Array[Any]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListVarargs(value: Any*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setMove(value: Any): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      inline def setNoTransitionOnDrag(value: Boolean): Self = StObject.set(x, "noTransitionOnDrag", value.asInstanceOf[js.Any])
      
      inline def setNoTransitionOnDragUndefined: Self = StObject.set(x, "noTransitionOnDrag", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagNull: Self = StObject.set(x, "tag", null)
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
