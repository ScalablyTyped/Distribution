package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveEmptyAttrs extends PluginConfig {
  
  var removeEmptyAttrs: Boolean | js.Object = js.native
}
object PluginRemoveEmptyAttrs {
  
  @scala.inline
  def apply(removeEmptyAttrs: Boolean | js.Object): PluginRemoveEmptyAttrs = {
    val __obj = js.Dynamic.literal(removeEmptyAttrs = removeEmptyAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveEmptyAttrs]
  }
  
  @scala.inline
  implicit class PluginRemoveEmptyAttrsMutableBuilder[Self <: PluginRemoveEmptyAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveEmptyAttrs(value: Boolean | js.Object): Self = StObject.set(x, "removeEmptyAttrs", value.asInstanceOf[js.Any])
  }
}
