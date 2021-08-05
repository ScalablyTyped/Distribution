package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveUselessDefs
  extends StObject
     with PluginConfig {
  
  var removeUselessDefs: Boolean | js.Object
}
object PluginRemoveUselessDefs {
  
  inline def apply(removeUselessDefs: Boolean | js.Object): PluginRemoveUselessDefs = {
    val __obj = js.Dynamic.literal(removeUselessDefs = removeUselessDefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveUselessDefs]
  }
  
  extension [Self <: PluginRemoveUselessDefs](x: Self) {
    
    inline def setRemoveUselessDefs(value: Boolean | js.Object): Self = StObject.set(x, "removeUselessDefs", value.asInstanceOf[js.Any])
  }
}
