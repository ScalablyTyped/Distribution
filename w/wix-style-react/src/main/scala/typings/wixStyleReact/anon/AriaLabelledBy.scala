package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaLabelledBy extends StObject {
  
  var ariaLabel: Requireable[String]
  
  var ariaLabelledBy: Requireable[String]
  
  var caption: Requireable[ReactNodeLike]
  
  var className: Requireable[String]
  
  var dataHook: Requireable[String]
  
  var onChange: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var options: Requireable[js.Array[Any]]
  
  var selectedId: Requireable[Double]
}
object AriaLabelledBy {
  
  inline def apply(
    ariaLabel: Requireable[String],
    ariaLabelledBy: Requireable[String],
    caption: Requireable[ReactNodeLike],
    className: Requireable[String],
    dataHook: Requireable[String],
    onChange: Requireable[js.Function1[/* repeated */ Any, Any]],
    options: Requireable[js.Array[Any]],
    selectedId: Requireable[Double]
  ): AriaLabelledBy = {
    val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], ariaLabelledBy = ariaLabelledBy.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectedId = selectedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaLabelledBy]
  }
  
  extension [Self <: AriaLabelledBy](x: Self) {
    
    inline def setAriaLabel(value: Requireable[String]): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelledBy(value: Requireable[String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Requireable[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Requireable[String]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Requireable[js.Array[Any]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSelectedId(value: Requireable[Double]): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
  }
}
