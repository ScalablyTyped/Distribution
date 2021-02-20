package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveEmptyText extends PluginConfig {
  
  var removeEmptyText: Boolean | js.Object = js.native
}
object PluginRemoveEmptyText {
  
  @scala.inline
  def apply(removeEmptyText: Boolean | js.Object): PluginRemoveEmptyText = {
    val __obj = js.Dynamic.literal(removeEmptyText = removeEmptyText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveEmptyText]
  }
  
  @scala.inline
  implicit class PluginRemoveEmptyTextMutableBuilder[Self <: PluginRemoveEmptyText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveEmptyText(value: Boolean | js.Object): Self = StObject.set(x, "removeEmptyText", value.asInstanceOf[js.Any])
  }
}
