package typings.uuid1345.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var format: String
  var variant: String
  var version: js.UndefOr[Double] = js.undefined
}

object Format {
  @scala.inline
  def apply(format: String, variant: String, version: js.UndefOr[Double] = js.undefined): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

