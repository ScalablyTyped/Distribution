package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapContextGetRegionResult extends js.Object {
  
  /**
    * 东北角的经纬度
    */
  var northeast: js.UndefOr[LocationObject] = js.native
  
  /**
    * 西南角的经纬度
    */
  var southwest: js.UndefOr[LocationObject] = js.native
}
object MapContextGetRegionResult {
  
  @scala.inline
  def apply(): MapContextGetRegionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapContextGetRegionResult]
  }
  
  @scala.inline
  implicit class MapContextGetRegionResultOps[Self <: MapContextGetRegionResult] (val x: Self) extends AnyVal {
    
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
    def setNortheast(value: LocationObject): Self = this.set("northeast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNortheast: Self = this.set("northeast", js.undefined)
    
    @scala.inline
    def setSouthwest(value: LocationObject): Self = this.set("southwest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSouthwest: Self = this.set("southwest", js.undefined)
  }
}
