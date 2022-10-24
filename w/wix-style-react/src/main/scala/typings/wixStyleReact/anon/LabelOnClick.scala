package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelOnClick extends StObject {
  
  /** Label of secondary action text button */
  var label: Requireable[ReactNodeLike]
  
  /** On click handler of secondary action text button */
  var onClick: Requireable[js.Function1[/* repeated */ Any, Any]]
}
object LabelOnClick {
  
  inline def apply(label: Requireable[ReactNodeLike], onClick: Requireable[js.Function1[/* repeated */ Any, Any]]): LabelOnClick = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOnClick]
  }
  
  extension [Self <: LabelOnClick](x: Self) {
    
    inline def setLabel(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
  }
}
