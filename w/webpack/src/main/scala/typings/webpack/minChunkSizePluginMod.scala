package typings.webpack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minChunkSizePluginMod {
  
  @js.native
  trait MinChunkSizePluginOptions extends StObject {
    
    /**
    	 * Minimum number of characters
    	 */
    var minChunkSize: Double = js.native
  }
  object MinChunkSizePluginOptions {
    
    @scala.inline
    def apply(minChunkSize: Double): MinChunkSizePluginOptions = {
      val __obj = js.Dynamic.literal(minChunkSize = minChunkSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinChunkSizePluginOptions]
    }
    
    @scala.inline
    implicit class MinChunkSizePluginOptionsMutableBuilder[Self <: MinChunkSizePluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinChunkSize(value: Double): Self = StObject.set(x, "minChunkSize", value.asInstanceOf[js.Any])
    }
  }
}
