package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveMetadata
  extends StObject
     with PluginConfig {
  
  var removeMetadata: Boolean | js.Object
}
object PluginRemoveMetadata {
  
  @scala.inline
  def apply(removeMetadata: Boolean | js.Object): PluginRemoveMetadata = {
    val __obj = js.Dynamic.literal(removeMetadata = removeMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveMetadata]
  }
  
  @scala.inline
  implicit class PluginRemoveMetadataMutableBuilder[Self <: PluginRemoveMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveMetadata(value: Boolean | js.Object): Self = StObject.set(x, "removeMetadata", value.asInstanceOf[js.Any])
  }
}
