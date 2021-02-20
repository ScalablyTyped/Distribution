package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginCleanupEnableBackground extends PluginConfig {
  
  var cleanupEnableBackground: Boolean | js.Object = js.native
}
object PluginCleanupEnableBackground {
  
  @scala.inline
  def apply(cleanupEnableBackground: Boolean | js.Object): PluginCleanupEnableBackground = {
    val __obj = js.Dynamic.literal(cleanupEnableBackground = cleanupEnableBackground.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCleanupEnableBackground]
  }
  
  @scala.inline
  implicit class PluginCleanupEnableBackgroundMutableBuilder[Self <: PluginCleanupEnableBackground] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCleanupEnableBackground(value: Boolean | js.Object): Self = StObject.set(x, "cleanupEnableBackground", value.asInstanceOf[js.Any])
  }
}
