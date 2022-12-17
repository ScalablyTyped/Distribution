package typings.styledSystem.mod

import typings.csstype.mod.Property.GridAutoColumns
import typings.csstype.mod.Property.GridAutoRows
import typings.csstype.mod.Property.GridColumnGap
import typings.csstype.mod.Property.GridGap
import typings.csstype.mod.Property.GridRowGap
import typings.csstype.mod.Property.GridTemplateColumns
import typings.csstype.mod.Property.GridTemplateRows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends StObject
     with GridGapProps[ThemeType, GridGap[TLengthStyledSystem]]
     with GridColumnGapProps[ThemeType, GridColumnGap[TLengthStyledSystem]]
     with GridRowGapProps[ThemeType, GridRowGap[TLengthStyledSystem]]
     with GridColumnProps[ThemeType]
     with GridRowProps[ThemeType]
     with GridAutoFlowProps[ThemeType]
     with GridAutoColumnsProps[ThemeType, GridAutoColumns[TLengthStyledSystem]]
     with GridAutoRowsProps[ThemeType, GridAutoRows[TLengthStyledSystem]]
     with GridTemplateColumnsProps[ThemeType, GridTemplateColumns[TLengthStyledSystem]]
     with GridTemplateRowsProps[ThemeType, GridTemplateRows[TLengthStyledSystem]]
     with GridTemplateAreasProps[ThemeType]
     with GridAreaProps[ThemeType]
object GridProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): GridProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps[ThemeType]]
  }
}
