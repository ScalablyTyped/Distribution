package typings.useSidecar.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SideCarHOC extends js.Object {
  
  var sideCar: SideCarMedium = js.native
}
object SideCarHOC {
  
  @scala.inline
  def apply(sideCar: SideCarMedium): SideCarHOC = {
    val __obj = js.Dynamic.literal(sideCar = sideCar.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideCarHOC]
  }
  
  @scala.inline
  implicit class SideCarHOCOps[Self <: SideCarHOC] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSideCar(value: SideCarMedium): Self = this.set("sideCar", value.asInstanceOf[js.Any])
  }
}
