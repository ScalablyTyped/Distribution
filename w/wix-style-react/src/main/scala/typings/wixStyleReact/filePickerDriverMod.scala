package typings.wixStyleReact

import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filePickerDriverMod {
  
  trait FilePickerDriver
    extends StObject
       with BaseDriver {
    
    def errorMessage(): String
    
    def getMainLabel(): String
    
    def getName(): String
    
    def getSubLabel(): String
    
    def hasError(): Boolean
  }
  object FilePickerDriver {
    
    inline def apply(
      errorMessage: () => String,
      exists: () => Boolean,
      getMainLabel: () => String,
      getName: () => String,
      getSubLabel: () => String,
      hasError: () => Boolean
    ): FilePickerDriver = {
      val __obj = js.Dynamic.literal(errorMessage = js.Any.fromFunction0(errorMessage), exists = js.Any.fromFunction0(exists), getMainLabel = js.Any.fromFunction0(getMainLabel), getName = js.Any.fromFunction0(getName), getSubLabel = js.Any.fromFunction0(getSubLabel), hasError = js.Any.fromFunction0(hasError))
      __obj.asInstanceOf[FilePickerDriver]
    }
    
    extension [Self <: FilePickerDriver](x: Self) {
      
      inline def setErrorMessage(value: () => String): Self = StObject.set(x, "errorMessage", js.Any.fromFunction0(value))
      
      inline def setGetMainLabel(value: () => String): Self = StObject.set(x, "getMainLabel", js.Any.fromFunction0(value))
      
      inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetSubLabel(value: () => String): Self = StObject.set(x, "getSubLabel", js.Any.fromFunction0(value))
      
      inline def setHasError(value: () => Boolean): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
    }
  }
}
