package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.CustomViewEvent")
@js.native
class CustomViewEvent () extends TableauEvent {
  /** Gets the CustomView object associated with the event. */
  def getCustomViewAsync(): stdLib.Promise[CustomView] = js.native
}

