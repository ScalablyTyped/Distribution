package typings.teenyRequest

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTeenyStatisticsMod {
  
  @JSImport("teeny-request/build/src/TeenyStatistics", "TeenyStatistics")
  @js.native
  /**
    * @param {TeenyStatisticsOptions} [opts]
    */
  open class TeenyStatistics () extends StObject {
    def this(opts: TeenyStatisticsOptions) = this()
    
    /**
      * @type {number}
      * @private
      * @default 0
      */
    /* private */ var _concurrentRequests: Any = js.native
    
    /**
      * @type {boolean}
      * @private
      * @default false
      */
    /* private */ var _didConcurrentRequestWarn: Any = js.native
    
    /**
      * @type {TeenyStatisticsConfig}
      * @private
      */
    /* private */ var _options: Any = js.native
    
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
  object TeenyStatistics {
    
    @JSImport("teeny-request/build/src/TeenyStatistics", "TeenyStatistics")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @description A default threshold representing when to warn about excessive
      *   in-flight/concurrent requests.
      * @type {number}
      * @static
      * @readonly
      * @default 5000
      */
    @JSImport("teeny-request/build/src/TeenyStatistics", "TeenyStatistics.DEFAULT_WARN_CONCURRENT_REQUESTS")
    @js.native
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
    @JSImport("teeny-request/build/src/TeenyStatistics", "TeenyStatistics._prepareOptions")
    @js.native
    def _prepareOptions: Any = js.native
    inline def _prepareOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_prepareOptions")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("teeny-request/build/src/TeenyStatistics", "TeenyStatisticsWarning")
  @js.native
  open class TeenyStatisticsWarning protected ()
    extends StObject
       with Error {
    /**
      * @param {string} message
      */
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var threshold: Double = js.native
    
    var `type`: String = js.native
    
    var value: Double = js.native
  }
  /* static members */
  object TeenyStatisticsWarning {
    
    @JSImport("teeny-request/build/src/TeenyStatistics", "TeenyStatisticsWarning.CONCURRENT_REQUESTS")
    @js.native
    val CONCURRENT_REQUESTS: /* "ConcurrentRequestsExceededWarning" */ String = js.native
  }
  
  /* Inlined std.Required<teeny-request.teeny-request/build/src/TeenyStatistics.TeenyStatisticsOptions> */
  trait TeenyStatisticsConfig extends StObject {
    
    var concurrentRequests: Double
  }
  object TeenyStatisticsConfig {
    
    inline def apply(concurrentRequests: Double): TeenyStatisticsConfig = {
      val __obj = js.Dynamic.literal(concurrentRequests = concurrentRequests.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeenyStatisticsConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TeenyStatisticsConfig] (val x: Self) extends AnyVal {
      
      inline def setConcurrentRequests(value: Double): Self = StObject.set(x, "concurrentRequests", value.asInstanceOf[js.Any])
    }
  }
  
  trait TeenyStatisticsCounters extends StObject {
    
    var concurrentRequests: Double
  }
  object TeenyStatisticsCounters {
    
    inline def apply(concurrentRequests: Double): TeenyStatisticsCounters = {
      val __obj = js.Dynamic.literal(concurrentRequests = concurrentRequests.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeenyStatisticsCounters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TeenyStatisticsCounters] (val x: Self) extends AnyVal {
      
      inline def setConcurrentRequests(value: Double): Self = StObject.set(x, "concurrentRequests", value.asInstanceOf[js.Any])
    }
  }
  
  trait TeenyStatisticsOptions extends StObject {
    
    /**
      * A positive number representing when to issue a warning about the number
      * of concurrent requests using teeny-request.
      * Set to 0 to disable this warning.
      * Corresponds to the TEENY_REQUEST_WARN_CONCURRENT_REQUESTS environment
      * variable.
      */
    var concurrentRequests: js.UndefOr[Double] = js.undefined
  }
  object TeenyStatisticsOptions {
    
    inline def apply(): TeenyStatisticsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TeenyStatisticsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TeenyStatisticsOptions] (val x: Self) extends AnyVal {
      
      inline def setConcurrentRequests(value: Double): Self = StObject.set(x, "concurrentRequests", value.asInstanceOf[js.Any])
      
      inline def setConcurrentRequestsUndefined: Self = StObject.set(x, "concurrentRequests", js.undefined)
    }
  }
}
