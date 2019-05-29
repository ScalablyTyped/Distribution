package typings
package victoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxisAxisLabel extends js.Object {
  var axis: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var axisLabel: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var grid: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof react.react.CSSProperties ]: string | number | (tick? : any): string | number}
    */ victoryLib.victoryLibStrings.Anon_AxisAxisLabel with js.Any
  ] = js.undefined
  var parent: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var tickLabels: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof react.react.CSSProperties ]: string | number | (tick? : any): string | number}
    */ victoryLib.victoryLibStrings.Anon_AxisAxisLabel with js.Any
  ] = js.undefined
  var ticks: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof react.react.CSSProperties ]: string | number | (tick? : any): string | number}
    */ victoryLib.victoryLibStrings.Anon_AxisAxisLabel with js.Any
  ] = js.undefined
}

object Anon_AxisAxisLabel {
  @scala.inline
  def apply(
    axis: reactLib.reactMod.CSSProperties = null,
    axisLabel: reactLib.reactMod.CSSProperties = null,
    grid: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof react.react.CSSProperties ]: string | number | (tick? : any): string | number}
    */ victoryLib.victoryLibStrings.Anon_AxisAxisLabel with js.Any = null,
    parent: reactLib.reactMod.CSSProperties = null,
    tickLabels: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof react.react.CSSProperties ]: string | number | (tick? : any): string | number}
    */ victoryLib.victoryLibStrings.Anon_AxisAxisLabel with js.Any = null,
    ticks: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof react.react.CSSProperties ]: string | number | (tick? : any): string | number}
    */ victoryLib.victoryLibStrings.Anon_AxisAxisLabel with js.Any = null
  ): Anon_AxisAxisLabel = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (axisLabel != null) __obj.updateDynamic("axisLabel")(axisLabel)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (tickLabels != null) __obj.updateDynamic("tickLabels")(tickLabels)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    __obj.asInstanceOf[Anon_AxisAxisLabel]
  }
}

