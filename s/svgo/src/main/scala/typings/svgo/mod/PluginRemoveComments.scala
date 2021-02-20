package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveComments extends PluginConfig {
  
  var removeComments: Boolean | js.Object = js.native
}
object PluginRemoveComments {
  
  @scala.inline
  def apply(removeComments: Boolean | js.Object): PluginRemoveComments = {
    val __obj = js.Dynamic.literal(removeComments = removeComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveComments]
  }
  
  @scala.inline
  implicit class PluginRemoveCommentsMutableBuilder[Self <: PluginRemoveComments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveComments(value: Boolean | js.Object): Self = StObject.set(x, "removeComments", value.asInstanceOf[js.Any])
  }
}
