package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginSortDefsChildren extends PluginConfig {
  
  /** sort children of <defs> in order to improve compression */
  var sortDefsChildren: Boolean | js.Object = js.native
}
object PluginSortDefsChildren {
  
  @scala.inline
  def apply(sortDefsChildren: Boolean | js.Object): PluginSortDefsChildren = {
    val __obj = js.Dynamic.literal(sortDefsChildren = sortDefsChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginSortDefsChildren]
  }
  
  @scala.inline
  implicit class PluginSortDefsChildrenMutableBuilder[Self <: PluginSortDefsChildren] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSortDefsChildren(value: Boolean | js.Object): Self = StObject.set(x, "sortDefsChildren", value.asInstanceOf[js.Any])
  }
}
