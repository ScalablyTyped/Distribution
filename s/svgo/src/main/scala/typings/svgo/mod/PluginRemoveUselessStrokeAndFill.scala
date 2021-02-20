package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveUselessStrokeAndFill extends PluginConfig {
  
  var removeUselessStrokeAndFill: Boolean | js.Object = js.native
}
object PluginRemoveUselessStrokeAndFill {
  
  @scala.inline
  def apply(removeUselessStrokeAndFill: Boolean | js.Object): PluginRemoveUselessStrokeAndFill = {
    val __obj = js.Dynamic.literal(removeUselessStrokeAndFill = removeUselessStrokeAndFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveUselessStrokeAndFill]
  }
  
  @scala.inline
  implicit class PluginRemoveUselessStrokeAndFillMutableBuilder[Self <: PluginRemoveUselessStrokeAndFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveUselessStrokeAndFill(value: Boolean | js.Object): Self = StObject.set(x, "removeUselessStrokeAndFill", value.asInstanceOf[js.Any])
  }
}
