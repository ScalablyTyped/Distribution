package typings.wiredep.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnotherTypeOfBowerFile extends StObject {
  
  /**
    * @exemple:
    *   return '<script class="random-' + Math.random() + '" src="' + filePath + '"></script>'
    */
  def anotherTypeOfBowerFile(filePath: String): String
  
  /**
    * <format for this {{filePath}} to be injected>
    */
  var typeOfBowerFile: String
}
object AnotherTypeOfBowerFile {
  
  inline def apply(anotherTypeOfBowerFile: String => String, typeOfBowerFile: String): AnotherTypeOfBowerFile = {
    val __obj = js.Dynamic.literal(anotherTypeOfBowerFile = js.Any.fromFunction1(anotherTypeOfBowerFile), typeOfBowerFile = typeOfBowerFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnotherTypeOfBowerFile]
  }
  
  extension [Self <: AnotherTypeOfBowerFile](x: Self) {
    
    inline def setAnotherTypeOfBowerFile(value: String => String): Self = StObject.set(x, "anotherTypeOfBowerFile", js.Any.fromFunction1(value))
    
    inline def setTypeOfBowerFile(value: String): Self = StObject.set(x, "typeOfBowerFile", value.asInstanceOf[js.Any])
  }
}
