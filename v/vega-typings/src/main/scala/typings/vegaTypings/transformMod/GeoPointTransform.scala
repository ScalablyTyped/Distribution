package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.geopoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoPointTransform extends _Transforms {
  
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.native
  
  var fields: Vector2[FieldRef] | SignalRef = js.native
  
  var projection: ProjectionName = js.native
  
  var `type`: geopoint = js.native
}
object GeoPointTransform {
  
  @scala.inline
  def apply(fields: Vector2[FieldRef] | SignalRef, projection: ProjectionName, `type`: geopoint): GeoPointTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoPointTransform]
  }
  
  @scala.inline
  implicit class GeoPointTransformOps[Self <: GeoPointTransform] (val x: Self) extends AnyVal {
    
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
    def setFields(value: Vector2[FieldRef] | SignalRef): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjection(value: ProjectionName): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: geopoint): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
  }
}
