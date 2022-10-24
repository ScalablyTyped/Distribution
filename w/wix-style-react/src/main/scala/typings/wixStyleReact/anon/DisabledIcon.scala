package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledIcon extends StObject {
  
  var disabled: Requireable[Boolean]
  
  var icon: Requireable[ReactNodeLike]
  
  var id: Requireable[String | Double]
  
  var label: Requireable[String]
  
  var onClick: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var sectionTitle: Requireable[String]
}
object DisabledIcon {
  
  inline def apply(
    disabled: Requireable[Boolean],
    icon: Requireable[ReactNodeLike],
    id: Requireable[String | Double],
    label: Requireable[String],
    onClick: Requireable[js.Function1[/* repeated */ Any, Any]],
    sectionTitle: Requireable[String]
  ): DisabledIcon = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], sectionTitle = sectionTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledIcon]
  }
  
  extension [Self <: DisabledIcon](x: Self) {
    
    inline def setDisabled(value: Requireable[Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setId(value: Requireable[String | Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Requireable[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setSectionTitle(value: Requireable[String]): Self = StObject.set(x, "sectionTitle", value.asInstanceOf[js.Any])
  }
}
