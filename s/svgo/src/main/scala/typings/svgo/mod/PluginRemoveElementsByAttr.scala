package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveElementsByAttr extends PluginConfig {
  
  var removeElementsByAttr: Boolean | js.Object = js.native
}
object PluginRemoveElementsByAttr {
  
  @scala.inline
  def apply(removeElementsByAttr: Boolean | js.Object): PluginRemoveElementsByAttr = {
    val __obj = js.Dynamic.literal(removeElementsByAttr = removeElementsByAttr.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveElementsByAttr]
  }
  
  @scala.inline
  implicit class PluginRemoveElementsByAttrMutableBuilder[Self <: PluginRemoveElementsByAttr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveElementsByAttr(value: Boolean | js.Object): Self = StObject.set(x, "removeElementsByAttr", value.asInstanceOf[js.Any])
  }
}
