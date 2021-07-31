package typings.teslajs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
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
  
  @scala.inline
  def calendar(options: optionsType, entry: js.Any, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calendar")(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def calendarAsync(options: optionsType, entry: js.Any): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("calendarAsync")(options.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def cancelSoftwareUpdate(options: optionsType, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("cancelSoftwareUpdate")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def cancelSoftwareUpdateAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelSoftwareUpdateAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def chargeMaxRange(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chargeMaxRange")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def chargeMaxRangeAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("chargeMaxRangeAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def chargeStandard(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chargeStandard")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def chargeStandardAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("chargeStandardAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def chargeState(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chargeState")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def chargeStateAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("chargeStateAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  @scala.inline
  def climateStart(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("climateStart")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def climateStartAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("climateStartAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def climateState(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("climateState")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def climateStateAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("climateStateAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  @scala.inline
  def climateStop(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("climateStop")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def climateStopAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("climateStopAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def closeChargePort(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("closeChargePort")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def closeChargePortAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeChargePortAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def doorLock(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doorLock")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def doorLockAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("doorLockAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def doorUnlock(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doorUnlock")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def doorUnlockAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("doorUnlockAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def driveState(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("driveState")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def driveStateAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("driveStateAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  @scala.inline
  def flashLights(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flashLights")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def flashLightsAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("flashLightsAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def getCommand(options: optionsType, command: String, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get_command")(options.asInstanceOf[js.Any], command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getCommandAsync(options: optionsType, command: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("get_commandAsync")(options.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def getLogLevel(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogLevel")().asInstanceOf[Double]
  
  @scala.inline
  def getModel(vehicle: Vehicle_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModel")(vehicle.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getPaintColor(vehicle: Vehicle_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaintColor")(vehicle.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getPortalBaseURI(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPortalBaseURI")().asInstanceOf[String]
  
  @scala.inline
  def getShortVin(vehicle: Vehicle_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShortVin")(vehicle.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getStreamingBaseURI(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStreamingBaseURI")().asInstanceOf[String]
  
  @scala.inline
  def getVin(vehicle: Vehicle_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVin")(vehicle.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def guiSettings(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("guiSettings")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def guiSettingsAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("guiSettingsAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  @scala.inline
  def homelink(options: optionsType, lat: Double, long: Double, token: String, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("homelink")(options.asInstanceOf[js.Any], lat.asInstanceOf[js.Any], long.asInstanceOf[js.Any], token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def homelinkAsync(options: optionsType, lat: Double, long: Double, token: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("homelinkAsync")(options.asInstanceOf[js.Any], lat.asInstanceOf[js.Any], long.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def honkHorn(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("honkHorn")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def honkHornAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("honkHornAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def login(username: String, password: String, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("login")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def loginAsync(username: String, password: String): js.Promise[TokenResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("loginAsync")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TokenResponse]]
  
  @scala.inline
  def logout(authToken: String, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logout")(authToken.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def logoutAsync(authToken: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutAsync")(authToken.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def makeCalendarEntry(
    eventName: String,
    location: String,
    startTime: Double,
    endTime: Double,
    accountName: String,
    phoneName: String
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("makeCalendarEntry")(eventName.asInstanceOf[js.Any], location.asInstanceOf[js.Any], startTime.asInstanceOf[js.Any], endTime.asInstanceOf[js.Any], accountName.asInstanceOf[js.Any], phoneName.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def maxDefrost(options: optionsType, onoff: Boolean, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("maxDefrost")(options.asInstanceOf[js.Any], onoff.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def maxDefrostAsync(options: optionsType, onoff: Boolean): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("maxDefrostAsync")(options.asInstanceOf[js.Any], onoff.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def mediaPlayNext(options: optionsType, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mediaPlayNext")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def mediaPlayNextAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaPlayNextAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def mediaPlayNextFavorite(options: optionsType, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mediaPlayNextFavorite")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def mediaPlayNextFavoriteAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaPlayNextFavoriteAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def mediaPlayPrevious(options: optionsType, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mediaPlayPrevious")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def mediaPlayPreviousAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaPlayPreviousAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def mediaPlayPreviousFavorite(options: optionsType, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mediaPlayPreviousFavorite")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def mediaPlayPreviousFavoriteAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaPlayPreviousFavoriteAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def mediaTogglePlayback(options: optionsType, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mediaTogglePlayback")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def mediaTogglePlaybackAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaTogglePlaybackAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def mediaVolumeDown(options: optionsType, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mediaVolumeDown")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def mediaVolumeDownAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaVolumeDownAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def mediaVolumeUp(options: optionsType, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mediaVolumeUp")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def mediaVolumeUpAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaVolumeUpAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def mobileEnabled(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mobileEnabled")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def mobileEnabledAsync(options: optionsType): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("mobileEnabledAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  
  @scala.inline
  def navigationRequest(options: optionsType, subject: String, text: String, locale: String, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("navigationRequest")(options.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], text.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def navigationRequestAsync(options: optionsType, subject: String, text: String, locale: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("navigationRequestAsync")(options.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], text.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def nearbyChargers(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("nearbyChargers")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def nearbyChargersAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("nearbyChargersAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  @scala.inline
  def openChargePort(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openChargePort")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def openChargePortAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("openChargePortAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def openTrunk(options: optionsType, which: String, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openTrunk")(options.asInstanceOf[js.Any], which.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def openTrunkAsync(options: optionsType, which: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("openTrunkAsync")(options.asInstanceOf[js.Any], which.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @JSImport("teslajs", "portal")
  @js.native
  val portal: String = js.native
  
  @scala.inline
  def postCommand(options: optionsType, command: String, body: js.Object, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post_command")(options.asInstanceOf[js.Any], command.asInstanceOf[js.Any], body.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def postCommandAsync(options: optionsType, command: String, body: js.Object): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("post_commandAsync")(options.asInstanceOf[js.Any], command.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def refreshToken(refresh_token: String, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refresh_token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def refreshTokenAsync(refresh_token: String): js.Promise[TokenResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshTokenAsync")(refresh_token.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TokenResponse]]
  
  @scala.inline
  def remoteStart(options: optionsType, password: String, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteStart")(options.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def remoteStartAsync(options: optionsType, password: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteStartAsync")(options.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def resetValetPin(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetValetPin")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def resetValetPinAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("resetValetPinAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def scheduleSoftwareUpdate(options: optionsType, offset: Double, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleSoftwareUpdate")(options.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def scheduleSoftwareUpdateAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("scheduleSoftwareUpdateAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def seatHeater(options: optionsType, heater: Double, level: Double, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("seatHeater")(options.asInstanceOf[js.Any], heater.asInstanceOf[js.Any], level.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def seatHeaterAsync(options: optionsType, heater: Double, level: Double): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("seatHeaterAsync")(options.asInstanceOf[js.Any], heater.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def setChargeLimit(options: optionsType, amt: js.Any, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setChargeLimit")(options.asInstanceOf[js.Any], amt.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setChargeLimitAsync(options: optionsType, amt: js.Any): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("setChargeLimitAsync")(options.asInstanceOf[js.Any], amt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def setLogLevel(level: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setPortalBaseURI(uri: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPortalBaseURI")(uri.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setSentryMode(options: optionsType, onoff: Boolean, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setSentryMode")(options.asInstanceOf[js.Any], onoff.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def setSentryModeAsync(options: optionsType, onoff: Boolean): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("setSentryModeAsync")(options.asInstanceOf[js.Any], onoff.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def setStreamingBaseURI(uri: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStreamingBaseURI")(uri.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setTemps(options: optionsType, driver: Double, pass: Double, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTemps")(options.asInstanceOf[js.Any], driver.asInstanceOf[js.Any], pass.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setTempsAsync(options: optionsType, driver: Double, pass: Double): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTempsAsync")(options.asInstanceOf[js.Any], driver.asInstanceOf[js.Any], pass.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def setValetMode(options: optionsType, onoff: Boolean, pin: js.Any, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setValetMode")(options.asInstanceOf[js.Any], onoff.asInstanceOf[js.Any], pin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setValetModeAsync(options: optionsType, onoff: Boolean, pin: js.Any): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("setValetModeAsync")(options.asInstanceOf[js.Any], onoff.asInstanceOf[js.Any], pin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def speedLimitActivate(options: optionsType, pin: Double, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("speedLimitActivate")(options.asInstanceOf[js.Any], pin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def speedLimitActivateAsync(options: optionsType, pin: Double): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("speedLimitActivateAsync")(options.asInstanceOf[js.Any], pin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def speedLimitClearPin(options: optionsType, pin: Double, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("speedLimitClearPin")(options.asInstanceOf[js.Any], pin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def speedLimitClearPinAsync(options: optionsType, pin: Double): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("speedLimitClearPinAsync")(options.asInstanceOf[js.Any], pin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def speedLimitDeactivate(options: optionsType, pin: Double, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("speedLimitDeactivate")(options.asInstanceOf[js.Any], pin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def speedLimitDeactivateAsync(options: optionsType, pin: Double): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("speedLimitDeactivateAsync")(options.asInstanceOf[js.Any], pin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def speedLimitSetLimit(options: optionsType, limit: Double, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("speedLimitSetLimit")(options.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def speedLimitSetLimitAsync(options: optionsType, limit: Double): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("speedLimitSetLimitAsync")(options.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def startCharge(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startCharge")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def startChargeAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("startChargeAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def startStreaming(options: js.Any, callback: nodeBack, onDataCb: nodeBack): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("startStreaming")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], onDataCb.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def steeringHeater(options: optionsType, level: Double, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("steeringHeater")(options.asInstanceOf[js.Any], level.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def steeringHeaterAsync(options: optionsType, level: Double): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("steeringHeaterAsync")(options.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def stopCharge(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stopCharge")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def stopChargeAsync(options: optionsType): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("stopChargeAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @JSImport("teslajs", "streamingColumns")
  @js.native
  val streamingColumns: js.Array[String] = js.native
  
  @JSImport("teslajs", "streamingPortal")
  @js.native
  val streamingPortal: String = js.native
  
  @scala.inline
  def sunRoofControl(options: optionsType, state: String, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sunRoofControl")(options.asInstanceOf[js.Any], state.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def sunRoofControlAsync(options: optionsType, state: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("sunRoofControlAsync")(options.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def sunRoofMove(options: optionsType, percent: js.Any, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sunRoofMove")(options.asInstanceOf[js.Any], percent.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def sunRoofMoveAsync(options: optionsType, percent: js.Any): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("sunRoofMoveAsync")(options.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @scala.inline
  def vehicle(options: optionsType, callback: nodeBack): Vehicle_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vehicle")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Vehicle_]
  
  @scala.inline
  def vehicleAsync(options: optionsType): js.Promise[Vehicle_] = ^.asInstanceOf[js.Dynamic].applyDynamic("vehicleAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Vehicle_]]
  
  @scala.inline
  def vehicleConfig(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vehicleConfig")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def vehicleConfigAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("vehicleConfigAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  @scala.inline
  def vehicleData(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vehicleData")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def vehicleDataAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("vehicleDataAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  @scala.inline
  def vehicleState(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vehicleState")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def vehicleStateAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("vehicleStateAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  @scala.inline
  def vehicles(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vehicles")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def vehiclesAsync(options: optionsType): js.Promise[js.Array[StringDictionary[String | Double | Boolean | Null]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("vehiclesAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[StringDictionary[String | Double | Boolean | Null]]]]
  
  @scala.inline
  def vinDecode(vehicle: Vehicle_): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("vinDecode")(vehicle.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  @scala.inline
  def wakeUp(options: optionsType, callback: nodeBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wakeUp")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def wakeUpAsync(options: optionsType): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("wakeUpAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  @scala.inline
  def windowControl(options: optionsType, command: String, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("windowControl")(options.asInstanceOf[js.Any], command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def windowControlAsync(options: optionsType, command: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowControlAsync")(options.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  trait Result extends StObject {
    
    var reason: String
    
    var result: Boolean
  }
  object Result {
    
    @scala.inline
    def apply(reason: String, result: Boolean): Result = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenResponse extends StObject {
    
    var authToken: String
    
    var body: js.Object
    
    var refreshToken: String
    
    var response: js.Object
  }
  object TokenResponse {
    
    @scala.inline
    def apply(authToken: String, body: js.Object, refreshToken: String, response: js.Object): TokenResponse = {
      val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenResponse]
    }
    
    @scala.inline
    implicit class TokenResponseMutableBuilder[Self <: TokenResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: js.Object): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  trait Vehicle_
    extends StObject
       with /* key */ StringDictionary[String | Double | Boolean | Null] {
    
    var id: String
    
    var vehicleID: Double
  }
  object Vehicle_ {
    
    @scala.inline
    def apply(id: String, vehicleID: Double): Vehicle_ = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], vehicleID = vehicleID.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vehicle_]
    }
    
    @scala.inline
    implicit class Vehicle_MutableBuilder[Self <: Vehicle_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVehicleID(value: Double): Self = StObject.set(x, "vehicleID", value.asInstanceOf[js.Any])
    }
  }
  
  type nodeBack = js.Function2[/* error */ Error, /* data */ js.Any, js.Any]
  
  trait optionsType extends StObject {
    
    var authToken: String
    
    var carIndex: js.UndefOr[Double] = js.undefined
    
    var vehicleID: String
  }
  object optionsType {
    
    @scala.inline
    def apply(authToken: String, vehicleID: String): optionsType = {
      val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], vehicleID = vehicleID.asInstanceOf[js.Any])
      __obj.asInstanceOf[optionsType]
    }
    
    @scala.inline
    implicit class optionsTypeMutableBuilder[Self <: optionsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarIndex(value: Double): Self = StObject.set(x, "carIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarIndexUndefined: Self = StObject.set(x, "carIndex", js.undefined)
      
      @scala.inline
      def setVehicleID(value: String): Self = StObject.set(x, "vehicleID", value.asInstanceOf[js.Any])
    }
  }
}
