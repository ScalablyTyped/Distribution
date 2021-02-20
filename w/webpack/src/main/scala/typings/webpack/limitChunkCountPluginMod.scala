package typings.webpack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object limitChunkCountPluginMod {
  
  @js.native
  trait LimitChunkCountPluginOptions extends StObject {
    
    /**
    	 * Limit the maximum number of chunks using a value greater greater than or equal to 1
    	 */
    var maxChunks: js.UndefOr[Double] = js.native
    
    /**
    	 * Set a minimum chunk size
    	 */
    var minChunkSize: js.UndefOr[Double] = js.native
  }
  object LimitChunkCountPluginOptions {
    
    @scala.inline
    def apply(): LimitChunkCountPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LimitChunkCountPluginOptions]
    }
    
    @scala.inline
    implicit class LimitChunkCountPluginOptionsMutableBuilder[Self <: LimitChunkCountPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxChunks(value: Double): Self = StObject.set(x, "maxChunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxChunksUndefined: Self = StObject.set(x, "maxChunks", js.undefined)
      
      @scala.inline
      def setMinChunkSize(value: Double): Self = StObject.set(x, "minChunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinChunkSizeUndefined: Self = StObject.set(x, "minChunkSize", js.undefined)
    }
  }
}
