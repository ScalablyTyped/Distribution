package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveAttributesBySelector extends PluginConfig {
  
  var removeAttributesBySelector: Boolean | js.Object = js.native
}
object PluginRemoveAttributesBySelector {
  
  @scala.inline
  def apply(removeAttributesBySelector: Boolean | js.Object): PluginRemoveAttributesBySelector = {
    val __obj = js.Dynamic.literal(removeAttributesBySelector = removeAttributesBySelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveAttributesBySelector]
  }
  
  @scala.inline
  implicit class PluginRemoveAttributesBySelectorMutableBuilder[Self <: PluginRemoveAttributesBySelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveAttributesBySelector(value: Boolean | js.Object): Self = StObject.set(x, "removeAttributesBySelector", value.asInstanceOf[js.Any])
  }
}
