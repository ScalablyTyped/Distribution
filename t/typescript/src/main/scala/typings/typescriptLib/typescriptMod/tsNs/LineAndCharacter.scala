package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineAndCharacter extends js.Object {
  var character: scala.Double
  /** 0-based. */
  var line: scala.Double
}

object LineAndCharacter {
  @scala.inline
  def apply(character: scala.Double, line: scala.Double): LineAndCharacter = {
    val __obj = js.Dynamic.literal(character = character, line = line)
  
    __obj.asInstanceOf[LineAndCharacter]
  }
}

