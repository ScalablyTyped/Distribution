package typings.vegaTypings

import typings.vegaTypings.dataMod.Format
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsyncFormat extends js.Object {
  var async: js.UndefOr[Boolean | SignalRef] = js.undefined
  var format: js.UndefOr[Format | SignalRef] = js.undefined
  var url: String | SignalRef
}

object AnonAsyncFormat {
  @scala.inline
  def apply(url: String | SignalRef, async: Boolean | SignalRef = null, format: Format | SignalRef = null): AnonAsyncFormat = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsyncFormat]
  }
}

