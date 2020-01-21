package typings.wreck.mod

import typings.wreck.wreckBooleans.`true`
import typings.wreck.wreckStrings.force
import typings.wreck.wreckStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOptions extends js.Object {
  var gunzip: js.UndefOr[Boolean | force] = js.undefined
  var json: js.UndefOr[`true` | strict | force] = js.undefined
  var maxBytes: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object ReadOptions {
  @scala.inline
  def apply(
    gunzip: Boolean | force = null,
    json: `true` | strict | force = null,
    maxBytes: Int | Double = null,
    timeout: Int | Double = null
  ): ReadOptions = {
    val __obj = js.Dynamic.literal()
    if (gunzip != null) __obj.updateDynamic("gunzip")(gunzip.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (maxBytes != null) __obj.updateDynamic("maxBytes")(maxBytes.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOptions]
  }
}

