package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginCleanupAttrs extends PluginConfig {
  
  var cleanupAttrs: Boolean | js.Object = js.native
}
object PluginCleanupAttrs {
  
  @scala.inline
  def apply(cleanupAttrs: Boolean | js.Object): PluginCleanupAttrs = {
    val __obj = js.Dynamic.literal(cleanupAttrs = cleanupAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCleanupAttrs]
  }
  
  @scala.inline
  implicit class PluginCleanupAttrsMutableBuilder[Self <: PluginCleanupAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCleanupAttrs(value: Boolean | js.Object): Self = StObject.set(x, "cleanupAttrs", value.asInstanceOf[js.Any])
  }
}
