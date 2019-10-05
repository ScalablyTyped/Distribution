package typings.timezonecomplete.distLibParseMod

import typings.timezonecomplete.distLibLocaleMod.PartialLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/parse", "parseable")
@js.native
object parseable extends js.Object {
  def apply(dateTimeString: String, formatString: String): Boolean = js.native
  def apply(dateTimeString: String, formatString: String, allowTrailing: Boolean): Boolean = js.native
  def apply(dateTimeString: String, formatString: String, allowTrailing: Boolean, locale: PartialLocale): Boolean = js.native
}

