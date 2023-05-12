package typings.yandexMaps.mod

import typings.yandexMaps.yandexMapsStrings.auto
import typings.yandexMaps.yandexMapsStrings.browser
import typings.yandexMaps.yandexMapsStrings.yandex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geolocation {
  
  @JSImport("yandex-maps", "geolocation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Tries to determine the user's location. Returns the promise object, which will either be confirmed by the object with the field geoObjects or rejected with an error message.
    * The geoObjects field is an instance of GeoObjectCollection. The object that indicates the user's current location will be added to the collection.
    * @param options Options.
    */
  inline def get(): js.Promise[IGeolocationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[IGeolocationResult]]
  inline def get(options: IGeolocationOptions): js.Promise[IGeolocationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IGeolocationResult]]
  
  trait IGeolocationOptions extends StObject {
    
    /**
      * If true, geocode the user position automatically; if false, return as it is.
      * If automatic geocoding is used, the object marking the user's current position has the same structure as the result of executing geocode.
      */
    var autoReverseGeocode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the map center and zoom level are adjusted automatically to show the current location of the user; if false, nothing happens.
      */
    var mapStateAutoApply: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Geolocation provider. Accepted values:
      *  'yandex' - geolocation according to the Yandex data, based on the user IP-address;
      *  'browser' - built-in browser geolocation;
      *  'auto' - try to locate the user by all means available and then choose the best value.
      */
    var provider: js.UndefOr[yandex | browser | auto] = js.undefined
    
    /**
      * The response time, in milliseconds.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to account for map margins map.margin.Manager when automatically centering and zooming the map.
      */
    var useMapMargin: js.UndefOr[Boolean] = js.undefined
  }
  object IGeolocationOptions {
    
    inline def apply(): IGeolocationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGeolocationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGeolocationOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoReverseGeocode(value: Boolean): Self = StObject.set(x, "autoReverseGeocode", value.asInstanceOf[js.Any])
      
      inline def setAutoReverseGeocodeUndefined: Self = StObject.set(x, "autoReverseGeocode", js.undefined)
      
      inline def setMapStateAutoApply(value: Boolean): Self = StObject.set(x, "mapStateAutoApply", value.asInstanceOf[js.Any])
      
      inline def setMapStateAutoApplyUndefined: Self = StObject.set(x, "mapStateAutoApply", js.undefined)
      
      inline def setProvider(value: yandex | browser | auto): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUseMapMargin(value: Boolean): Self = StObject.set(x, "useMapMargin", value.asInstanceOf[js.Any])
      
      inline def setUseMapMarginUndefined: Self = StObject.set(x, "useMapMargin", js.undefined)
    }
  }
  
  trait IGeolocationResult extends StObject {
    
    /**
      * Geolocation results.
      */
    var geoObjects: GeoObjectCollection
  }
  object IGeolocationResult {
    
    inline def apply(geoObjects: GeoObjectCollection): IGeolocationResult = {
      val __obj = js.Dynamic.literal(geoObjects = geoObjects.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGeolocationResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGeolocationResult] (val x: Self) extends AnyVal {
      
      inline def setGeoObjects(value: GeoObjectCollection): Self = StObject.set(x, "geoObjects", value.asInstanceOf[js.Any])
    }
  }
}
