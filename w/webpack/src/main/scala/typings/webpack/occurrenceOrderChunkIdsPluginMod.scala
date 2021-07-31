package typings.webpack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object occurrenceOrderChunkIdsPluginMod {
  
  trait OccurrenceOrderChunkIdsPluginOptions extends StObject {
    
    /**
    	 * Prioritise initial size over total size
    	 */
    var prioritiseInitial: js.UndefOr[Boolean] = js.undefined
  }
  object OccurrenceOrderChunkIdsPluginOptions {
    
    @scala.inline
    def apply(): OccurrenceOrderChunkIdsPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OccurrenceOrderChunkIdsPluginOptions]
    }
    
    @scala.inline
    implicit class OccurrenceOrderChunkIdsPluginOptionsMutableBuilder[Self <: OccurrenceOrderChunkIdsPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrioritiseInitial(value: Boolean): Self = StObject.set(x, "prioritiseInitial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrioritiseInitialUndefined: Self = StObject.set(x, "prioritiseInitial", js.undefined)
    }
  }
}
