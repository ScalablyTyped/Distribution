package typings.wixStyleReact.anon

import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DividerValidator extends StObject {
  
  var divider: Validator[Boolean]
}
object DividerValidator {
  
  inline def apply(divider: Validator[Boolean]): DividerValidator = {
    val __obj = js.Dynamic.literal(divider = divider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DividerValidator]
  }
  
  extension [Self <: DividerValidator](x: Self) {
    
    inline def setDivider(value: Validator[Boolean]): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
  }
}
