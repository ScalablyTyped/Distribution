package typings
package urijsLib.uriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URITemplateVariable extends js.Object {
  var explode: scala.Boolean
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var name: java.lang.String
}

object URITemplateVariable {
  @scala.inline
  def apply(explode: scala.Boolean, name: java.lang.String, maxLength: scala.Int | scala.Double = null): URITemplateVariable = {
    val __obj = js.Dynamic.literal(explode = explode, name = name)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[URITemplateVariable]
  }
}

