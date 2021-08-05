package typings.wiredep.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeOfBowerFile extends StObject {
  
  /**
    * match the way this type of file is included
    */
  var typeOfBowerFile: RegExp
}
object TypeOfBowerFile {
  
  inline def apply(typeOfBowerFile: RegExp): TypeOfBowerFile = {
    val __obj = js.Dynamic.literal(typeOfBowerFile = typeOfBowerFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOfBowerFile]
  }
  
  extension [Self <: TypeOfBowerFile](x: Self) {
    
    inline def setTypeOfBowerFile(value: RegExp): Self = StObject.set(x, "typeOfBowerFile", value.asInstanceOf[js.Any])
  }
}
