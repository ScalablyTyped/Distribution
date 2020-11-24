package typings.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficImageZIndex extends js.Object {
  
  var trafficImageZIndex: js.UndefOr[Double] = js.native
  
  var trafficInfoZIndex: js.UndefOr[Double] = js.native
  
  var trafficJamZIndex: js.UndefOr[Double] = js.native
}
object TrafficImageZIndex {
  
  @scala.inline
  def apply(): TrafficImageZIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficImageZIndex]
  }
  
  @scala.inline
  implicit class TrafficImageZIndexOps[Self <: TrafficImageZIndex] (val x: Self) extends AnyVal {
    
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
    def setTrafficImageZIndex(value: Double): Self = this.set("trafficImageZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficImageZIndex: Self = this.set("trafficImageZIndex", js.undefined)
    
    @scala.inline
    def setTrafficInfoZIndex(value: Double): Self = this.set("trafficInfoZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficInfoZIndex: Self = this.set("trafficInfoZIndex", js.undefined)
    
    @scala.inline
    def setTrafficJamZIndex(value: Double): Self = this.set("trafficJamZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficJamZIndex: Self = this.set("trafficJamZIndex", js.undefined)
  }
}
