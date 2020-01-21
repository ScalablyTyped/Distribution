package typings.typescript.mod

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
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LineAndCharacter]
  }
}

