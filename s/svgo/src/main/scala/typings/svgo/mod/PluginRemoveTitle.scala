package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveTitle extends PluginConfig {
  
  var removeTitle: Boolean | js.Object = js.native
}
object PluginRemoveTitle {
  
  @scala.inline
  def apply(removeTitle: Boolean | js.Object): PluginRemoveTitle = {
    val __obj = js.Dynamic.literal(removeTitle = removeTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveTitle]
  }
  
  @scala.inline
  implicit class PluginRemoveTitleMutableBuilder[Self <: PluginRemoveTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveTitle(value: Boolean | js.Object): Self = StObject.set(x, "removeTitle", value.asInstanceOf[js.Any])
  }
}
