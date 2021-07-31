package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveUselessDefs
  extends StObject
     with PluginConfig {
  
  var removeUselessDefs: Boolean | js.Object
}
object PluginRemoveUselessDefs {
  
  @scala.inline
  def apply(removeUselessDefs: Boolean | js.Object): PluginRemoveUselessDefs = {
    val __obj = js.Dynamic.literal(removeUselessDefs = removeUselessDefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveUselessDefs]
  }
  
  @scala.inline
  implicit class PluginRemoveUselessDefsMutableBuilder[Self <: PluginRemoveUselessDefs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveUselessDefs(value: Boolean | js.Object): Self = StObject.set(x, "removeUselessDefs", value.asInstanceOf[js.Any])
  }
}
