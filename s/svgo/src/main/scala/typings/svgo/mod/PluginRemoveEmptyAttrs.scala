package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveEmptyAttrs
  extends StObject
     with PluginConfig {
  
  var removeEmptyAttrs: Boolean | js.Object
}
object PluginRemoveEmptyAttrs {
  
  inline def apply(removeEmptyAttrs: Boolean | js.Object): PluginRemoveEmptyAttrs = {
    val __obj = js.Dynamic.literal(removeEmptyAttrs = removeEmptyAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveEmptyAttrs]
  }
  
  extension [Self <: PluginRemoveEmptyAttrs](x: Self) {
    
    inline def setRemoveEmptyAttrs(value: Boolean | js.Object): Self = StObject.set(x, "removeEmptyAttrs", value.asInstanceOf[js.Any])
  }
}
