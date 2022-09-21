package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceFileLike extends StObject {
  
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter
  
  val text: java.lang.String
}
object SourceFileLike {
  
  inline def apply(getLineAndCharacterOfPosition: Double => LineAndCharacter, text: java.lang.String): SourceFileLike = {
    val __obj = js.Dynamic.literal(getLineAndCharacterOfPosition = js.Any.fromFunction1(getLineAndCharacterOfPosition), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceFileLike]
  }
  
  extension [Self <: SourceFileLike](x: Self) {
    
    inline def setGetLineAndCharacterOfPosition(value: Double => LineAndCharacter): Self = StObject.set(x, "getLineAndCharacterOfPosition", js.Any.fromFunction1(value))
    
    inline def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
