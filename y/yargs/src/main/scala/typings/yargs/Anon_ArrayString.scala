package typings.yargs

import typings.yargs.yargsNumbers.`true`
import typings.yargs.yargsStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrayString extends js.Object {
  var array: `true`
  var `type`: string
}

object Anon_ArrayString {
  @scala.inline
  def apply(array: `true`, `type`: string): Anon_ArrayString = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArrayString]
  }
}

