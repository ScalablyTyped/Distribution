package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginCollapseGroups extends PluginConfig {
  
  var collapseGroups: Boolean | js.Object = js.native
}
object PluginCollapseGroups {
  
  @scala.inline
  def apply(collapseGroups: Boolean | js.Object): PluginCollapseGroups = {
    val __obj = js.Dynamic.literal(collapseGroups = collapseGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCollapseGroups]
  }
  
  @scala.inline
  implicit class PluginCollapseGroupsMutableBuilder[Self <: PluginCollapseGroups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapseGroups(value: Boolean | js.Object): Self = StObject.set(x, "collapseGroups", value.asInstanceOf[js.Any])
  }
}
