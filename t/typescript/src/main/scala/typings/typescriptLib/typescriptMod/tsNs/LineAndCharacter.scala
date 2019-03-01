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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("character")(character)
    __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[LineAndCharacter]
  }
}

