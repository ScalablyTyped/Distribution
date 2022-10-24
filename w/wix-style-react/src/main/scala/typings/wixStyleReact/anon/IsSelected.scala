package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsSelected extends StObject {
  
  var isSelected: Requireable[Boolean]
  
  var title: Validator[String]
}
object IsSelected {
  
  inline def apply(isSelected: Requireable[Boolean], title: Validator[String]): IsSelected = {
    val __obj = js.Dynamic.literal(isSelected = isSelected.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSelected]
  }
  
  extension [Self <: IsSelected](x: Self) {
    
    inline def setIsSelected(value: Requireable[Boolean]): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Validator[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
