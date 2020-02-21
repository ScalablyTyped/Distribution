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
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](
    gridArea: ResponsiveValue[GridAreaProperty, ThemeType] = null,
    gridAutoColumns: ResponsiveValue[GridAutoColumnsProperty[TLengthStyledSystem], ThemeType] = null,
    gridAutoFlow: ResponsiveValue[GridAutoFlowProperty, ThemeType] = null,
    gridAutoRows: ResponsiveValue[GridAutoRowsProperty[TLengthStyledSystem], ThemeType] = null,
    gridColumn: ResponsiveValue[GridColumnProperty, ThemeType] = null,
    gridColumnGap: ResponsiveValue[GridColumnGapProperty[TLengthStyledSystem], ThemeType] = null,
    gridGap: ResponsiveValue[GridGapProperty[TLengthStyledSystem], ThemeType] = null,
    gridRow: ResponsiveValue[GridRowProperty, ThemeType] = null,
    gridRowGap: ResponsiveValue[GridRowGapProperty[TLengthStyledSystem], ThemeType] = null,
    gridTemplateAreas: ResponsiveValue[GridTemplateAreasProperty, ThemeType] = null,
    gridTemplateColumns: ResponsiveValue[GridTemplateColumnsProperty[TLengthStyledSystem], ThemeType] = null,
    gridTemplateRows: ResponsiveValue[GridTemplateRowsProperty[TLengthStyledSystem], ThemeType] = null
  ): GridProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (gridAutoColumns != null) __obj.updateDynamic("gridAutoColumns")(gridAutoColumns.asInstanceOf[js.Any])
    if (gridAutoFlow != null) __obj.updateDynamic("gridAutoFlow")(gridAutoFlow.asInstanceOf[js.Any])
    if (gridAutoRows != null) __obj.updateDynamic("gridAutoRows")(gridAutoRows.asInstanceOf[js.Any])
    if (gridColumn != null) __obj.updateDynamic("gridColumn")(gridColumn.asInstanceOf[js.Any])
    if (gridColumnGap != null) __obj.updateDynamic("gridColumnGap")(gridColumnGap.asInstanceOf[js.Any])
    if (gridGap != null) __obj.updateDynamic("gridGap")(gridGap.asInstanceOf[js.Any])
    if (gridRow != null) __obj.updateDynamic("gridRow")(gridRow.asInstanceOf[js.Any])
    if (gridRowGap != null) __obj.updateDynamic("gridRowGap")(gridRowGap.asInstanceOf[js.Any])
    if (gridTemplateAreas != null) __obj.updateDynamic("gridTemplateAreas")(gridTemplateAreas.asInstanceOf[js.Any])
    if (gridTemplateColumns != null) __obj.updateDynamic("gridTemplateColumns")(gridTemplateColumns.asInstanceOf[js.Any])
    if (gridTemplateRows != null) __obj.updateDynamic("gridTemplateRows")(gridTemplateRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps[ThemeType]]
  }
}

