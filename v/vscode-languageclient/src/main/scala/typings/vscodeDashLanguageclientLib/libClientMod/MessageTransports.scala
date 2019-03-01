package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageTransports extends js.Object {
  var detached: js.UndefOr[scala.Boolean] = js.undefined
  var reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader
  var writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
}

object MessageTransports {
  @scala.inline
  def apply(
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter,
    detached: js.UndefOr[scala.Boolean] = js.undefined
  ): MessageTransports = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reader")(reader)
    __obj.updateDynamic("writer")(writer)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    __obj.asInstanceOf[MessageTransports]
  }
}

