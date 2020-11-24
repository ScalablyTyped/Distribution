package typings.yandexMaps.mod

import typings.yandexMaps.mod.control.RulerControl
import typings.yandexMaps.mod.control.TypeSelector
import typings.yandexMaps.mod.control.ZoomControl
import typings.yandexMaps.yandexMapsStrings.yandexNumbersignhybrid
import typings.yandexMaps.yandexMapsStrings.yandexNumbersignmap
import typings.yandexMaps.yandexMapsStrings.yandexNumbersignsatellite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMapState extends js.Object {
  
  var behaviors: js.UndefOr[js.Array[String]] = js.native
  
  var bounds: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  var center: js.UndefOr[js.Array[Double]] = js.native
  
  var controls: js.UndefOr[js.Array[String | ZoomControl | RulerControl | TypeSelector]] = js.native
  
  var margin: js.UndefOr[js.Array[js.Array[Double] | Double]] = js.native
  
  var `type`: js.UndefOr[yandexNumbersignmap | yandexNumbersignsatellite | yandexNumbersignhybrid] = js.native
  
  var zoom: js.UndefOr[Double] = js.native
}
object IMapState {
  
  @scala.inline
  def apply(): IMapState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapState]
  }
  
  @scala.inline
  implicit class IMapStateOps[Self <: IMapState] (val x: Self) extends AnyVal {
    
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
    def setBehaviorsVarargs(value: String*): Self = this.set("behaviors", js.Array(value :_*))
    
    @scala.inline
    def setBehaviors(value: js.Array[String]): Self = this.set("behaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehaviors: Self = this.set("behaviors", js.undefined)
    
    @scala.inline
    def setBoundsVarargs(value: js.Array[Double]*): Self = this.set("bounds", js.Array(value :_*))
    
    @scala.inline
    def setBounds(value: js.Array[js.Array[Double]]): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setCenterVarargs(value: Double*): Self = this.set("center", js.Array(value :_*))
    
    @scala.inline
    def setCenter(value: js.Array[Double]): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setControlsVarargs(value: (String | ZoomControl | RulerControl | TypeSelector)*): Self = this.set("controls", js.Array(value :_*))
    
    @scala.inline
    def setControls(value: js.Array[String | ZoomControl | RulerControl | TypeSelector]): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setMarginVarargs(value: (js.Array[Double] | Double)*): Self = this.set("margin", js.Array(value :_*))
    
    @scala.inline
    def setMargin(value: js.Array[js.Array[Double] | Double]): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setType(value: yandexNumbersignmap | yandexNumbersignsatellite | yandexNumbersignhybrid): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
