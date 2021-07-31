package typings.yandexMaps.anon

import typings.yandexMaps.yandexMapsStrings.yandexNumbersignairPanorama
import typings.yandexMaps.yandexMapsStrings.yandexNumbersignpanorama
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: js.UndefOr[js.Array[Double] | String] = js.undefined
  
  var layer: js.UndefOr[yandexNumbersignpanorama | yandexNumbersignairPanorama] = js.undefined
  
  var span: js.UndefOr[js.Array[Double] | String] = js.undefined
}
object Direction {
  
  @scala.inline
  def apply(): Direction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit class DirectionMutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: js.Array[Double] | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDirectionVarargs(value: Double*): Self = StObject.set(x, "direction", js.Array(value :_*))
    
    @scala.inline
    def setLayer(value: yandexNumbersignpanorama | yandexNumbersignairPanorama): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setSpan(value: js.Array[Double] | String): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    @scala.inline
    def setSpanVarargs(value: Double*): Self = StObject.set(x, "span", js.Array(value :_*))
  }
}
