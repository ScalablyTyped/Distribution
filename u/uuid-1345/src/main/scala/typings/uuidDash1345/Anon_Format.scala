package typings.uuidDash1345

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: String
  var variant: String
  var version: js.UndefOr[Double] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(format: String, variant: String, version: Int | Double = null): Anon_Format = {
    val __obj = js.Dynamic.literal(format = format, variant = variant)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Format]
  }
}

