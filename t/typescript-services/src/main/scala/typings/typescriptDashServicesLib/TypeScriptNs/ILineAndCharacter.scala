package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILineAndCharacter extends js.Object {
  var character: scala.Double
  var line: scala.Double
}

object ILineAndCharacter {
  @scala.inline
  def apply(character: scala.Double, line: scala.Double): ILineAndCharacter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("character")(character)
    __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[ILineAndCharacter]
  }
}

