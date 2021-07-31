package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ToolbarPosition extends StObject
@JSGlobal("tableau.ToolbarPosition")
@js.native
object ToolbarPosition extends StObject {
  
  /** Positions the toolbar along the bottom of the visualization. */
  @js.native
  sealed trait BOTTOM
    extends StObject
       with ToolbarPosition
  
  /** Positions the toolbar along the top of the visualization. */
  @js.native
  sealed trait TOP
    extends StObject
       with ToolbarPosition
}
