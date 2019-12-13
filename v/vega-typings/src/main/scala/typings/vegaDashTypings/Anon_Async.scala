package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecDataMod.Datum
import typings.vegaDashTypings.typesSpecDataMod.Format
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Async extends js.Object {
  var async: js.UndefOr[Boolean | SignalRef] = js.undefined
  var format: js.UndefOr[Format | SignalRef] = js.undefined
  var values: js.Array[Datum] | js.Object
}

object Anon_Async {
  @scala.inline
  def apply(
    values: js.Array[Datum] | js.Object,
    async: Boolean | SignalRef = null,
    format: Format | SignalRef = null
  ): Anon_Async = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Async]
  }
}

