package typings.vegaTypings.transformMod

import typings.vegaTypings.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.geopath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoPathTransform extends _Transforms {
  
  var as: js.UndefOr[String | SignalRef] = js.native
  
  var field: js.UndefOr[FieldRef] = js.native
  
  var pointRadius: js.UndefOr[Double | SignalRef | ExprRef] = js.native
  
  var projection: js.UndefOr[ProjectionName] = js.native
  
  var `type`: geopath = js.native
}
object GeoPathTransform {
  
  @scala.inline
  def apply(`type`: geopath): GeoPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoPathTransform]
  }
  
  @scala.inline
  implicit class GeoPathTransformOps[Self <: GeoPathTransform] (val x: Self) extends AnyVal {
    
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
    def setType(value: geopath): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: String | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setField(value: FieldRef): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setPointRadius(value: Double | SignalRef | ExprRef): Self = this.set("pointRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointRadius: Self = this.set("pointRadius", js.undefined)
    
    @scala.inline
    def setProjection(value: ProjectionName): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
  }
}
