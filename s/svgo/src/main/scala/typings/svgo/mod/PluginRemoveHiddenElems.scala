package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveHiddenElems extends PluginConfig {
  
  var removeHiddenElems: Boolean | js.Object = js.native
}
object PluginRemoveHiddenElems {
  
  @scala.inline
  def apply(removeHiddenElems: Boolean | js.Object): PluginRemoveHiddenElems = {
    val __obj = js.Dynamic.literal(removeHiddenElems = removeHiddenElems.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveHiddenElems]
  }
  
  @scala.inline
  implicit class PluginRemoveHiddenElemsMutableBuilder[Self <: PluginRemoveHiddenElems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveHiddenElems(value: Boolean | js.Object): Self = StObject.set(x, "removeHiddenElems", value.asInstanceOf[js.Any])
  }
}
