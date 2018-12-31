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

