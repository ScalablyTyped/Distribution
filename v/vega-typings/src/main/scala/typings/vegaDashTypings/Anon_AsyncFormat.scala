package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecDataMod.Format
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncFormat extends js.Object {
  var async: js.UndefOr[Boolean | SignalRef] = js.undefined
  var format: js.UndefOr[Format | SignalRef] = js.undefined
  var url: String | SignalRef
}

object Anon_AsyncFormat {
  @scala.inline
  def apply(url: String | SignalRef, async: Boolean | SignalRef = null, format: Format | SignalRef = null): Anon_AsyncFormat = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AsyncFormat]
  }
}

