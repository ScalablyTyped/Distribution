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
  
  @scala.inline
  def apply(typeOfBowerFile: RegExp): TypeOfBowerFile = {
    val __obj = js.Dynamic.literal(typeOfBowerFile = typeOfBowerFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOfBowerFile]
  }
  
  @scala.inline
  implicit class TypeOfBowerFileMutableBuilder[Self <: TypeOfBowerFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypeOfBowerFile(value: RegExp): Self = StObject.set(x, "typeOfBowerFile", value.asInstanceOf[js.Any])
  }
}
