package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceFileLike extends js.Object {
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter
}

object SourceFileLike {
  @scala.inline
  def apply(getLineAndCharacterOfPosition: Double => LineAndCharacter): SourceFileLike = {
    val __obj = js.Dynamic.literal(getLineAndCharacterOfPosition = js.Any.fromFunction1(getLineAndCharacterOfPosition))
  
    __obj.asInstanceOf[SourceFileLike]
  }
}

