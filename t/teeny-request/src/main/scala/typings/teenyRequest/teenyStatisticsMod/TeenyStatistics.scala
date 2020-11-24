package typings.teenyRequest.teenyStatisticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("teeny-request/build/src/TeenyStatistics", "TeenyStatistics")
@js.native
/**
  * @param {TeenyStatisticsOptions} [opts]
  */
class TeenyStatistics () extends js.Object {
  def this(opts: TeenyStatisticsOptions) = this()
  
  /**
    * @type {number}
    * @private
    * @default 0
    */
  var _concurrentRequests: js.Any = js.native
  
  /**
    * @type {boolean}
    * @private
    * @default false
    */
  var _didConcurrentRequestWarn: js.Any = js.native
  
  /**
    * @type {TeenyStatisticsConfig}
    * @private
    */
  var _options: js.Any = js.native
  
  /**
    * @readonly
    * @return {TeenyStatisticsCounters}
    */
  def counters: TeenyStatisticsCounters = js.native
  
  /**
    * Returns a copy of the current options.
    * @return {TeenyStatisticsOptions}
    */
  def getOptions(): TeenyStatisticsOptions = js.native
  
  /**
    * @description When using `requestStarting`, call this after the request
    *   has finished.
    */
  def requestFinished(): Unit = js.native
  
  /**
    * @description Should call this right before making a request.
    */
  def requestStarting(): Unit = js.native
  
  /**
    * Change configured statistics options. This will not preserve unspecified
    *   options that were previously specified, i.e. this is a reset of options.
    * @param {TeenyStatisticsOptions} [opts]
    * @returns {TeenyStatisticsConfig} The previous options.
    * @see _prepareOptions
    */
  def setOptions(): TeenyStatisticsConfig = js.native
  def setOptions(opts: TeenyStatisticsOptions): TeenyStatisticsConfig = js.native
}
/* static members */
@JSImport("teeny-request/build/src/TeenyStatistics", "TeenyStatistics")
@js.native
object TeenyStatistics extends js.Object {
  
  /**
    * @description A default threshold representing when to warn about excessive
    *   in-flight/concurrent requests.
    * @type {number}
    * @static
    * @readonly
    * @default 5000
    */
  val DEFAULT_WARN_CONCURRENT_REQUESTS: /* 5000 */ Double = js.native
  
  /**
    * Configuration Precedence:
    *   1. Dependency inversion via defined option.
    *   2. Global numeric environment variable.
    *   3. Built-in default.
    * This will not preserve unspecified options previously specified.
    * @param {TeenyStatisticsOptions} [opts]
    * @returns {TeenyStatisticsOptions}
    * @private
    */
  var _prepareOptions: js.Any = js.native
}
