package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractiveRefactorArguments extends StObject {
  
  var targetFile: java.lang.String
}
object InteractiveRefactorArguments {
  
  inline def apply(targetFile: java.lang.String): InteractiveRefactorArguments = {
    val __obj = js.Dynamic.literal(targetFile = targetFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveRefactorArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractiveRefactorArguments] (val x: Self) extends AnyVal {
    
    inline def setTargetFile(value: java.lang.String): Self = StObject.set(x, "targetFile", value.asInstanceOf[js.Any])
  }
}
