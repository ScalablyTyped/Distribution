package typings.wordpressRichText.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var attributes: js.UndefOr[Record[String, String]] = js.undefined
  var `object`: js.UndefOr[Boolean] = js.undefined
  var `type`: String
  var unregisteredAttributes: js.UndefOr[Record[String, String]] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    `type`: String,
    attributes: Record[String, String] = null,
    `object`: js.UndefOr[Boolean] = js.undefined,
    unregisteredAttributes: Record[String, String] = null
  ): Format = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(`object`)) __obj.updateDynamic("object")(`object`.get.asInstanceOf[js.Any])
    if (unregisteredAttributes != null) __obj.updateDynamic("unregisteredAttributes")(unregisteredAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

