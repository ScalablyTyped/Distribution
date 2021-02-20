package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridsProps
  extends GridGapProps[StyledSystemLength]
     with GridColumnGapProps[StyledSystemLength]
     with GridRowGapProps[StyledSystemLength]
     with GridColumnProps
     with GridRowProps
     with GridAutoFlowProps
     with GridAutoColumnsProps[StyledSystemLength]
     with GridAutoRowsProps[StyledSystemLength]
     with GridTemplateColumnsProps[StyledSystemLength]
     with GridTemplateRowsProps[StyledSystemLength]
     with GridTemplateAreasProps
     with GridAreaProps
object GridsProps {
  
  @scala.inline
  def apply(): GridsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridsProps]
  }
}
