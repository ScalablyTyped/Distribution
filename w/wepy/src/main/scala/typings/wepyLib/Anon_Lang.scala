package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lang extends js.Object {
  var lang: java.lang.String
  var timeout: scala.Double
  var withCredentials: scala.Boolean
}

object Anon_Lang {
  @scala.inline
  def apply(lang: java.lang.String, timeout: scala.Double, withCredentials: scala.Boolean): Anon_Lang = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lang")(lang)
    __obj.updateDynamic("timeout")(timeout)
    __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[Anon_Lang]
  }
}

