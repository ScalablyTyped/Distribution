package typings.yeomanDashEnvironment.yeomanDashEnvironmentMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alias extends js.Object {
  var `match`: RegExp
  var value: String
}

object Alias {
  @scala.inline
  def apply(`match`: RegExp, value: String): Alias = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[Alias]
  }
}

