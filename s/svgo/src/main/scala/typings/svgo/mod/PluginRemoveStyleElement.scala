package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveStyleElement extends PluginConfig {
  
  var removeStyleElement: Boolean | js.Object = js.native
}
object PluginRemoveStyleElement {
  
  @scala.inline
  def apply(removeStyleElement: Boolean | js.Object): PluginRemoveStyleElement = {
    val __obj = js.Dynamic.literal(removeStyleElement = removeStyleElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveStyleElement]
  }
  
  @scala.inline
  implicit class PluginRemoveStyleElementMutableBuilder[Self <: PluginRemoveStyleElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveStyleElement(value: Boolean | js.Object): Self = StObject.set(x, "removeStyleElement", value.asInstanceOf[js.Any])
  }
}
