package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.geojson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSONTransform extends _Transforms {
  
  var fields: js.UndefOr[Vector2[FieldRef] | SignalRef] = js.native
  
  var geojson: js.UndefOr[FieldRef] = js.native
  
  var signal: js.UndefOr[SignalName] = js.native
  
  var `type`: geojson = js.native
}
object GeoJSONTransform {
  
  @scala.inline
  def apply(`type`: geojson): GeoJSONTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONTransform]
  }
  
  @scala.inline
  implicit class GeoJSONTransformOps[Self <: GeoJSONTransform] (val x: Self) extends AnyVal {
    
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
    def setType(value: geojson): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: Vector2[FieldRef] | SignalRef): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setGeojson(value: FieldRef): Self = this.set("geojson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeojson: Self = this.set("geojson", js.undefined)
    
    @scala.inline
    def setSignal(value: SignalName): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
}
