package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceFileLike extends js.Object {
  def getLineAndCharacterOfPosition(pos: scala.Double): LineAndCharacter
}

object SourceFileLike {
  @scala.inline
  def apply(getLineAndCharacterOfPosition: scala.Double => LineAndCharacter): SourceFileLike = {
    val __obj = js.Dynamic.literal(getLineAndCharacterOfPosition = js.Any.fromFunction1(getLineAndCharacterOfPosition))
  
    __obj.asInstanceOf[SourceFileLike]
  }
}

