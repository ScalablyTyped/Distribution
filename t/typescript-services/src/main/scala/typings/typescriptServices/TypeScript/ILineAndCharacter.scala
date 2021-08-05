package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILineAndCharacter extends StObject {
  
  var character: Double
  
  var line: Double
}
object ILineAndCharacter {
  
  inline def apply(character: Double, line: Double): ILineAndCharacter = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILineAndCharacter]
  }
  
  extension [Self <: ILineAndCharacter](x: Self) {
    
    inline def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
