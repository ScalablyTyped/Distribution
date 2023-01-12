package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilingPluginOptions extends StObject {
  
  /**
  	 * Path to the output file e.g. `path.resolve(__dirname, 'profiling/events.json')`. Defaults to `events.json`.
  	 */
  var outputPath: js.UndefOr[String] = js.undefined
}
object ProfilingPluginOptions {
  
  inline def apply(): ProfilingPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfilingPluginOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProfilingPluginOptions] (val x: Self) extends AnyVal {
    
    inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
  }
}
