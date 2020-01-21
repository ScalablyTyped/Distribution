package typings.victory

import typings.react.mod.CSSProperties
import typings.victory.victoryStrings.Anon_AxisAxisLabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAxisAxisLabel extends js.Object {
  var axis: js.UndefOr[CSSProperties] = js.undefined
  var axisLabel: js.UndefOr[CSSProperties] = js.undefined
  var grid: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof react.react.CSSProperties ]: string | number | (tick? : any): string | number}
    */ Anon_AxisAxisLabel with js.Any
  ] = js.undefined
  var parent: js.UndefOr[CSSProperties] = js.undefined
  var tickLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof react.react.CSSProperties ]: string | number | (tick? : any): string | number}
    */ Anon_AxisAxisLabel with js.Any
  ] = js.undefined
  var ticks: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof react.react.CSSProperties ]: string | number | (tick? : any): string | number}
    */ Anon_AxisAxisLabel with js.Any
  ] = js.undefined
}

object AnonAxisAxisLabel {
  @scala.inline
  def apply(
    axis: CSSProperties = null,
    axisLabel: CSSProperties = null,
    grid: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof react.react.CSSProperties ]: string | number | (tick? : any): string | number}
    */ Anon_AxisAxisLabel with js.Any = null,
    parent: CSSProperties = null,
    tickLabels: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof react.react.CSSProperties ]: string | number | (tick? : any): string | number}
    */ Anon_AxisAxisLabel with js.Any = null,
    ticks: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof react.react.CSSProperties ]: string | number | (tick? : any): string | number}
    */ Anon_AxisAxisLabel with js.Any = null
  ): AnonAxisAxisLabel = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (axisLabel != null) __obj.updateDynamic("axisLabel")(axisLabel.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (tickLabels != null) __obj.updateDynamic("tickLabels")(tickLabels.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAxisAxisLabel]
  }
}

