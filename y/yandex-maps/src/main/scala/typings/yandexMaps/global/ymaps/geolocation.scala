package typings.yandexMaps.global.ymaps

import typings.yandexMaps.mod.geolocation.IGeolocationOptions
import typings.yandexMaps.mod.geolocation.IGeolocationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geolocation {
  
  @JSGlobal("ymaps.geolocation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Tries to determine the user's location. Returns the promise object, which will either be confirmed by the object with the field geoObjects or rejected with an error message.
    * The geoObjects field is an instance of GeoObjectCollection. The object that indicates the user's current location will be added to the collection.
    * @param options Options.
    */
  inline def get(): js.Promise[IGeolocationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[IGeolocationResult]]
  inline def get(options: IGeolocationOptions): js.Promise[IGeolocationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IGeolocationResult]]
}
