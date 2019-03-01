package typings
package vscodeDashLanguageclientLib.vscodeDashLanguageclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamInfo extends js.Object {
  var detached: js.UndefOr[scala.Boolean] = js.undefined
  var reader: nodeLib.NodeJSNs.ReadableStream
  var writer: nodeLib.NodeJSNs.WritableStream
}

object StreamInfo {
  @scala.inline
  def apply(
    reader: nodeLib.NodeJSNs.ReadableStream,
    writer: nodeLib.NodeJSNs.WritableStream,
    detached: js.UndefOr[scala.Boolean] = js.undefined
  ): StreamInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reader")(reader)
    __obj.updateDynamic("writer")(writer)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    __obj.asInstanceOf[StreamInfo]
  }
}

