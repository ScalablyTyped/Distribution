package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bindingsversion extends js.Object {
  var bindings_version: java.lang.String
  var lang: java.lang.String
  var lang_version: java.lang.String
  var platform: java.lang.String
  var publisher: java.lang.String
  var uname: java.lang.String
}

object Anon_Bindingsversion {
  @scala.inline
  def apply(
    bindings_version: java.lang.String,
    lang: java.lang.String,
    lang_version: java.lang.String,
    platform: java.lang.String,
    publisher: java.lang.String,
    uname: java.lang.String
  ): Anon_Bindingsversion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bindings_version")(bindings_version)
    __obj.updateDynamic("lang")(lang)
    __obj.updateDynamic("lang_version")(lang_version)
    __obj.updateDynamic("platform")(platform)
    __obj.updateDynamic("publisher")(publisher)
    __obj.updateDynamic("uname")(uname)
    __obj.asInstanceOf[Anon_Bindingsversion]
  }
}

