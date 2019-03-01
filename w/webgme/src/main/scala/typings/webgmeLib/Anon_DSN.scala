package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DSN extends js.Object {
  var DSN: java.lang.String
  var enable: scala.Boolean
  var ravenOptions: scala.Null | java.lang.String
}

object Anon_DSN {
  @scala.inline
  def apply(DSN: java.lang.String, enable: scala.Boolean, ravenOptions: java.lang.String = null): Anon_DSN = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DSN")(DSN)
    __obj.updateDynamic("enable")(enable)
    if (ravenOptions != null) __obj.updateDynamic("ravenOptions")(ravenOptions)
    __obj.asInstanceOf[Anon_DSN]
  }
}

