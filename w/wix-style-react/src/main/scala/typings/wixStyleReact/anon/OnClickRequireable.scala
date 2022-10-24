package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClickRequireable extends StObject {
  
  var label: Requireable[String]
  
  var onClick: Requireable[js.Function1[/* repeated */ Any, Any]]
}
object OnClickRequireable {
  
  inline def apply(label: Requireable[String], onClick: Requireable[js.Function1[/* repeated */ Any, Any]]): OnClickRequireable = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClickRequireable]
  }
  
  extension [Self <: OnClickRequireable](x: Self) {
    
    inline def setLabel(value: Requireable[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
  }
}
