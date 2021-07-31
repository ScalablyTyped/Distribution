package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveViewBox
  extends StObject
     with PluginConfig {
  
  var removeViewBox: Boolean | js.Object
}
object PluginRemoveViewBox {
  
  @scala.inline
  def apply(removeViewBox: Boolean | js.Object): PluginRemoveViewBox = {
    val __obj = js.Dynamic.literal(removeViewBox = removeViewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveViewBox]
  }
  
  @scala.inline
  implicit class PluginRemoveViewBoxMutableBuilder[Self <: PluginRemoveViewBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveViewBox(value: Boolean | js.Object): Self = StObject.set(x, "removeViewBox", value.asInstanceOf[js.Any])
  }
}
