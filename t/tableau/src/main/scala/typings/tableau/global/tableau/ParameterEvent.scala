package typings.tableau.global.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.ParameterEvent")
@js.native
class ParameterEvent ()
  extends typings.tableau.tableau.ParameterEvent {
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typings.tableau.tableau.TableauEventName = js.native
  /** Gets the Parameter object that triggered the event. */
  /* CompleteClass */
  override def getParameterAsync(): js.Promise[typings.tableau.tableau.Parameter] = js.native
  /** Gets the name of the parameter that changed. */
  /* CompleteClass */
  override def getParameterName(): String = js.native
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typings.tableau.tableau.Viz = js.native
}

