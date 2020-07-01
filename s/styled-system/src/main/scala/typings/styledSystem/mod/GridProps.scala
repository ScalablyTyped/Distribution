package typings.styledSystem.mod

import typings.csstype.mod.GridAreaProperty
import typings.csstype.mod.GridAutoColumnsProperty
import typings.csstype.mod.GridAutoFlowProperty
import typings.csstype.mod.GridAutoRowsProperty
import typings.csstype.mod.GridColumnGapProperty
import typings.csstype.mod.GridColumnProperty
import typings.csstype.mod.GridGapProperty
import typings.csstype.mod.GridRowGapProperty
import typings.csstype.mod.GridRowProperty
import typings.csstype.mod.GridTemplateAreasProperty
import typings.csstype.mod.GridTemplateColumnsProperty
import typings.csstype.mod.GridTemplateRowsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends GridGapProps[ThemeType, GridGapProperty[TLengthStyledSystem]]
     with GridColumnGapProps[ThemeType, GridColumnGapProperty[TLengthStyledSystem]]
     with GridRowGapProps[ThemeType, GridRowGapProperty[TLengthStyledSystem]]
     with GridColumnProps[ThemeType]
     with GridRowProps[ThemeType]
     with GridAutoFlowProps[ThemeType]
     with GridAutoColumnsProps[ThemeType, GridAutoColumnsProperty[TLengthStyledSystem]]
     with GridAutoRowsProps[ThemeType, GridAutoRowsProperty[TLengthStyledSystem]]
     with GridTemplateColumnsProps[ThemeType, GridTemplateColumnsProperty[TLengthStyledSystem]]
     with GridTemplateRowsProps[ThemeType, GridTemplateRowsProperty[TLengthStyledSystem]]
     with GridTemplateAreasProps[ThemeType]
     with GridAreaProps[ThemeType]

object GridProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](
    gridArea: js.UndefOr[Null | (ResponsiveValue[GridAreaProperty, ThemeType])] = js.undefined,
    gridAutoColumns: js.UndefOr[
      Null | (ResponsiveValue[GridAutoColumnsProperty[TLengthStyledSystem], ThemeType])
    ] = js.undefined,
    gridAutoFlow: js.UndefOr[Null | (ResponsiveValue[GridAutoFlowProperty, ThemeType])] = js.undefined,
    gridAutoRows: js.UndefOr[Null | (ResponsiveValue[GridAutoRowsProperty[TLengthStyledSystem], ThemeType])] = js.undefined,
    gridColumn: js.UndefOr[Null | (ResponsiveValue[GridColumnProperty, ThemeType])] = js.undefined,
    gridColumnGap: js.UndefOr[Null | (ResponsiveValue[GridColumnGapProperty[TLengthStyledSystem], ThemeType])] = js.undefined,
    gridGap: js.UndefOr[Null | (ResponsiveValue[GridGapProperty[TLengthStyledSystem], ThemeType])] = js.undefined,
    gridRow: js.UndefOr[Null | (ResponsiveValue[GridRowProperty, ThemeType])] = js.undefined,
    gridRowGap: js.UndefOr[Null | (ResponsiveValue[GridRowGapProperty[TLengthStyledSystem], ThemeType])] = js.undefined,
    gridTemplateAreas: js.UndefOr[Null | (ResponsiveValue[GridTemplateAreasProperty, ThemeType])] = js.undefined,
    gridTemplateColumns: js.UndefOr[
      Null | (ResponsiveValue[GridTemplateColumnsProperty[TLengthStyledSystem], ThemeType])
    ] = js.undefined,
    gridTemplateRows: js.UndefOr[
      Null | (ResponsiveValue[GridTemplateRowsProperty[TLengthStyledSystem], ThemeType])
    ] = js.undefined
  ): GridProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gridArea)) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (!js.isUndefined(gridAutoColumns)) __obj.updateDynamic("gridAutoColumns")(gridAutoColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(gridAutoFlow)) __obj.updateDynamic("gridAutoFlow")(gridAutoFlow.asInstanceOf[js.Any])
    if (!js.isUndefined(gridAutoRows)) __obj.updateDynamic("gridAutoRows")(gridAutoRows.asInstanceOf[js.Any])
    if (!js.isUndefined(gridColumn)) __obj.updateDynamic("gridColumn")(gridColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(gridColumnGap)) __obj.updateDynamic("gridColumnGap")(gridColumnGap.asInstanceOf[js.Any])
    if (!js.isUndefined(gridGap)) __obj.updateDynamic("gridGap")(gridGap.asInstanceOf[js.Any])
    if (!js.isUndefined(gridRow)) __obj.updateDynamic("gridRow")(gridRow.asInstanceOf[js.Any])
    if (!js.isUndefined(gridRowGap)) __obj.updateDynamic("gridRowGap")(gridRowGap.asInstanceOf[js.Any])
    if (!js.isUndefined(gridTemplateAreas)) __obj.updateDynamic("gridTemplateAreas")(gridTemplateAreas.asInstanceOf[js.Any])
    if (!js.isUndefined(gridTemplateColumns)) __obj.updateDynamic("gridTemplateColumns")(gridTemplateColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(gridTemplateRows)) __obj.updateDynamic("gridTemplateRows")(gridTemplateRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps[ThemeType]]
  }
}

