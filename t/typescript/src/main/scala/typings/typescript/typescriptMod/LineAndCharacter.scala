package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineAndCharacter extends js.Object {
  var character: Double
  /** 0-based. */
  var line: Double
}

object LineAndCharacter {
  @scala.inline
  def apply(character: Double, line: Double): LineAndCharacter = {
    val __obj = js.Dynamic.literal(character = character, line = line)
  
    __obj.asInstanceOf[LineAndCharacter]
  }
}

