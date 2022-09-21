package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDialogOptions
  extends StObject
     with IPopupOptionsBase {
  
  var componentName: String
  
  var data: Any
}
object IDialogOptions {
  
  inline def apply(componentName: String, data: Any): IDialogOptions = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogOptions]
  }
  
  extension [Self <: IDialogOptions](x: Self) {
    
    inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
