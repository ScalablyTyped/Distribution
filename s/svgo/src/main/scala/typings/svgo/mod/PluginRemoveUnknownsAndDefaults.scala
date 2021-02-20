package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveUnknownsAndDefaults extends PluginConfig {
  
  var removeUnknownsAndDefaults: Boolean | js.Object = js.native
}
object PluginRemoveUnknownsAndDefaults {
  
  @scala.inline
  def apply(removeUnknownsAndDefaults: Boolean | js.Object): PluginRemoveUnknownsAndDefaults = {
    val __obj = js.Dynamic.literal(removeUnknownsAndDefaults = removeUnknownsAndDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveUnknownsAndDefaults]
  }
  
  @scala.inline
  implicit class PluginRemoveUnknownsAndDefaultsMutableBuilder[Self <: PluginRemoveUnknownsAndDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveUnknownsAndDefaults(value: Boolean | js.Object): Self = StObject.set(x, "removeUnknownsAndDefaults", value.asInstanceOf[js.Any])
  }
}
