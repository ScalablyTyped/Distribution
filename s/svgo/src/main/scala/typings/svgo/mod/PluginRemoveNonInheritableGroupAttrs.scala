package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveNonInheritableGroupAttrs
  extends StObject
     with PluginConfig {
  
  var removeNonInheritableGroupAttrs: Boolean | js.Object
}
object PluginRemoveNonInheritableGroupAttrs {
  
  @scala.inline
  def apply(removeNonInheritableGroupAttrs: Boolean | js.Object): PluginRemoveNonInheritableGroupAttrs = {
    val __obj = js.Dynamic.literal(removeNonInheritableGroupAttrs = removeNonInheritableGroupAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveNonInheritableGroupAttrs]
  }
  
  @scala.inline
  implicit class PluginRemoveNonInheritableGroupAttrsMutableBuilder[Self <: PluginRemoveNonInheritableGroupAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveNonInheritableGroupAttrs(value: Boolean | js.Object): Self = StObject.set(x, "removeNonInheritableGroupAttrs", value.asInstanceOf[js.Any])
  }
}
