package typings.teslajs

import org.scalablytyped.runtime.StringDictionary
import typings.teslajs.anon.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("teslajs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("teslajs", "API_BODY_LEVEL")
  @js.native
  val API_BODY_LEVEL: Double = js.native
  
  @JSImport("teslajs", "API_CALL_LEVEL")
  @js.native
  val API_CALL_LEVEL: Double = js.native
  
  @JSImport("teslajs", "API_ERR_LEVEL")
  @js.native
  val API_ERR_LEVEL: Double = js.native
  
  @JSImport("teslajs", "API_LOG_ALL")
  @js.native
  val API_LOG_ALL: Double = js.native
  
  @JSImport("teslajs", "API_LOG_ALWAYS")
  @js.native
  val API_LOG_ALWAYS: Double = js.native
  
  @JSImport("teslajs", "API_REQUEST_LEVEL")
  @js.native
  val API_REQUEST_LEVEL: Double = js.native
  
  @JSImport("teslajs", "API_RESPONSE_LEVEL")
  @js.native
  val API_RESPONSE_LEVEL: Double = js.native
  
  @JSImport("teslajs", "API_RETURN_LEVEL")
  @js.native
  val API_RETURN_LEVEL: Double = js.native
  
  @JSImport("teslajs", "CHARGE_DAILY")
  @js.native
  val CHARGE_DAILY: Double = js.native
  
  @JSImport("teslajs", "CHARGE_RANGE")
  @js.native
  val CHARGE_RANGE: Double = js.native
  
  @JSImport("teslajs", "CHARGE_STANDARD")
  @js.native
  val CHARGE_STANDARD: Double = js.native
  
  @JSImport("teslajs", "CHARGE_STORAGE")
  @js.native
  val CHARGE_STORAGE: Double = js.native
  
  @JSImport("teslajs", "FRUNK")
  @js.native
  val FRUNK: String = js.native
  
  @JSImport("teslajs", "MAX_TEMP")
  @js.native
  val MAX_TEMP: Double = js.native
  
  @JSImport("teslajs", "MIN_TEMP")
  @js.native
  val MIN_TEMP: Double = js.native
  
  @JSImport("teslajs", "SUNROOF_CLOSED")
  @js.native
  val SUNROOF_CLOSED: String = js.native
  
  @JSImport("teslajs", "SUNROOF_VENT")
  @js.native
  val SUNROOF_VENT: String = js.native
  
  @JSImport("teslajs", "TRUNK")
  @js.native
  val TRUNK: String = js.native
  
  inline def calendar(options: optionsType, entry: Any, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calendar")(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def calendarAsync(options: optionsType, entry: Any): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("calendarAsync")(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def cancelSoftwareUpdate(options: optionsType, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("cancelSoftwareUpdate")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def cancelSoftwareUpdateAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelSoftwareUpdateAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def chargeMaxRange(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chargeMaxRange")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chargeMaxRangeAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("chargeMaxRangeAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def chargeStandard(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chargeStandard")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chargeStandardAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("chargeStandardAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def chargeState(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chargeState")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chargeStateAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("chargeStateAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  inline def climateStart(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("climateStart")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def climateStartAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("climateStartAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def climateState(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("climateState")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def climateStateAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("climateStateAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  inline def climateStop(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("climateStop")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def climateStopAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("climateStopAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def closeChargePort(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("closeChargePort")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def closeChargePortAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeChargePortAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def doorLock(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doorLock")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def doorLockAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("doorLockAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def doorUnlock(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doorUnlock")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def doorUnlockAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("doorUnlockAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def driveState(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("driveState")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def driveStateAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("driveStateAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  inline def flashLights(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flashLights")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def flashLightsAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("flashLightsAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def getCommand(options: optionsType, command: String, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get_command")(options.asInstanceOf[js.Any], command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getCommandAsync(options: optionsType, command: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("get_commandAsync")(options.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def getLogLevel(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogLevel")().asInstanceOf[Double]
  
  inline def getModel(vehicle: Vehicle_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModel")(vehicle.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPaintColor(vehicle: Vehicle_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaintColor")(vehicle.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPortalBaseURI(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPortalBaseURI")().asInstanceOf[String]
  
  inline def getShortVin(vehicle: Vehicle_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShortVin")(vehicle.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getStreamingBaseURI(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStreamingBaseURI")().asInstanceOf[String]
  
  inline def getVin(vehicle: Vehicle_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVin")(vehicle.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def guiSettings(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("guiSettings")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def guiSettingsAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("guiSettingsAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  inline def homelink(options: optionsType, lat: Double, long: Double, token: String, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("homelink")(options.asInstanceOf[js.Any], lat.asInstanceOf[js.Any], long.asInstanceOf[js.Any], token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def homelinkAsync(options: optionsType, lat: Double, long: Double, token: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("homelinkAsync")(options.asInstanceOf[js.Any], lat.asInstanceOf[js.Any], long.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def honkHorn(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("honkHorn")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def honkHornAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("honkHornAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def login(credentials: Credentials, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("login")(credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loginAsync(credentials: Credentials): js.Promise[TokenResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("loginAsync")(credentials.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TokenResponse]]
  
  inline def logout(authToken: String, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logout")(authToken.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logoutAsync(authToken: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutAsync")(authToken.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def makeCalendarEntry(
    eventName: String,
    location: String,
    startTime: Double,
    endTime: Double,
    accountName: String,
    phoneName: String
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("makeCalendarEntry")(eventName.asInstanceOf[js.Any], location.asInstanceOf[js.Any], startTime.asInstanceOf[js.Any], endTime.asInstanceOf[js.Any], accountName.asInstanceOf[js.Any], phoneName.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def maxDefrost(options: optionsType, onoff: Boolean, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("maxDefrost")(options.asInstanceOf[js.Any], onoff.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def maxDefrostAsync(options: optionsType, onoff: Boolean): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("maxDefrostAsync")(options.asInstanceOf[js.Any], onoff.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def mediaPlayNext(options: optionsType, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mediaPlayNext")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def mediaPlayNextAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaPlayNextAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def mediaPlayNextFavorite(options: optionsType, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mediaPlayNextFavorite")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def mediaPlayNextFavoriteAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaPlayNextFavoriteAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def mediaPlayPrevious(options: optionsType, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mediaPlayPrevious")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def mediaPlayPreviousAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaPlayPreviousAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def mediaPlayPreviousFavorite(options: optionsType, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mediaPlayPreviousFavorite")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def mediaPlayPreviousFavoriteAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaPlayPreviousFavoriteAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def mediaTogglePlayback(options: optionsType, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mediaTogglePlayback")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def mediaTogglePlaybackAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaTogglePlaybackAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def mediaVolumeDown(options: optionsType, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mediaVolumeDown")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def mediaVolumeDownAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaVolumeDownAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def mediaVolumeUp(options: optionsType, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mediaVolumeUp")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def mediaVolumeUpAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaVolumeUpAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def mobileEnabled(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mobileEnabled")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mobileEnabledAsync(options: optionsType): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("mobileEnabledAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  
  inline def navigationRequest(options: optionsType, subject: String, text: String, locale: String, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("navigationRequest")(options.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], text.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def navigationRequestAsync(options: optionsType, subject: String, text: String, locale: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("navigationRequestAsync")(options.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], text.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def nearbyChargers(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("nearbyChargers")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def nearbyChargersAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("nearbyChargersAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  inline def openChargePort(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openChargePort")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def openChargePortAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("openChargePortAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def openTrunk(options: optionsType, which: String, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openTrunk")(options.asInstanceOf[js.Any], which.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def openTrunkAsync(options: optionsType, which: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("openTrunkAsync")(options.asInstanceOf[js.Any], which.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @JSImport("teslajs", "portal")
  @js.native
  val portal: String = js.native
  
  inline def postCommand(options: optionsType, command: String, body: js.Object, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post_command")(options.asInstanceOf[js.Any], command.asInstanceOf[js.Any], body.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def postCommandAsync(options: optionsType, command: String, body: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("post_commandAsync")(options.asInstanceOf[js.Any], command.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def products(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("products")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def productsAsync(options: optionsType): js.Promise[js.Array[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("productsAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Object]]]
  
  inline def refreshToken(refresh_token: String, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refresh_token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def refreshTokenAsync(refresh_token: String): js.Promise[TokenResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshTokenAsync")(refresh_token.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TokenResponse]]
  
  inline def remoteStart(options: optionsType, password: String, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteStart")(options.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def remoteStartAsync(options: optionsType, password: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteStartAsync")(options.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def resetValetPin(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetValetPin")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resetValetPinAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("resetValetPinAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def scheduleSoftwareUpdate(options: optionsType, offset: Double, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleSoftwareUpdate")(options.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def scheduleSoftwareUpdateAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("scheduleSoftwareUpdateAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def seatHeater(options: optionsType, heater: Double, level: Double, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("seatHeater")(options.asInstanceOf[js.Any], heater.asInstanceOf[js.Any], level.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def seatHeaterAsync(options: optionsType, heater: Double, level: Double): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("seatHeaterAsync")(options.asInstanceOf[js.Any], heater.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def setChargeLimit(options: optionsType, amt: Any, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setChargeLimit")(options.asInstanceOf[js.Any], amt.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setChargeLimitAsync(options: optionsType, amt: Any): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("setChargeLimitAsync")(options.asInstanceOf[js.Any], amt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def setLogLevel(level: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setPortalBaseURI(uri: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPortalBaseURI")(uri.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setSentryMode(options: optionsType, onoff: Boolean, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setSentryMode")(options.asInstanceOf[js.Any], onoff.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setSentryModeAsync(options: optionsType, onoff: Boolean): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("setSentryModeAsync")(options.asInstanceOf[js.Any], onoff.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def setStreamingBaseURI(uri: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStreamingBaseURI")(uri.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setTemps(options: optionsType, driver: Double, pass: Double, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTemps")(options.asInstanceOf[js.Any], driver.asInstanceOf[js.Any], pass.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTempsAsync(options: optionsType, driver: Double, pass: Double): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTempsAsync")(options.asInstanceOf[js.Any], driver.asInstanceOf[js.Any], pass.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def setValetMode(options: optionsType, onoff: Boolean, pin: Any, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setValetMode")(options.asInstanceOf[js.Any], onoff.asInstanceOf[js.Any], pin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setValetModeAsync(options: optionsType, onoff: Boolean, pin: Any): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("setValetModeAsync")(options.asInstanceOf[js.Any], onoff.asInstanceOf[js.Any], pin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def solarStatus(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("solarStatus")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def solarStatusAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("solarStatusAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  inline def speedLimitActivate(options: optionsType, pin: Double, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("speedLimitActivate")(options.asInstanceOf[js.Any], pin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def speedLimitActivateAsync(options: optionsType, pin: Double): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("speedLimitActivateAsync")(options.asInstanceOf[js.Any], pin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def speedLimitClearPin(options: optionsType, pin: Double, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("speedLimitClearPin")(options.asInstanceOf[js.Any], pin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def speedLimitClearPinAsync(options: optionsType, pin: Double): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("speedLimitClearPinAsync")(options.asInstanceOf[js.Any], pin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def speedLimitDeactivate(options: optionsType, pin: Double, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("speedLimitDeactivate")(options.asInstanceOf[js.Any], pin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def speedLimitDeactivateAsync(options: optionsType, pin: Double): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("speedLimitDeactivateAsync")(options.asInstanceOf[js.Any], pin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def speedLimitSetLimit(options: optionsType, limit: Double, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("speedLimitSetLimit")(options.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def speedLimitSetLimitAsync(options: optionsType, limit: Double): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("speedLimitSetLimitAsync")(options.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def startCharge(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startCharge")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def startChargeAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("startChargeAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  inline def startStreaming(options: Any, callback: nodeBack, onDataCb: nodeBack): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("startStreaming")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], onDataCb.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def steeringHeater(options: optionsType, level: Double, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("steeringHeater")(options.asInstanceOf[js.Any], level.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def steeringHeaterAsync(options: optionsType, level: Double): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("steeringHeaterAsync")(options.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def stopCharge(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stopCharge")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stopChargeAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("stopChargeAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @JSImport("teslajs", "streamingColumns")
  @js.native
  val streamingColumns: js.Array[String] = js.native
  
  @JSImport("teslajs", "streamingPortal")
  @js.native
  val streamingPortal: String = js.native
  
  inline def sunRoofControl(options: optionsType, state: String, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sunRoofControl")(options.asInstanceOf[js.Any], state.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sunRoofControlAsync(options: optionsType, state: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("sunRoofControlAsync")(options.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def sunRoofMove(options: optionsType, percent: Any, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sunRoofMove")(options.asInstanceOf[js.Any], percent.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sunRoofMoveAsync(options: optionsType, percent: Any): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("sunRoofMoveAsync")(options.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def vehicle(options: optionsType, callback: nodeBack): Vehicle_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vehicle")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Vehicle_]
  
  inline def vehicleAsync(options: optionsType): js.Promise[Vehicle_] = ^.asInstanceOf[js.Dynamic].applyDynamic("vehicleAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Vehicle_]]
  
  inline def vehicleConfig(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vehicleConfig")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def vehicleConfigAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("vehicleConfigAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  inline def vehicleData(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vehicleData")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def vehicleDataAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("vehicleDataAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  inline def vehicleState(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vehicleState")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def vehicleStateAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("vehicleStateAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  inline def vehicles(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vehicles")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def vehiclesAsync(options: optionsType): js.Promise[js.Array[StringDictionary[String | Double | Boolean | Null]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("vehiclesAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[StringDictionary[String | Double | Boolean | Null]]]]
  
  inline def vinDecode(vehicle: Vehicle_): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("vinDecode")(vehicle.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def wakeUp(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wakeUp")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def wakeUpAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("wakeUpAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  inline def windowControl(options: optionsType, command: String, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("windowControl")(options.asInstanceOf[js.Any], command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def windowControlAsync(options: optionsType, command: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowControlAsync")(options.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  trait Credentials extends StObject {
    
    var mfaDeviceName: js.UndefOr[String] = js.undefined
    
    var mfaPassCode: js.UndefOr[String] = js.undefined
    
    var password: String
    
    var username: String
  }
  object Credentials {
    
    inline def apply(password: String, username: String): Credentials = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      inline def setMfaDeviceName(value: String): Self = StObject.set(x, "mfaDeviceName", value.asInstanceOf[js.Any])
      
      inline def setMfaDeviceNameUndefined: Self = StObject.set(x, "mfaDeviceName", js.undefined)
      
      inline def setMfaPassCode(value: String): Self = StObject.set(x, "mfaPassCode", value.asInstanceOf[js.Any])
      
      inline def setMfaPassCodeUndefined: Self = StObject.set(x, "mfaPassCode", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait Result extends StObject {
    
    var reason: String
    
    var result: Boolean
  }
  object Result {
    
    inline def apply(reason: String, result: Boolean): Result = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenResponse extends StObject {
    
    var authToken: String
    
    var body: js.Object
    
    var refreshToken: String
    
    var response: js.Object
  }
  object TokenResponse {
    
    inline def apply(authToken: String, body: js.Object, refreshToken: String, response: js.Object): TokenResponse = {
      val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenResponse] (val x: Self) extends AnyVal {
      
      inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      inline def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: js.Object): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  trait Vehicle_
    extends StObject
       with /* key */ StringDictionary[String | Double | Boolean | Null] {
    
    var id: String
    
    var vehicleID: Double
  }
  object Vehicle_ {
    
    inline def apply(id: String, vehicleID: Double): Vehicle_ = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], vehicleID = vehicleID.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vehicle_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Vehicle_] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setVehicleID(value: Double): Self = StObject.set(x, "vehicleID", value.asInstanceOf[js.Any])
    }
  }
  
  type nodeBack = js.Function2[/* error */ js.Error, /* data */ Any, Any]
  
  trait optionsType extends StObject {
    
    var authToken: String
    
    var carIndex: js.UndefOr[Double] = js.undefined
    
    var vehicleID: String
  }
  object optionsType {
    
    inline def apply(authToken: String, vehicleID: String): optionsType = {
      val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], vehicleID = vehicleID.asInstanceOf[js.Any])
      __obj.asInstanceOf[optionsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: optionsType] (val x: Self) extends AnyVal {
      
      inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      inline def setCarIndex(value: Double): Self = StObject.set(x, "carIndex", value.asInstanceOf[js.Any])
      
      inline def setCarIndexUndefined: Self = StObject.set(x, "carIndex", js.undefined)
      
      inline def setVehicleID(value: String): Self = StObject.set(x, "vehicleID", value.asInstanceOf[js.Any])
    }
  }
}
