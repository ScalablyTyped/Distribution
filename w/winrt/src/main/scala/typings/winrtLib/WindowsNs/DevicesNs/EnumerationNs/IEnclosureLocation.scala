package typings
package winrtLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnclosureLocation extends js.Object {
  var inDock: scala.Boolean
  var inLid: scala.Boolean
  var panel: Panel
}

object IEnclosureLocation {
  @scala.inline
  def apply(inDock: scala.Boolean, inLid: scala.Boolean, panel: Panel): IEnclosureLocation = {
    val __obj = js.Dynamic.literal(inDock = inDock, inLid = inLid, panel = panel)
  
    __obj.asInstanceOf[IEnclosureLocation]
  }
}

