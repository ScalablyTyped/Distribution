package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.FilterEvent")
@js.native
class FilterEvent () extends TableauEvent {
  /** Gets the name of the field. */
  def getFieldName(): java.lang.String = js.native
  /** Gets the Filter object associated with the event. */
  def getFilterAsync(): stdLib.Promise[ConcreteFilter] = js.native
  /** Gets the Worksheet object associated with the event. */
  def getWorksheet(): Worksheet = js.native
}

