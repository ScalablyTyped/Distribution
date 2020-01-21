package typings.useSidecar.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideCarHOC extends js.Object {
  var sideCar: SideCarMedium
}

object SideCarHOC {
  @scala.inline
  def apply(sideCar: SideCarMedium): SideCarHOC = {
    val __obj = js.Dynamic.literal(sideCar = sideCar.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SideCarHOC]
  }
}

