package typings.yandexMaps.anon

import typings.yandexMaps.mod.geolocation.IGeolocationOptions
import typings.yandexMaps.mod.geolocation.IGeolocationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofgeolocation extends StObject {
  
  /**
    * Tries to determine the user's location. Returns the promise object, which will either be confirmed by the object with the field geoObjects or rejected with an error message.
    * The geoObjects field is an instance of GeoObjectCollection. The object that indicates the user's current location will be added to the collection.
    * @param options Options.
    */
  def get(): js.Promise[IGeolocationResult] = js.native
  def get(options: IGeolocationOptions): js.Promise[IGeolocationResult] = js.native
}
