package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileReference extends ILineAndCharacter {
  
  var isResident: Boolean = js.native
  
  var length: Double = js.native
  
  var path: String = js.native
  
  var position: Double = js.native
}
object IFileReference {
  
  @scala.inline
  def apply(
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
  implicit class IFileReferenceMutableBuilder[Self <: IFileReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsResident(value: Boolean): Self = StObject.set(x, "isResident", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
