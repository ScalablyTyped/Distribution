package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveAttrs
  extends StObject
     with PluginConfig {
  
  var removeAttrs: Boolean | js.Object
}
object PluginRemoveAttrs {
  
  @scala.inline
  def apply(removeAttrs: Boolean | js.Object): PluginRemoveAttrs = {
    val __obj = js.Dynamic.literal(removeAttrs = removeAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveAttrs]
  }
  
  @scala.inline
  implicit class PluginRemoveAttrsMutableBuilder[Self <: PluginRemoveAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveAttrs(value: Boolean | js.Object): Self = StObject.set(x, "removeAttrs", value.asInstanceOf[js.Any])
  }
}
