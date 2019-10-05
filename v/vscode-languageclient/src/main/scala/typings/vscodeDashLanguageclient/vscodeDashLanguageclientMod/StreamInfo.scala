package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamInfo extends js.Object {
  var detached: js.UndefOr[Boolean] = js.undefined
  var reader: ReadableStream
  var writer: WritableStream
}

object StreamInfo {
  @scala.inline
  def apply(reader: ReadableStream, writer: WritableStream, detached: js.UndefOr[Boolean] = js.undefined): StreamInfo = {
    val __obj = js.Dynamic.literal(reader = reader, writer = writer)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    __obj.asInstanceOf[StreamInfo]
  }
}

