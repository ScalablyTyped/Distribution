package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveDoctype
  extends StObject
     with PluginConfig {
  
  var removeDoctype: Boolean | js.Object
}
object PluginRemoveDoctype {
  
  inline def apply(removeDoctype: Boolean | js.Object): PluginRemoveDoctype = {
    val __obj = js.Dynamic.literal(removeDoctype = removeDoctype.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveDoctype]
  }
  
  extension [Self <: PluginRemoveDoctype](x: Self) {
    
    inline def setRemoveDoctype(value: Boolean | js.Object): Self = StObject.set(x, "removeDoctype", value.asInstanceOf[js.Any])
  }
}
