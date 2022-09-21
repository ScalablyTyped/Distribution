package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectManagerOptions
  extends StObject
     with IClustererOptionsInject
     with IClusterPlacemarkOptionsWithClusterPrefix {
  
  var clusterize: js.UndefOr[Boolean] = js.undefined
  
  var geoObjectOpenBalloonOnClick: js.UndefOr[Boolean] = js.undefined
  
  var syncOverlayInit: js.UndefOr[Boolean] = js.undefined
}
object IObjectManagerOptions {
  
  inline def apply(): IObjectManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IObjectManagerOptions]
  }
  
  extension [Self <: IObjectManagerOptions](x: Self) {
    
    inline def setClusterize(value: Boolean): Self = StObject.set(x, "clusterize", value.asInstanceOf[js.Any])
    
    inline def setClusterizeUndefined: Self = StObject.set(x, "clusterize", js.undefined)
    
    inline def setGeoObjectOpenBalloonOnClick(value: Boolean): Self = StObject.set(x, "geoObjectOpenBalloonOnClick", value.asInstanceOf[js.Any])
    
    inline def setGeoObjectOpenBalloonOnClickUndefined: Self = StObject.set(x, "geoObjectOpenBalloonOnClick", js.undefined)
    
    inline def setSyncOverlayInit(value: Boolean): Self = StObject.set(x, "syncOverlayInit", value.asInstanceOf[js.Any])
    
    inline def setSyncOverlayInitUndefined: Self = StObject.set(x, "syncOverlayInit", js.undefined)
  }
}
