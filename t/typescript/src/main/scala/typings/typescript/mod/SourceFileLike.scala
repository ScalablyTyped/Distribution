package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceFileLike extends StObject {
  
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter = js.native
}
object SourceFileLike {
  
  @scala.inline
  def apply(getLineAndCharacterOfPosition: Double => LineAndCharacter): SourceFileLike = {
    val __obj = js.Dynamic.literal(getLineAndCharacterOfPosition = js.Any.fromFunction1(getLineAndCharacterOfPosition))
    __obj.asInstanceOf[SourceFileLike]
  }
  
  @scala.inline
  implicit class SourceFileLikeMutableBuilder[Self <: SourceFileLike] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLineAndCharacterOfPosition(value: Double => LineAndCharacter): Self = StObject.set(x, "getLineAndCharacterOfPosition", js.Any.fromFunction1(value))
  }
}
