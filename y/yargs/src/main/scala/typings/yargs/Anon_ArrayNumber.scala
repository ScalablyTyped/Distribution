package typings.yargs

import typings.yargs.yargsNumbers.`true`
import typings.yargs.yargsStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrayNumber extends js.Object {
  var number: `true`
  var `type`: array
}

object Anon_ArrayNumber {
  @scala.inline
  def apply(number: `true`, `type`: array): Anon_ArrayNumber = {
    val __obj = js.Dynamic.literal(number = number)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ArrayNumber]
  }
}

