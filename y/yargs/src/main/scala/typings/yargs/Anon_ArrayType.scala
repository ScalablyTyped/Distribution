package typings.yargs

import typings.yargs.yargsStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrayType extends js.Object {
  var `type`: array
}

object Anon_ArrayType {
  @scala.inline
  def apply(`type`: array): Anon_ArrayType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArrayType]
  }
}

