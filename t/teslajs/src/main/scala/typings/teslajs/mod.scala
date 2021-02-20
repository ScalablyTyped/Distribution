package typings.teslajs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.teslajs.anon.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("teslajs", "calendar")
  @js.native
  def calendar(options: optionsType, entry: js.Any, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "calendarAsync")
  @js.native
  def calendarAsync(options: optionsType, entry: js.Any): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "cancelSoftwareUpdate")
  @js.native
  def cancelSoftwareUpdate(options: optionsType, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "cancelSoftwareUpdateAsync")
  @js.native
  def cancelSoftwareUpdateAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "chargeMaxRange")
  @js.native
  def chargeMaxRange(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "chargeMaxRangeAsync")
  @js.native
  def chargeMaxRangeAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "chargeStandard")
  @js.native
  def chargeStandard(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "chargeStandardAsync")
  @js.native
  def chargeStandardAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "chargeState")
  @js.native
  def chargeState(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "chargeStateAsync")
  @js.native
  def chargeStateAsync(options: optionsType): js.Promise[js.Object] = js.native
  
  @JSImport("teslajs", "climateStart")
  @js.native
  def climateStart(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "climateStartAsync")
  @js.native
  def climateStartAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "climateState")
  @js.native
  def climateState(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "climateStateAsync")
  @js.native
  def climateStateAsync(options: optionsType): js.Promise[js.Object] = js.native
  
  @JSImport("teslajs", "climateStop")
  @js.native
  def climateStop(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "climateStopAsync")
  @js.native
  def climateStopAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "closeChargePort")
  @js.native
  def closeChargePort(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "closeChargePortAsync")
  @js.native
  def closeChargePortAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "doorLock")
  @js.native
  def doorLock(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "doorLockAsync")
  @js.native
  def doorLockAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "doorUnlock")
  @js.native
  def doorUnlock(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "doorUnlockAsync")
  @js.native
  def doorUnlockAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "driveState")
  @js.native
  def driveState(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "driveStateAsync")
  @js.native
  def driveStateAsync(options: optionsType): js.Promise[js.Object] = js.native
  
  @JSImport("teslajs", "flashLights")
  @js.native
  def flashLights(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "flashLightsAsync")
  @js.native
  def flashLightsAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "get_command")
  @js.native
  def getCommand(options: optionsType, command: String, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "get_commandAsync")
  @js.native
  def getCommandAsync(options: optionsType, command: String): js.Promise[_] = js.native
  
  @JSImport("teslajs", "getLogLevel")
  @js.native
  def getLogLevel(): Double = js.native
  
  @JSImport("teslajs", "getModel")
  @js.native
  def getModel(vehicle: Vehicle_): String = js.native
  
  @JSImport("teslajs", "getPaintColor")
  @js.native
  def getPaintColor(vehicle: Vehicle_): String = js.native
  
  @JSImport("teslajs", "getPortalBaseURI")
  @js.native
  def getPortalBaseURI(): String = js.native
  
  @JSImport("teslajs", "getShortVin")
  @js.native
  def getShortVin(vehicle: Vehicle_): String = js.native
  
  @JSImport("teslajs", "getStreamingBaseURI")
  @js.native
  def getStreamingBaseURI(): String = js.native
  
  @JSImport("teslajs", "getVin")
  @js.native
  def getVin(vehicle: Vehicle_): String = js.native
  
  @JSImport("teslajs", "guiSettings")
  @js.native
  def guiSettings(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "guiSettingsAsync")
  @js.native
  def guiSettingsAsync(options: optionsType): js.Promise[js.Object] = js.native
  
  @JSImport("teslajs", "homelink")
  @js.native
  def homelink(options: optionsType, lat: Double, long: Double, token: String, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "homelinkAsync")
  @js.native
  def homelinkAsync(options: optionsType, lat: Double, long: Double, token: String): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "honkHorn")
  @js.native
  def honkHorn(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "honkHornAsync")
  @js.native
  def honkHornAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "login")
  @js.native
  def login(username: String, password: String, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "loginAsync")
  @js.native
  def loginAsync(username: String, password: String): js.Promise[TokenResponse] = js.native
  
  @JSImport("teslajs", "logout")
  @js.native
  def logout(authToken: String, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "logoutAsync")
  @js.native
  def logoutAsync(authToken: String): js.Promise[Unit] = js.native
  
  @JSImport("teslajs", "makeCalendarEntry")
  @js.native
  def makeCalendarEntry(
    eventName: String,
    location: String,
    startTime: Double,
    endTime: Double,
    accountName: String,
    phoneName: String
  ): js.Object = js.native
  
  @JSImport("teslajs", "maxDefrost")
  @js.native
  def maxDefrost(options: optionsType, onoff: Boolean, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "maxDefrostAsync")
  @js.native
  def maxDefrostAsync(options: optionsType, onoff: Boolean): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "mediaPlayNext")
  @js.native
  def mediaPlayNext(options: optionsType, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "mediaPlayNextAsync")
  @js.native
  def mediaPlayNextAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "mediaPlayNextFavorite")
  @js.native
  def mediaPlayNextFavorite(options: optionsType, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "mediaPlayNextFavoriteAsync")
  @js.native
  def mediaPlayNextFavoriteAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "mediaPlayPrevious")
  @js.native
  def mediaPlayPrevious(options: optionsType, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "mediaPlayPreviousAsync")
  @js.native
  def mediaPlayPreviousAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "mediaPlayPreviousFavorite")
  @js.native
  def mediaPlayPreviousFavorite(options: optionsType, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "mediaPlayPreviousFavoriteAsync")
  @js.native
  def mediaPlayPreviousFavoriteAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "mediaTogglePlayback")
  @js.native
  def mediaTogglePlayback(options: optionsType, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "mediaTogglePlaybackAsync")
  @js.native
  def mediaTogglePlaybackAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "mediaVolumeDown")
  @js.native
  def mediaVolumeDown(options: optionsType, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "mediaVolumeDownAsync")
  @js.native
  def mediaVolumeDownAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "mediaVolumeUp")
  @js.native
  def mediaVolumeUp(options: optionsType, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "mediaVolumeUpAsync")
  @js.native
  def mediaVolumeUpAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "mobileEnabled")
  @js.native
  def mobileEnabled(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "mobileEnabledAsync")
  @js.native
  def mobileEnabledAsync(options: optionsType): js.Promise[Response] = js.native
  
  @JSImport("teslajs", "navigationRequest")
  @js.native
  def navigationRequest(options: optionsType, subject: String, text: String, locale: String, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "navigationRequestAsync")
  @js.native
  def navigationRequestAsync(options: optionsType, subject: String, text: String, locale: String): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "nearbyChargers")
  @js.native
  def nearbyChargers(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "nearbyChargersAsync")
  @js.native
  def nearbyChargersAsync(options: optionsType): js.Promise[js.Object] = js.native
  
  @JSImport("teslajs", "openChargePort")
  @js.native
  def openChargePort(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "openChargePortAsync")
  @js.native
  def openChargePortAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "openTrunk")
  @js.native
  def openTrunk(options: optionsType, which: String, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "openTrunkAsync")
  @js.native
  def openTrunkAsync(options: optionsType, which: String): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "portal")
  @js.native
  val portal: String = js.native
  
  @JSImport("teslajs", "post_command")
  @js.native
  def postCommand(options: optionsType, command: String, body: js.Object, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "post_commandAsync")
  @js.native
  def postCommandAsync(options: optionsType, command: String, body: js.Object): js.Promise[_] = js.native
  
  @JSImport("teslajs", "refreshToken")
  @js.native
  def refreshToken(refresh_token: String, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "refreshTokenAsync")
  @js.native
  def refreshTokenAsync(refresh_token: String): js.Promise[TokenResponse] = js.native
  
  @JSImport("teslajs", "remoteStart")
  @js.native
  def remoteStart(options: optionsType, password: String, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "remoteStartAsync")
  @js.native
  def remoteStartAsync(options: optionsType, password: String): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "resetValetPin")
  @js.native
  def resetValetPin(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "resetValetPinAsync")
  @js.native
  def resetValetPinAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "scheduleSoftwareUpdate")
  @js.native
  def scheduleSoftwareUpdate(options: optionsType, offset: Double, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "scheduleSoftwareUpdateAsync")
  @js.native
  def scheduleSoftwareUpdateAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "seatHeater")
  @js.native
  def seatHeater(options: optionsType, heater: Double, level: Double, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "seatHeaterAsync")
  @js.native
  def seatHeaterAsync(options: optionsType, heater: Double, level: Double): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "setChargeLimit")
  @js.native
  def setChargeLimit(options: optionsType, amt: js.Any, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "setChargeLimitAsync")
  @js.native
  def setChargeLimitAsync(options: optionsType, amt: js.Any): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "setLogLevel")
  @js.native
  def setLogLevel(level: Double): Unit = js.native
  
  @JSImport("teslajs", "setPortalBaseURI")
  @js.native
  def setPortalBaseURI(uri: String): Unit = js.native
  
  @JSImport("teslajs", "setSentryMode")
  @js.native
  def setSentryMode(options: optionsType, onoff: Boolean, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "setSentryModeAsync")
  @js.native
  def setSentryModeAsync(options: optionsType, onoff: Boolean): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "setStreamingBaseURI")
  @js.native
  def setStreamingBaseURI(uri: String): Unit = js.native
  
  @JSImport("teslajs", "setTemps")
  @js.native
  def setTemps(options: optionsType, driver: Double, pass: Double, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "setTempsAsync")
  @js.native
  def setTempsAsync(options: optionsType, driver: Double, pass: Double): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "setValetMode")
  @js.native
  def setValetMode(options: optionsType, onoff: Boolean, pin: js.Any, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "setValetModeAsync")
  @js.native
  def setValetModeAsync(options: optionsType, onoff: Boolean, pin: js.Any): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "speedLimitActivate")
  @js.native
  def speedLimitActivate(options: optionsType, pin: Double, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "speedLimitActivateAsync")
  @js.native
  def speedLimitActivateAsync(options: optionsType, pin: Double): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "speedLimitClearPin")
  @js.native
  def speedLimitClearPin(options: optionsType, pin: Double, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "speedLimitClearPinAsync")
  @js.native
  def speedLimitClearPinAsync(options: optionsType, pin: Double): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "speedLimitDeactivate")
  @js.native
  def speedLimitDeactivate(options: optionsType, pin: Double, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "speedLimitDeactivateAsync")
  @js.native
  def speedLimitDeactivateAsync(options: optionsType, pin: Double): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "speedLimitSetLimit")
  @js.native
  def speedLimitSetLimit(options: optionsType, limit: Double, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "speedLimitSetLimitAsync")
  @js.native
  def speedLimitSetLimitAsync(options: optionsType, limit: Double): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "startCharge")
  @js.native
  def startCharge(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "startChargeAsync")
  @js.native
  def startChargeAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "startStreaming")
  @js.native
  def startStreaming(options: js.Any, callback: nodeBack, onDataCb: nodeBack): js.Any = js.native
  
  @JSImport("teslajs", "steeringHeater")
  @js.native
  def steeringHeater(options: optionsType, level: Double, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "steeringHeaterAsync")
  @js.native
  def steeringHeaterAsync(options: optionsType, level: Double): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "stopCharge")
  @js.native
  def stopCharge(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "stopChargeAsync")
  @js.native
  def stopChargeAsync(options: optionsType): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "streamingColumns")
  @js.native
  val streamingColumns: js.Array[String] = js.native
  
  @JSImport("teslajs", "streamingPortal")
  @js.native
  val streamingPortal: String = js.native
  
  @JSImport("teslajs", "sunRoofControl")
  @js.native
  def sunRoofControl(options: optionsType, state: String, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "sunRoofControlAsync")
  @js.native
  def sunRoofControlAsync(options: optionsType, state: String): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "sunRoofMove")
  @js.native
  def sunRoofMove(options: optionsType, percent: js.Any, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "sunRoofMoveAsync")
  @js.native
  def sunRoofMoveAsync(options: optionsType, percent: js.Any): js.Promise[Result] = js.native
  
  @JSImport("teslajs", "vehicle")
  @js.native
  def vehicle(options: optionsType, callback: nodeBack): Vehicle_ = js.native
  
  @JSImport("teslajs", "vehicleAsync")
  @js.native
  def vehicleAsync(options: optionsType): js.Promise[Vehicle_] = js.native
  
  @JSImport("teslajs", "vehicleConfig")
  @js.native
  def vehicleConfig(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "vehicleConfigAsync")
  @js.native
  def vehicleConfigAsync(options: optionsType): js.Promise[js.Object] = js.native
  
  @JSImport("teslajs", "vehicleData")
  @js.native
  def vehicleData(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "vehicleDataAsync")
  @js.native
  def vehicleDataAsync(options: optionsType): js.Promise[js.Object] = js.native
  
  @JSImport("teslajs", "vehicleState")
  @js.native
  def vehicleState(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "vehicleStateAsync")
  @js.native
  def vehicleStateAsync(options: optionsType): js.Promise[js.Object] = js.native
  
  @JSImport("teslajs", "vehicles")
  @js.native
  def vehicles(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "vehiclesAsync")
  @js.native
  def vehiclesAsync(options: optionsType): js.Promise[js.Array[StringDictionary[String | Double | Boolean | Null]]] = js.native
  
  @JSImport("teslajs", "vinDecode")
  @js.native
  def vinDecode(vehicle: Vehicle_): js.Object = js.native
  
  @JSImport("teslajs", "wakeUp")
  @js.native
  def wakeUp(options: optionsType, callback: nodeBack): Unit = js.native
  
  @JSImport("teslajs", "wakeUpAsync")
  @js.native
  def wakeUpAsync(options: optionsType): js.Promise[js.Object] = js.native
  
  @JSImport("teslajs", "windowControl")
  @js.native
  def windowControl(options: optionsType, command: String, callback: js.Any): js.Any = js.native
  
  @JSImport("teslajs", "windowControlAsync")
  @js.native
  def windowControlAsync(options: optionsType, command: String): js.Promise[Result] = js.native
  
  @js.native
  trait Result extends StObject {
    
    var reason: String = js.native
    
    var result: Boolean = js.native
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
  
  @js.native
  trait TokenResponse extends StObject {
    
    var authToken: String = js.native
    
    var body: js.Object = js.native
    
    var refreshToken: String = js.native
    
    var response: js.Object = js.native
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
  
  @js.native
  trait Vehicle_ extends /* key */ StringDictionary[String | Double | Boolean | Null] {
    
    var id: String = js.native
    
    var vehicleID: Double = js.native
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
  
  @js.native
  trait optionsType extends StObject {
    
    var authToken: String = js.native
    
    var carIndex: js.UndefOr[Double] = js.native
    
    var vehicleID: String = js.native
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
