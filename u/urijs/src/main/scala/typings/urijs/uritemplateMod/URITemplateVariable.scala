package typings.urijs.uritemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URITemplateVariable extends js.Object {
  var explode: Boolean
  var maxLength: js.UndefOr[Double] = js.undefined
  var name: String
}

object URITemplateVariable {
  @scala.inline
  def apply(explode: Boolean, name: String, maxLength: js.UndefOr[Double] = js.undefined): URITemplateVariable = {
    val __obj = js.Dynamic.literal(explode = explode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[URITemplateVariable]
  }
}

