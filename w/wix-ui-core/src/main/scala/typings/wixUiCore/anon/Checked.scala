package typings.wixUiCore.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checked extends StObject {
  
  var checked: Requireable[Boolean]
  
  var children: Requireable[ReactNodeLike]
  
  var className: Requireable[String]
  
  var compId: Requireable[String]
  
  var label: Requireable[String]
  
  var link: Requireable[String]
  
  var onChange: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]
  
  var rel: Requireable[String]
  
  var style: Requireable[js.Object]
  
  var tagIndex: Requireable[Double]
  
  var value: Requireable[String]
}
object Checked {
  
  inline def apply(
    checked: Requireable[Boolean],
    children: Requireable[ReactNodeLike],
    className: Requireable[String],
    compId: Requireable[String],
    label: Requireable[String],
    link: Requireable[String],
    onChange: Requireable[js.Function1[/* repeated */ js.Any, js.Any]],
    rel: Requireable[String],
    style: Requireable[js.Object],
    tagIndex: Requireable[Double],
    value: Requireable[String]
  ): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], compId = compId.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tagIndex = tagIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
  
  extension [Self <: Checked](x: Self) {
    
    inline def setChecked(value: Requireable[Boolean]): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Requireable[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCompId(value: Requireable[String]): Self = StObject.set(x, "compId", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Requireable[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLink(value: Requireable[String]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setRel(value: Requireable[String]): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Requireable[js.Object]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTagIndex(value: Requireable[Double]): Self = StObject.set(x, "tagIndex", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Requireable[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
