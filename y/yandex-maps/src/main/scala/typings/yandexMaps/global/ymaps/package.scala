package typings.yandexMaps.global.ymaps

import typings.yandexMaps.global.ymaps.^
import typings.yandexMaps.mod.IGeocodeOptions
import typings.yandexMaps.mod.IGeocodeResult
import typings.yandexMaps.mod.IReadyObject
import typings.yandexMaps.mod.ISuggestOptions
import typings.yandexMaps.mod.ISuggestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Processes geocoding requests. The request result can be provided in JSON format or as a GeoObjectCollection object.
  * @param request The address for which coordinates need to be obtained (forward geocoding), or the coordinates for which the address needs to be determined (reverse geocoding).
  * @param options Options.
  */
inline def geocode(request: String): js.Promise[IGeocodeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IGeocodeResult]]
inline def geocode(request: String, options: IGeocodeOptions): js.Promise[IGeocodeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(request.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IGeocodeResult]]
inline def geocode(request: js.Array[Double]): js.Promise[IGeocodeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IGeocodeResult]]
inline def geocode(request: js.Array[Double], options: IGeocodeOptions): js.Promise[IGeocodeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(request.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IGeocodeResult]]

inline def ready(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")().asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: js.Function0[Any | IReadyObject]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: js.Function0[Any | IReadyObject], errorCallback: js.Function0[Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ready(
  successCallback: js.Function0[Any | IReadyObject],
  errorCallback: js.Function0[Any],
  context: js.Object
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: js.Function0[Any | IReadyObject], errorCallback: Unit, context: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: Unit, errorCallback: js.Function0[Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: Unit, errorCallback: js.Function0[Any], context: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: Unit, errorCallback: Unit, context: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

/**
  * Processes requests for search suggestions.
  * Returns a promise object that is either rejected with an error,
  * or confirmed by an array of objects in the format { displayName: "Mitishi, Moscow region", value: "Russia, Moscow region, Mitishi " }.
  * The displayName field represents the toponym in a user-friendly way,
  * and the value field represents the value which should be inserted into the search field after the user selects the suggestion.
  * @param request Request string.
  * @param options Options.
  */
inline def suggest(request: String): js.Promise[js.Array[ISuggestResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("suggest")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ISuggestResult]]]
inline def suggest(request: String, options: ISuggestOptions): js.Promise[js.Array[ISuggestResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("suggest")(request.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ISuggestResult]]]
