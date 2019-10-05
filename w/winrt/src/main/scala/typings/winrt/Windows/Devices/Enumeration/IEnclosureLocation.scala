package typings.winrt.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnclosureLocation extends js.Object {
  var inDock: Boolean
  var inLid: Boolean
  var panel: Panel
}

object IEnclosureLocation {
  @scala.inline
  def apply(inDock: Boolean, inLid: Boolean, panel: Panel): IEnclosureLocation = {
    val __obj = js.Dynamic.literal(inDock = inDock, inLid = inLid, panel = panel)
  
    __obj.asInstanceOf[IEnclosureLocation]
  }
}

