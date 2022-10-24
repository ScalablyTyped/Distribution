package typings.wixStyleReact.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelButtonLabel extends StObject {
  
  var cancelButtonLabel: Requireable[String]
  
  var confirmButtonLabel: Requireable[String]
  
  var link: Requireable[InferProps[TextInputPlaceholder]]
}
object CancelButtonLabel {
  
  inline def apply(
    cancelButtonLabel: Requireable[String],
    confirmButtonLabel: Requireable[String],
    link: Requireable[InferProps[TextInputPlaceholder]]
  ): CancelButtonLabel = {
    val __obj = js.Dynamic.literal(cancelButtonLabel = cancelButtonLabel.asInstanceOf[js.Any], confirmButtonLabel = confirmButtonLabel.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelButtonLabel]
  }
  
  extension [Self <: CancelButtonLabel](x: Self) {
    
    inline def setCancelButtonLabel(value: Requireable[String]): Self = StObject.set(x, "cancelButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setConfirmButtonLabel(value: Requireable[String]): Self = StObject.set(x, "confirmButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setLink(value: Requireable[InferProps[TextInputPlaceholder]]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
  }
}
