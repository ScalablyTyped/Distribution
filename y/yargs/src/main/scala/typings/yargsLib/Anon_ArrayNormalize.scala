package typings
package yargsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrayNormalize extends js.Object {
  var normalize: yargsLib.yargsLibNumbers.`true`
  var `type`: yargsLib.yargsLibStrings.array
}

object Anon_ArrayNormalize {
  @scala.inline
  def apply(normalize: yargsLib.yargsLibNumbers.`true`, `type`: yargsLib.yargsLibStrings.array): Anon_ArrayNormalize = {
    val __obj = js.Dynamic.literal(normalize = normalize)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ArrayNormalize]
  }
}

