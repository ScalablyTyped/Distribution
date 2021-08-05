package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayToManager extends StObject {
  
  var defaultSourceSelection: Boolean
  
  var onsourcerequested: js.Any
  
  var onsourceselected: js.Any
}
object IPlayToManager {
  
  inline def apply(defaultSourceSelection: Boolean, onsourcerequested: js.Any, onsourceselected: js.Any): IPlayToManager = {
    val __obj = js.Dynamic.literal(defaultSourceSelection = defaultSourceSelection.asInstanceOf[js.Any], onsourcerequested = onsourcerequested.asInstanceOf[js.Any], onsourceselected = onsourceselected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToManager]
  }
  
  extension [Self <: IPlayToManager](x: Self) {
    
    inline def setDefaultSourceSelection(value: Boolean): Self = StObject.set(x, "defaultSourceSelection", value.asInstanceOf[js.Any])
    
    inline def setOnsourcerequested(value: js.Any): Self = StObject.set(x, "onsourcerequested", value.asInstanceOf[js.Any])
    
    inline def setOnsourceselected(value: js.Any): Self = StObject.set(x, "onsourceselected", value.asInstanceOf[js.Any])
  }
}
