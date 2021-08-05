package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceFileLike extends StObject {
  
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter
}
object SourceFileLike {
  
  inline def apply(getLineAndCharacterOfPosition: Double => LineAndCharacter): SourceFileLike = {
    val __obj = js.Dynamic.literal(getLineAndCharacterOfPosition = js.Any.fromFunction1(getLineAndCharacterOfPosition))
    __obj.asInstanceOf[SourceFileLike]
  }
  
  extension [Self <: SourceFileLike](x: Self) {
    
    inline def setGetLineAndCharacterOfPosition(value: Double => LineAndCharacter): Self = StObject.set(x, "getLineAndCharacterOfPosition", js.Any.fromFunction1(value))
  }
}
