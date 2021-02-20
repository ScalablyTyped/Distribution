package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveScriptElement extends PluginConfig {
  
  var removeScriptElement: Boolean | js.Object = js.native
}
object PluginRemoveScriptElement {
  
  @scala.inline
  def apply(removeScriptElement: Boolean | js.Object): PluginRemoveScriptElement = {
    val __obj = js.Dynamic.literal(removeScriptElement = removeScriptElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveScriptElement]
  }
  
  @scala.inline
  implicit class PluginRemoveScriptElementMutableBuilder[Self <: PluginRemoveScriptElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveScriptElement(value: Boolean | js.Object): Self = StObject.set(x, "removeScriptElement", value.asInstanceOf[js.Any])
  }
}
