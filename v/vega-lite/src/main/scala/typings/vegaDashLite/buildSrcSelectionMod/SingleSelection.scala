package typings.vegaDashLite.buildSrcSelectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.vegaDashLite.buildSrcChannelMod.SingleDefChannel
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgBinding
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgEventStream
import typings.vegaDashLite.vegaDashLiteStrings.all
import typings.vegaDashLite.vegaDashLiteStrings.none
import typings.vegaDashLite.vegaDashLiteStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleSelection
  extends SingleSelectionConfig
     with SelectionDef {
  var `type`: single
}

object SingleSelection {
  @scala.inline
  def apply(
    `type`: single,
    bind: VgBinding | StringDictionary[VgBinding] = null,
    empty: all | none = null,
    encodings: js.Array[SingleDefChannel] = null,
    fields: js.Array[String] = null,
    nearest: js.UndefOr[Boolean] = js.undefined,
    on: VgEventStream = null,
    resolve: SelectionResolution = null
  ): SingleSelection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (encodings != null) __obj.updateDynamic("encodings")(encodings)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(nearest)) __obj.updateDynamic("nearest")(nearest)
    if (on != null) __obj.updateDynamic("on")(on)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[SingleSelection]
  }
}

