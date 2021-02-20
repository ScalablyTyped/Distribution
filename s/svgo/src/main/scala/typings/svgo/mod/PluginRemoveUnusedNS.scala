package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveUnusedNS extends PluginConfig {
  
  var removeUnusedNS: Boolean | js.Object = js.native
}
object PluginRemoveUnusedNS {
  
  @scala.inline
  def apply(removeUnusedNS: Boolean | js.Object): PluginRemoveUnusedNS = {
    val __obj = js.Dynamic.literal(removeUnusedNS = removeUnusedNS.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveUnusedNS]
  }
  
  @scala.inline
  implicit class PluginRemoveUnusedNSMutableBuilder[Self <: PluginRemoveUnusedNS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveUnusedNS(value: Boolean | js.Object): Self = StObject.set(x, "removeUnusedNS", value.asInstanceOf[js.Any])
  }
}
