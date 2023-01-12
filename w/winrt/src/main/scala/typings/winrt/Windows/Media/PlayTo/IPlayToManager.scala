package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayToManager extends StObject {
  
  var defaultSourceSelection: Boolean
  
  var onsourcerequested: Any
  
  var onsourceselected: Any
}
object IPlayToManager {
  
  inline def apply(defaultSourceSelection: Boolean, onsourcerequested: Any, onsourceselected: Any): IPlayToManager = {
    val __obj = js.Dynamic.literal(defaultSourceSelection = defaultSourceSelection.asInstanceOf[js.Any], onsourcerequested = onsourcerequested.asInstanceOf[js.Any], onsourceselected = onsourceselected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPlayToManager] (val x: Self) extends AnyVal {
    
    inline def setDefaultSourceSelection(value: Boolean): Self = StObject.set(x, "defaultSourceSelection", value.asInstanceOf[js.Any])
    
    inline def setOnsourcerequested(value: Any): Self = StObject.set(x, "onsourcerequested", value.asInstanceOf[js.Any])
    
    inline def setOnsourceselected(value: Any): Self = StObject.set(x, "onsourceselected", value.asInstanceOf[js.Any])
  }
}
