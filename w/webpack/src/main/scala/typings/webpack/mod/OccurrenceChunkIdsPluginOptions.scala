package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OccurrenceChunkIdsPluginOptions extends StObject {
  
  /**
  	 * Prioritise initial size over total size.
  	 */
  var prioritiseInitial: js.UndefOr[Boolean] = js.undefined
}
object OccurrenceChunkIdsPluginOptions {
  
  inline def apply(): OccurrenceChunkIdsPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OccurrenceChunkIdsPluginOptions]
  }
  
  extension [Self <: OccurrenceChunkIdsPluginOptions](x: Self) {
    
    inline def setPrioritiseInitial(value: Boolean): Self = StObject.set(x, "prioritiseInitial", value.asInstanceOf[js.Any])
    
    inline def setPrioritiseInitialUndefined: Self = StObject.set(x, "prioritiseInitial", js.undefined)
  }
}
