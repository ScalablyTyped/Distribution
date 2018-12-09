package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.ParameterEvent")
@js.native
class ParameterEvent () extends TableauEvent {
  /** Gets the Parameter object that triggered the event. */
  def getParameterAsync(): js.Promise[Parameter] = js.native
  /** Gets the name of the parameter that changed. */
  def getParameterName(): java.lang.String = js.native
}

