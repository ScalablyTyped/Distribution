package typings
package yeomanDashEnvironmentLib.yeomanDashEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alias extends js.Object {
  var `match`: stdLib.RegExp
  var value: java.lang.String
}

object Alias {
  @scala.inline
  def apply(`match`: stdLib.RegExp, value: java.lang.String): Alias = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[Alias]
  }
}

