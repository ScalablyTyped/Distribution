package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginPrefixIds extends PluginConfig {
  
  /** prefix IDs and classes with the SVG filename or an arbitrary string     */
  var prefixIds: Boolean | js.Object = js.native
}
object PluginPrefixIds {
  
  @scala.inline
  def apply(prefixIds: Boolean | js.Object): PluginPrefixIds = {
    val __obj = js.Dynamic.literal(prefixIds = prefixIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginPrefixIds]
  }
  
  @scala.inline
  implicit class PluginPrefixIdsMutableBuilder[Self <: PluginPrefixIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefixIds(value: Boolean | js.Object): Self = StObject.set(x, "prefixIds", value.asInstanceOf[js.Any])
  }
}
