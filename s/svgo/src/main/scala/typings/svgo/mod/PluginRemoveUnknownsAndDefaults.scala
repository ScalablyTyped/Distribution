package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveUnknownsAndDefaults
  extends StObject
     with PluginConfig {
  
  var removeUnknownsAndDefaults: Boolean | js.Object
}
object PluginRemoveUnknownsAndDefaults {
  
  inline def apply(removeUnknownsAndDefaults: Boolean | js.Object): PluginRemoveUnknownsAndDefaults = {
    val __obj = js.Dynamic.literal(removeUnknownsAndDefaults = removeUnknownsAndDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveUnknownsAndDefaults]
  }
  
  extension [Self <: PluginRemoveUnknownsAndDefaults](x: Self) {
    
    inline def setRemoveUnknownsAndDefaults(value: Boolean | js.Object): Self = StObject.set(x, "removeUnknownsAndDefaults", value.asInstanceOf[js.Any])
  }
}
