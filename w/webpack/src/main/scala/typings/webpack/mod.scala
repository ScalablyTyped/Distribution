package typings.webpack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait ProfilingPluginOptions extends StObject {
    
    /**
    	 * Path to the output file e.g. `profiling/events.json`. Defaults to `events.json`.
    	 */
    var outputPath: js.UndefOr[String] = js.undefined
  }
  object ProfilingPluginOptions {
    
    @scala.inline
    def apply(): ProfilingPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProfilingPluginOptions]
    }
    
    @scala.inline
    implicit class ProfilingPluginOptionsMutableBuilder[Self <: ProfilingPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
    }
  }
}
