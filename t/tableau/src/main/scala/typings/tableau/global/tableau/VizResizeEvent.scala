package typings.tableau.global.tableau

import typings.tableau.tableau.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.VizResizeEvent")
@js.native
open class VizResizeEvent ()
  extends StObject
     with typings.tableau.tableau.VizResizeEvent {
  
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typings.tableau.tableau.TableauEventName = js.native
  
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typings.tableau.tableau.Viz = js.native
  
  /** Gets the sheetSize record for the current sheet. For more information, see SheetSizeOptions Record. */
  /* CompleteClass */
  override def getVizSize(): Size = js.native
}
