package typings.webpack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object occurrenceOrderModuleIdsPluginMod {
  
  @js.native
  trait OccurrenceOrderModuleIdsPluginOptions extends StObject {
    
    /**
    	 * Prioritise initial size over total size
    	 */
    var prioritiseInitial: js.UndefOr[Boolean] = js.native
  }
  object OccurrenceOrderModuleIdsPluginOptions {
    
    @scala.inline
    def apply(): OccurrenceOrderModuleIdsPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OccurrenceOrderModuleIdsPluginOptions]
    }
    
    @scala.inline
    implicit class OccurrenceOrderModuleIdsPluginOptionsMutableBuilder[Self <: OccurrenceOrderModuleIdsPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrioritiseInitial(value: Boolean): Self = StObject.set(x, "prioritiseInitial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrioritiseInitialUndefined: Self = StObject.set(x, "prioritiseInitial", js.undefined)
    }
  }
}
