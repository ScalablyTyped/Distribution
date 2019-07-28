package typings.vegaDashLite.buildSrcCompileSelectionSelectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.vegaDashLite.buildSrcChannelMod.Channel
import typings.vegaDashLite.buildSrcCompileDataTimeunitMod.TimeUnitNode
import typings.vegaDashLite.buildSrcSelectionMod.BrushConfig
import typings.vegaDashLite.buildSrcSelectionMod.SelectionResolution
import typings.vegaDashLite.buildSrcSelectionMod.SelectionType
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgBinding
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgEventStream
import typings.vegaDashLite.vegaDashLiteStrings.all
import typings.vegaDashLite.vegaDashLiteStrings.none
import typings.vegaDashLite.vegaDashLiteStrings.scales
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionComponent extends js.Object {
  var bind: js.UndefOr[scales | VgBinding | StringDictionary[VgBinding]] = js.undefined
  var empty: all | none
  var events: VgEventStream
  var fields: js.UndefOr[js.Any] = js.undefined
  var mark: js.UndefOr[BrushConfig] = js.undefined
  var name: String
  var nearest: js.UndefOr[js.Any] = js.undefined
  var project: js.UndefOr[js.Array[ProjectComponent]] = js.undefined
  var resolve: SelectionResolution
  var scales: js.UndefOr[js.Array[Channel]] = js.undefined
  var timeUnit: js.UndefOr[TimeUnitNode] = js.undefined
  var toggle: js.UndefOr[js.Any] = js.undefined
  var translate: js.UndefOr[js.Any] = js.undefined
  var `type`: SelectionType
  var zoom: js.UndefOr[js.Any] = js.undefined
}

object SelectionComponent {
  @scala.inline
  def apply(
    empty: all | none,
    events: VgEventStream,
    name: String,
    resolve: SelectionResolution,
    `type`: SelectionType,
    bind: scales | VgBinding | StringDictionary[VgBinding] = null,
    fields: js.Any = null,
    mark: BrushConfig = null,
    nearest: js.Any = null,
    project: js.Array[ProjectComponent] = null,
    scales: js.Array[Channel] = null,
    timeUnit: TimeUnitNode = null,
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

