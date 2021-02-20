package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginSortAttrs extends PluginConfig {
  
  var sortAttrs: Boolean | js.Object = js.native
}
object PluginSortAttrs {
  
  @scala.inline
  def apply(sortAttrs: Boolean | js.Object): PluginSortAttrs = {
    val __obj = js.Dynamic.literal(sortAttrs = sortAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginSortAttrs]
  }
  
  @scala.inline
  implicit class PluginSortAttrsMutableBuilder[Self <: PluginSortAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSortAttrs(value: Boolean | js.Object): Self = StObject.set(x, "sortAttrs", value.asInstanceOf[js.Any])
  }
}
