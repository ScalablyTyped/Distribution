package typings.urijs.uri

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
  def apply(explode: Boolean, name: String, maxLength: Int | Double = null): URITemplateVariable = {
    val __obj = js.Dynamic.literal(explode = explode, name = name)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[URITemplateVariable]
  }
}

