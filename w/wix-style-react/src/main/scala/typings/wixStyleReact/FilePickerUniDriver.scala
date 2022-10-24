package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePickerUniDriver
  extends StObject
     with BaseUniDriver {
  
  def errorMessage(): js.Promise[String]
  
  def getMainLabel(): js.Promise[String]
  
  def getName(): js.Promise[Any]
  
  def getSubLabel(): js.Promise[String]
  
  def hasError(): js.Promise[Boolean]
}
object FilePickerUniDriver {
  
  inline def apply(
    click: () => js.Promise[Unit],
    element: () => js.Promise[Any],
    errorMessage: () => js.Promise[String],
    exists: () => js.Promise[Boolean],
    getMainLabel: () => js.Promise[String],
    getName: () => js.Promise[Any],
    getSubLabel: () => js.Promise[String],
    hasError: () => js.Promise[Boolean]
  ): FilePickerUniDriver = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), errorMessage = js.Any.fromFunction0(errorMessage), exists = js.Any.fromFunction0(exists), getMainLabel = js.Any.fromFunction0(getMainLabel), getName = js.Any.fromFunction0(getName), getSubLabel = js.Any.fromFunction0(getSubLabel), hasError = js.Any.fromFunction0(hasError))
    __obj.asInstanceOf[FilePickerUniDriver]
  }
  
  extension [Self <: FilePickerUniDriver](x: Self) {
    
    inline def setErrorMessage(value: () => js.Promise[String]): Self = StObject.set(x, "errorMessage", js.Any.fromFunction0(value))
    
    inline def setGetMainLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getMainLabel", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => js.Promise[Any]): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetSubLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getSubLabel", js.Any.fromFunction0(value))
    
    inline def setHasError(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
  }
}
