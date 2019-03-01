package typings
package vscodeDashLanguageserverDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Language extends js.Object {
  var language: java.lang.String
  var value: java.lang.String
}

object Anon_Language {
  @scala.inline
  def apply(language: java.lang.String, value: java.lang.String): Anon_Language = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Language]
  }
}

