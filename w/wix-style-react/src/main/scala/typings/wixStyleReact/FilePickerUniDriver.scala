package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePickerUniDriver
  extends StObject
     with BaseUniDriver {
  
  def errorMessage(): js.Promise[String]
  
  def getMainLabel(): js.Promise[String]
  
  def getName(): js.Promise[js.Any]
  
  def getSubLabel(): js.Promise[String]
  
  def hasError(): js.Promise[Boolean]
}
object FilePickerUniDriver {
  
  @scala.inline
  def apply(
    click: () => js.Promise[Unit],
    element: () => js.Promise[js.Any],
    errorMessage: () => js.Promise[String],
    exists: () => js.Promise[Boolean],
    getMainLabel: () => js.Promise[String],
    getName: () => js.Promise[js.Any],
    getSubLabel: () => js.Promise[String],
    hasError: () => js.Promise[Boolean]
  ): FilePickerUniDriver = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), errorMessage = js.Any.fromFunction0(errorMessage), exists = js.Any.fromFunction0(exists), getMainLabel = js.Any.fromFunction0(getMainLabel), getName = js.Any.fromFunction0(getName), getSubLabel = js.Any.fromFunction0(getSubLabel), hasError = js.Any.fromFunction0(hasError))
    __obj.asInstanceOf[FilePickerUniDriver]
  }
  
  @scala.inline
  implicit class FilePickerUniDriverMutableBuilder[Self <: FilePickerUniDriver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: () => js.Promise[String]): Self = StObject.set(x, "errorMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMainLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getMainLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getSubLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasError(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
  }
}
