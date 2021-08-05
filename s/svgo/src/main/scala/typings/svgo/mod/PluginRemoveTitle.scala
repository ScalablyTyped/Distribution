package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveTitle
  extends StObject
     with PluginConfig {
  
  var removeTitle: Boolean | js.Object
}
object PluginRemoveTitle {
  
  inline def apply(removeTitle: Boolean | js.Object): PluginRemoveTitle = {
    val __obj = js.Dynamic.literal(removeTitle = removeTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveTitle]
  }
  
  extension [Self <: PluginRemoveTitle](x: Self) {
    
    inline def setRemoveTitle(value: Boolean | js.Object): Self = StObject.set(x, "removeTitle", value.asInstanceOf[js.Any])
  }
}
