package typings.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.ToolbarStateEvent")
@js.native
class ToolbarStateEvent ()
  extends StObject
     with typings.tableau.tableau.ToolbarStateEvent {
  
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typings.tableau.tableau.TableauEventName = js.native
  
  /** Returns the new ToolbarState. */
  /* CompleteClass */
  override def getToolbarState(): typings.tableau.tableau.ToolbarState = js.native
  
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typings.tableau.tableau.Viz = js.native
}
