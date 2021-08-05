package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveDesc
  extends StObject
     with PluginConfig {
  
  var removeDesc: Boolean | js.Object
}
object PluginRemoveDesc {
  
  inline def apply(removeDesc: Boolean | js.Object): PluginRemoveDesc = {
    val __obj = js.Dynamic.literal(removeDesc = removeDesc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveDesc]
  }
  
  extension [Self <: PluginRemoveDesc](x: Self) {
    
    inline def setRemoveDesc(value: Boolean | js.Object): Self = StObject.set(x, "removeDesc", value.asInstanceOf[js.Any])
  }
}
