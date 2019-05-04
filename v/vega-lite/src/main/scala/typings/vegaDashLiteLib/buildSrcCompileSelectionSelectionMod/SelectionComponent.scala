package typings
package vegaDashLiteLib.buildSrcCompileSelectionSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionComponent extends js.Object {
  var bind: js.UndefOr[
    vegaDashLiteLib.vegaDashLiteLibStrings.scales | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgBinding | org.scalablytyped.runtime.StringDictionary[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgBinding]
  ] = js.undefined
  var empty: vegaDashLiteLib.vegaDashLiteLibStrings.all | vegaDashLiteLib.vegaDashLiteLibStrings.none
  var events: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgEventStream
  var fields: js.UndefOr[js.Any] = js.undefined
  var mark: js.UndefOr[vegaDashLiteLib.buildSrcSelectionMod.BrushConfig] = js.undefined
  var name: java.lang.String
  var nearest: js.UndefOr[js.Any] = js.undefined
  var project: js.UndefOr[js.Array[ProjectComponent]] = js.undefined
  var resolve: vegaDashLiteLib.buildSrcSelectionMod.SelectionResolution
  var scales: js.UndefOr[js.Array[vegaDashLiteLib.buildSrcChannelMod.Channel]] = js.undefined
  var timeUnit: js.UndefOr[vegaDashLiteLib.buildSrcCompileDataTimeunitMod.TimeUnitNode] = js.undefined
  var toggle: js.UndefOr[js.Any] = js.undefined
  var translate: js.UndefOr[js.Any] = js.undefined
  var `type`: vegaDashLiteLib.buildSrcSelectionMod.SelectionType
  var zoom: js.UndefOr[js.Any] = js.undefined
}

object SelectionComponent {
  @scala.inline
  def apply(
    empty: vegaDashLiteLib.vegaDashLiteLibStrings.all | vegaDashLiteLib.vegaDashLiteLibStrings.none,
    events: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgEventStream,
    name: java.lang.String,
    resolve: vegaDashLiteLib.buildSrcSelectionMod.SelectionResolution,
    `type`: vegaDashLiteLib.buildSrcSelectionMod.SelectionType,
    bind: vegaDashLiteLib.vegaDashLiteLibStrings.scales | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgBinding | org.scalablytyped.runtime.StringDictionary[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgBinding] = null,
    fields: js.Any = null,
    mark: vegaDashLiteLib.buildSrcSelectionMod.BrushConfig = null,
    nearest: js.Any = null,
    project: js.Array[ProjectComponent] = null,
    scales: js.Array[vegaDashLiteLib.buildSrcChannelMod.Channel] = null,
    timeUnit: vegaDashLiteLib.buildSrcCompileDataTimeunitMod.TimeUnitNode = null,
    toggle: js.Any = null,
    translate: js.Any = null,
    zoom: js.Any = null
  ): SelectionComponent = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], events = events, name = name, resolve = resolve)
    __obj.updateDynamic("type")(`type`)
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (mark != null) __obj.updateDynamic("mark")(mark)
    if (nearest != null) __obj.updateDynamic("nearest")(nearest)
    if (project != null) __obj.updateDynamic("project")(project)
    if (scales != null) __obj.updateDynamic("scales")(scales)
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    if (translate != null) __obj.updateDynamic("translate")(translate)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[SelectionComponent]
  }
}

