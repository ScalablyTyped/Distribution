package typings.tsModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModelElement extends StObject {
  
  def modelClass(): String
}
object IModelElement {
  
  inline def apply(modelClass: () => String): IModelElement = {
    val __obj = js.Dynamic.literal(modelClass = js.Any.fromFunction0(modelClass))
    __obj.asInstanceOf[IModelElement]
  }
  
  extension [Self <: IModelElement](x: Self) {
    
    inline def setModelClass(value: () => String): Self = StObject.set(x, "modelClass", js.Any.fromFunction0(value))
  }
}
