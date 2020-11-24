package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoObjectFeature extends js.Object {
  
  var geometry: js.UndefOr[IGeometry | IGeometryJson] = js.native
  
  var properties: js.UndefOr[IDataManager | js.Object] = js.native
}
object IGeoObjectFeature {
  
  @scala.inline
  def apply(): IGeoObjectFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoObjectFeature]
  }
  
  @scala.inline
  implicit class IGeoObjectFeatureOps[Self <: IGeoObjectFeature] (val x: Self) extends AnyVal {
    
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
    def setGeometry(value: IGeometry | IGeometryJson): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
    
    @scala.inline
    def setProperties(value: IDataManager | js.Object): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
