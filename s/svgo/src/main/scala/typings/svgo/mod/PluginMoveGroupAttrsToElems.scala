package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginMoveGroupAttrsToElems extends PluginConfig {
  
  var moveGroupAttrsToElems: Boolean | js.Object = js.native
}
object PluginMoveGroupAttrsToElems {
  
  @scala.inline
  def apply(moveGroupAttrsToElems: Boolean | js.Object): PluginMoveGroupAttrsToElems = {
    val __obj = js.Dynamic.literal(moveGroupAttrsToElems = moveGroupAttrsToElems.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMoveGroupAttrsToElems]
  }
  
  @scala.inline
  implicit class PluginMoveGroupAttrsToElemsMutableBuilder[Self <: PluginMoveGroupAttrsToElems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMoveGroupAttrsToElems(value: Boolean | js.Object): Self = StObject.set(x, "moveGroupAttrsToElems", value.asInstanceOf[js.Any])
  }
}
