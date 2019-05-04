package typings
package vegaDashLiteLib.buildSrcCompileModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends js.Object {
  /** Dictionary mapping channel to VgAxis definition */
  var axes: vegaDashLiteLib.buildSrcCompileAxisComponentMod.AxisComponentIndex
  var data: vegaDashLiteLib.buildSrcCompileDataMod.DataComponent
  var layoutHeaders: vegaDashLiteLib.Anon_Column
  var layoutSize: vegaDashLiteLib.buildSrcCompileLayoutsizeComponentMod.LayoutSizeComponent
  /** Dictionary mapping channel to VgLegend definition */
  var legends: vegaDashLiteLib.buildSrcCompileLegendComponentMod.LegendComponentIndex
  var mark: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgMarkGroup]
  var projection: vegaDashLiteLib.buildSrcCompileProjectionComponentMod.ProjectionComponent
  var resolve: vegaDashLiteLib.buildSrcResolveMod.Resolve
  var scales: vegaDashLiteLib.buildSrcCompileScaleComponentMod.ScaleComponentIndex
  var selection: vegaDashLiteLib.buildSrcUtilMod.Dict[vegaDashLiteLib.buildSrcCompileSelectionSelectionMod.SelectionComponent]
}

object Component {
  @scala.inline
  def apply(
    axes: vegaDashLiteLib.buildSrcCompileAxisComponentMod.AxisComponentIndex,
    data: vegaDashLiteLib.buildSrcCompileDataMod.DataComponent,
    layoutHeaders: vegaDashLiteLib.Anon_Column,
    layoutSize: vegaDashLiteLib.buildSrcCompileLayoutsizeComponentMod.LayoutSizeComponent,
    legends: vegaDashLiteLib.buildSrcCompileLegendComponentMod.LegendComponentIndex,
    mark: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgMarkGroup],
    projection: vegaDashLiteLib.buildSrcCompileProjectionComponentMod.ProjectionComponent,
    resolve: vegaDashLiteLib.buildSrcResolveMod.Resolve,
    scales: vegaDashLiteLib.buildSrcCompileScaleComponentMod.ScaleComponentIndex,
    selection: vegaDashLiteLib.buildSrcUtilMod.Dict[vegaDashLiteLib.buildSrcCompileSelectionSelectionMod.SelectionComponent]
  ): Component = {
    val __obj = js.Dynamic.literal(axes = axes, data = data, layoutHeaders = layoutHeaders, layoutSize = layoutSize, legends = legends, mark = mark, projection = projection, resolve = resolve, scales = scales, selection = selection)
  
    __obj.asInstanceOf[Component]
  }
}

