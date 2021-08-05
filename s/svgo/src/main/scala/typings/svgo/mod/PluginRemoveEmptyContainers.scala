package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveEmptyContainers
  extends StObject
     with PluginConfig {
  
  var removeEmptyContainers: Boolean | js.Object
}
object PluginRemoveEmptyContainers {
  
  inline def apply(removeEmptyContainers: Boolean | js.Object): PluginRemoveEmptyContainers = {
    val __obj = js.Dynamic.literal(removeEmptyContainers = removeEmptyContainers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveEmptyContainers]
  }
  
  extension [Self <: PluginRemoveEmptyContainers](x: Self) {
    
    inline def setRemoveEmptyContainers(value: Boolean | js.Object): Self = StObject.set(x, "removeEmptyContainers", value.asInstanceOf[js.Any])
  }
}
