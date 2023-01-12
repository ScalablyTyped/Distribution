package typings.webpack.mod

import typings.std.Console
import typings.std.WritableStream
import typings.webpack.webpackStrings.error
import typings.webpack.webpackStrings.info
import typings.webpack.webpackStrings.log
import typings.webpack.webpackStrings.none
import typings.webpack.webpackStrings.verbose
import typings.webpack.webpackStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for infrastructure level logging.
  */
trait InfrastructureLogging extends StObject {
  
  /**
  	 * Only appends lines to the output. Avoids updating existing output e. g. for status messages. This option is only used when no custom console is provided.
  	 */
  var appendOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enables/Disables colorful output. This option is only used when no custom console is provided.
  	 */
  var colors: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Custom console used for logging.
  	 */
  var console: js.UndefOr[Console] = js.undefined
  
  /**
  	 * Enable debug logging for specific loggers.
  	 */
  var debug: js.UndefOr[
    String | Boolean | js.RegExp | js.Array[FilterItemTypes] | (js.Function1[/* value */ String, Boolean])
  ] = js.undefined
  
  /**
  	 * Log level.
  	 */
  var level: js.UndefOr[none | error | warn | info | log | verbose] = js.undefined
  
  /**
  	 * Stream used for logging output. Defaults to process.stderr. This option is only used when no custom console is provided.
  	 */
  var stream: js.UndefOr[WritableStream[Any]] = js.undefined
}
object InfrastructureLogging {
  
  inline def apply(): InfrastructureLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfrastructureLogging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InfrastructureLogging] (val x: Self) extends AnyVal {
    
    inline def setAppendOnly(value: Boolean): Self = StObject.set(x, "appendOnly", value.asInstanceOf[js.Any])
    
    inline def setAppendOnlyUndefined: Self = StObject.set(x, "appendOnly", js.undefined)
    
    inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setConsole(value: Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
    
    inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
    
    inline def setDebug(
      value: String | Boolean | js.RegExp | js.Array[FilterItemTypes] | (js.Function1[/* value */ String, Boolean])
    ): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDebugVarargs(value: FilterItemTypes*): Self = StObject.set(x, "debug", js.Array(value*))
    
    inline def setLevel(value: none | error | warn | info | log | verbose): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setStream(value: WritableStream[Any]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
