package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveOffCanvasPaths extends PluginConfig {
  
  var removeOffCanvasPaths: Boolean | js.Object = js.native
}
object PluginRemoveOffCanvasPaths {
  
  @scala.inline
  def apply(removeOffCanvasPaths: Boolean | js.Object): PluginRemoveOffCanvasPaths = {
    val __obj = js.Dynamic.literal(removeOffCanvasPaths = removeOffCanvasPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveOffCanvasPaths]
  }
  
  @scala.inline
  implicit class PluginRemoveOffCanvasPathsMutableBuilder[Self <: PluginRemoveOffCanvasPaths] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveOffCanvasPaths(value: Boolean | js.Object): Self = StObject.set(x, "removeOffCanvasPaths", value.asInstanceOf[js.Any])
  }
}
