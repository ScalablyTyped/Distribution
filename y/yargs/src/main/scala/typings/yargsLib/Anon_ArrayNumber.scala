package typings
package yargsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrayNumber extends js.Object {
  var number: yargsLib.yargsLibNumbers.`true`
  var `type`: yargsLib.yargsLibStrings.array
}

object Anon_ArrayNumber {
  @scala.inline
  def apply(number: yargsLib.yargsLibNumbers.`true`, `type`: yargsLib.yargsLibStrings.array): Anon_ArrayNumber = {
    val __obj = js.Dynamic.literal(number = number)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ArrayNumber]
  }
}

