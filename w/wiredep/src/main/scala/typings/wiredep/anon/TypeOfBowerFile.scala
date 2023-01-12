package typings.wiredep.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeOfBowerFile extends StObject {
  
  /**
    * match the way this type of file is included
    */
  var typeOfBowerFile: js.RegExp
}
object TypeOfBowerFile {
  
  inline def apply(typeOfBowerFile: js.RegExp): TypeOfBowerFile = {
    val __obj = js.Dynamic.literal(typeOfBowerFile = typeOfBowerFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOfBowerFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeOfBowerFile] (val x: Self) extends AnyVal {
    
    inline def setTypeOfBowerFile(value: js.RegExp): Self = StObject.set(x, "typeOfBowerFile", value.asInstanceOf[js.Any])
  }
}
