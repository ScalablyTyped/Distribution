package typings.vegaDashLite.buildSrcCompileModelMod

import typings.vegaDashLite.Anon_Column
import typings.vegaDashLite.buildSrcCompileAxisComponentMod.AxisComponentIndex
import typings.vegaDashLite.buildSrcCompileDataMod.DataComponent
import typings.vegaDashLite.buildSrcCompileLayoutsizeComponentMod.LayoutSizeComponent
import typings.vegaDashLite.buildSrcCompileLegendComponentMod.LegendComponentIndex
import typings.vegaDashLite.buildSrcCompileProjectionComponentMod.ProjectionComponent
import typings.vegaDashLite.buildSrcCompileScaleComponentMod.ScaleComponentIndex
import typings.vegaDashLite.buildSrcCompileSelectionSelectionMod.SelectionComponent
import typings.vegaDashLite.buildSrcResolveMod.Resolve
import typings.vegaDashLite.buildSrcUtilMod.Dict
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgMarkGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends js.Object {
  /** Dictionary mapping channel to VgAxis definition */
  var axes: AxisComponentIndex
  var data: DataComponent
  var layoutHeaders: Anon_Column
  var layoutSize: LayoutSizeComponent
  /** Dictionary mapping channel to VgLegend definition */
  var legends: LegendComponentIndex
  var mark: js.Array[VgMarkGroup]
  var projection: ProjectionComponent
  var resolve: Resolve
  var scales: ScaleComponentIndex
  var selection: Dict[SelectionComponent]
}

object Component {
  @scala.inline
  def apply(
    axes: AxisComponentIndex,
    data: DataComponent,
    layoutHeaders: Anon_Column,
    layoutSize: LayoutSizeComponent,
    legends: LegendComponentIndex,
    mark: js.Array[VgMarkGroup],
    projection: ProjectionComponent,
    resolve: Resolve,
    scales: ScaleComponentIndex,
    selection: Dict[SelectionComponent]
  ): Component = {
    val __obj = js.Dynamic.literal(axes = axes, data = data, layoutHeaders = layoutHeaders, layoutSize = layoutSize, legends = legends, mark = mark, projection = projection, resolve = resolve, scales = scales, selection = selection)
  
    __obj.asInstanceOf[Component]
  }
}

