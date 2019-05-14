package typings
package yargsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  var string: yargsLib.yargsLibNumbers.`true`
  var `type`: yargsLib.yargsLibStrings.array
}

object Anon_Array {
  @scala.inline
  def apply(string: yargsLib.yargsLibNumbers.`true`, `type`: yargsLib.yargsLibStrings.array): Anon_Array = {
    val __obj = js.Dynamic.literal(string = string)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Array]
  }
}

