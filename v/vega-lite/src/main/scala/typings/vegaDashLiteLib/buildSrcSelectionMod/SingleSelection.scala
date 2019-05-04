package typings
package vegaDashLiteLib.buildSrcSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleSelection
  extends SingleSelectionConfig
     with SelectionDef {
  var `type`: vegaDashLiteLib.vegaDashLiteLibStrings.single
}

object SingleSelection {
  @scala.inline
  def apply(
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.single,
    bind: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgBinding | org.scalablytyped.runtime.StringDictionary[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgBinding] = null,
    empty: vegaDashLiteLib.vegaDashLiteLibStrings.all | vegaDashLiteLib.vegaDashLiteLibStrings.none = null,
    encodings: js.Array[vegaDashLiteLib.buildSrcChannelMod.SingleDefChannel] = null,
    fields: js.Array[java.lang.String] = null,
    nearest: js.UndefOr[scala.Boolean] = js.undefined,
    on: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgEventStream = null,
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

