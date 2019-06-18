package typings
package atWordpressRichDashTextLib.atWordpressRichDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var attributes: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  var `object`: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: java.lang.String
  var unregisteredAttributes: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    attributes: stdLib.Record[java.lang.String, java.lang.String] = null,
    `object`: js.UndefOr[scala.Boolean] = js.undefined,
    unregisteredAttributes: stdLib.Record[java.lang.String, java.lang.String] = null
  ): Format = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (!js.isUndefined(`object`)) __obj.updateDynamic("object")(`object`)
    if (unregisteredAttributes != null) __obj.updateDynamic("unregisteredAttributes")(unregisteredAttributes)
    __obj.asInstanceOf[Format]
  }
}

