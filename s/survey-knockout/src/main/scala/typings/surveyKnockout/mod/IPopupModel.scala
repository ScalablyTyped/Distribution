package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPopupModel[T]
  extends StObject
     with IDialogOptions {
  
  var contentComponentData: T
  
  var contentComponentName: String
}
object IPopupModel {
  
  inline def apply[T](componentName: String, contentComponentData: T, contentComponentName: String, data: Any): IPopupModel[T] = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any], contentComponentData = contentComponentData.asInstanceOf[js.Any], contentComponentName = contentComponentName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopupModel[T]]
  }
  
  extension [Self <: IPopupModel[?], T](x: Self & IPopupModel[T]) {
    
    inline def setContentComponentData(value: T): Self = StObject.set(x, "contentComponentData", value.asInstanceOf[js.Any])
    
    inline def setContentComponentName(value: String): Self = StObject.set(x, "contentComponentName", value.asInstanceOf[js.Any])
  }
}
