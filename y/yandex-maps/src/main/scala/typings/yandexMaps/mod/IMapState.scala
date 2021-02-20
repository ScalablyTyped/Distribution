package typings.yandexMaps.mod

import typings.yandexMaps.mod.control.RulerControl
import typings.yandexMaps.mod.control.TypeSelector
import typings.yandexMaps.mod.control.ZoomControl
import typings.yandexMaps.yandexMapsStrings.yandexNumbersignhybrid
import typings.yandexMaps.yandexMapsStrings.yandexNumbersignmap
import typings.yandexMaps.yandexMapsStrings.yandexNumbersignsatellite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMapState extends StObject {
  
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
  implicit class IMapStateMutableBuilder[Self <: IMapState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehaviors(value: js.Array[String]): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviorsUndefined: Self = StObject.set(x, "behaviors", js.undefined)
    
    @scala.inline
    def setBehaviorsVarargs(value: String*): Self = StObject.set(x, "behaviors", js.Array(value :_*))
    
    @scala.inline
    def setBounds(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setBoundsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "bounds", js.Array(value :_*))
    
    @scala.inline
    def setCenter(value: js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value :_*))
    
    @scala.inline
    def setControls(value: js.Array[String | ZoomControl | RulerControl | TypeSelector]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setControlsVarargs(value: (String | ZoomControl | RulerControl | TypeSelector)*): Self = StObject.set(x, "controls", js.Array(value :_*))
    
    @scala.inline
    def setMargin(value: js.Array[js.Array[Double] | Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMarginVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "margin", js.Array(value :_*))
    
    @scala.inline
    def setType(value: yandexNumbersignmap | yandexNumbersignsatellite | yandexNumbersignhybrid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
