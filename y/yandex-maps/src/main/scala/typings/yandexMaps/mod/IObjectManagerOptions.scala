package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectManagerOptions extends StObject {
  
  var clusterHasBalloon: js.UndefOr[Boolean] = js.undefined
  
  var clusterize: js.UndefOr[Boolean] = js.undefined
  
  var geoObjectOpenBalloonOnClick: js.UndefOr[Boolean] = js.undefined
  
  var syncOverlayInit: js.UndefOr[Boolean] = js.undefined
  
  var viewportMargin: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object IObjectManagerOptions {
  
  inline def apply(): IObjectManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IObjectManagerOptions]
  }
  
  extension [Self <: IObjectManagerOptions](x: Self) {
    
    inline def setClusterHasBalloon(value: Boolean): Self = StObject.set(x, "clusterHasBalloon", value.asInstanceOf[js.Any])
    
    inline def setClusterHasBalloonUndefined: Self = StObject.set(x, "clusterHasBalloon", js.undefined)
    
    inline def setClusterize(value: Boolean): Self = StObject.set(x, "clusterize", value.asInstanceOf[js.Any])
    
    inline def setClusterizeUndefined: Self = StObject.set(x, "clusterize", js.undefined)
    
    inline def setGeoObjectOpenBalloonOnClick(value: Boolean): Self = StObject.set(x, "geoObjectOpenBalloonOnClick", value.asInstanceOf[js.Any])
    
    inline def setGeoObjectOpenBalloonOnClickUndefined: Self = StObject.set(x, "geoObjectOpenBalloonOnClick", js.undefined)
    
    inline def setSyncOverlayInit(value: Boolean): Self = StObject.set(x, "syncOverlayInit", value.asInstanceOf[js.Any])
    
    inline def setSyncOverlayInitUndefined: Self = StObject.set(x, "syncOverlayInit", js.undefined)
    
    inline def setViewportMargin(value: Double | js.Array[Double]): Self = StObject.set(x, "viewportMargin", value.asInstanceOf[js.Any])
    
    inline def setViewportMarginUndefined: Self = StObject.set(x, "viewportMargin", js.undefined)
    
    inline def setViewportMarginVarargs(value: Double*): Self = StObject.set(x, "viewportMargin", js.Array(value :_*))
  }
}
