package typings
package wreckLib.wreckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOptions extends js.Object {
  var gunzip: js.UndefOr[scala.Boolean | wreckLib.wreckLibStrings.force] = js.undefined
  var json: js.UndefOr[
    wreckLib.wreckLibNumbers.`true` | wreckLib.wreckLibStrings.strict | wreckLib.wreckLibStrings.force
  ] = js.undefined
  var maxBytes: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object ReadOptions {
  @scala.inline
  def apply(
    gunzip: scala.Boolean | wreckLib.wreckLibStrings.force = null,
    json: wreckLib.wreckLibNumbers.`true` | wreckLib.wreckLibStrings.strict | wreckLib.wreckLibStrings.force = null,
    maxBytes: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): ReadOptions = {
    val __obj = js.Dynamic.literal()
    if (gunzip != null) __obj.updateDynamic("gunzip")(gunzip.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (maxBytes != null) __obj.updateDynamic("maxBytes")(maxBytes.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOptions]
  }
}

