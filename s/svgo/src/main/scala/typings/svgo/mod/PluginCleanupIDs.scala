package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginCleanupIDs extends PluginConfig {
  
  var cleanupIDs: Boolean | js.Object = js.native
}
object PluginCleanupIDs {
  
  @scala.inline
  def apply(cleanupIDs: Boolean | js.Object): PluginCleanupIDs = {
    val __obj = js.Dynamic.literal(cleanupIDs = cleanupIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCleanupIDs]
  }
  
  @scala.inline
  implicit class PluginCleanupIDsMutableBuilder[Self <: PluginCleanupIDs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCleanupIDs(value: Boolean | js.Object): Self = StObject.set(x, "cleanupIDs", value.asInstanceOf[js.Any])
  }
}
