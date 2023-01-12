package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileReference
  extends StObject
     with ILineAndCharacter {
  
  var isResident: Boolean
  
  var length: Double
  
  var path: String
  
  var position: Double
}
object IFileReference {
  
  inline def apply(
    character: Double,
    isResident: Boolean,
    length: Double,
    line: Double,
    path: String,
    position: Double
  ): IFileReference = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], isResident = isResident.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFileReference] (val x: Self) extends AnyVal {
    
    inline def setIsResident(value: Boolean): Self = StObject.set(x, "isResident", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
