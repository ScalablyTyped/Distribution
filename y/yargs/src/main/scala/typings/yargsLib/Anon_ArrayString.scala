package typings
package yargsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrayString extends js.Object {
  var array: yargsLib.yargsLibNumbers.`true`
  var `type`: yargsLib.yargsLibStrings.string
}

object Anon_ArrayString {
  @scala.inline
  def apply(array: yargsLib.yargsLibNumbers.`true`, `type`: yargsLib.yargsLibStrings.string): Anon_ArrayString = {
    val __obj = js.Dynamic.literal(array = array)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ArrayString]
  }
}

