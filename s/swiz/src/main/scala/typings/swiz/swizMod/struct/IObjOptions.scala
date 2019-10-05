package typings.swiz.swizMod.struct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjOptions extends js.Object {
  var fields: js.UndefOr[js.Array[IField]] = js.undefined
  var plural: js.UndefOr[String] = js.undefined
  var singular: js.UndefOr[String] = js.undefined
}

object IObjOptions {
  @scala.inline
  def apply(fields: js.Array[IField] = null, plural: String = null, singular: String = null): IObjOptions = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (plural != null) __obj.updateDynamic("plural")(plural)
    if (singular != null) __obj.updateDynamic("singular")(singular)
    __obj.asInstanceOf[IObjOptions]
  }
}

