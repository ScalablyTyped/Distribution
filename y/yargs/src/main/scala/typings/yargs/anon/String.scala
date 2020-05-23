package typings.yargs.anon

import typings.yargs.yargsBooleans.`true`
import typings.yargs.yargsStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  var string: `true`
  var `type`: array
}

object String {
  @scala.inline
  def apply(string: `true`, `type`: array): String = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
}

