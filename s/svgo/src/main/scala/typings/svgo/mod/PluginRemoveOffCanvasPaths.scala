package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveOffCanvasPaths
  extends StObject
     with PluginConfig {
  
  var removeOffCanvasPaths: Boolean | js.Object
}
object PluginRemoveOffCanvasPaths {
  
  inline def apply(removeOffCanvasPaths: Boolean | js.Object): PluginRemoveOffCanvasPaths = {
    val __obj = js.Dynamic.literal(removeOffCanvasPaths = removeOffCanvasPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveOffCanvasPaths]
  }
  
  extension [Self <: PluginRemoveOffCanvasPaths](x: Self) {
    
    inline def setRemoveOffCanvasPaths(value: Boolean | js.Object): Self = StObject.set(x, "removeOffCanvasPaths", value.asInstanceOf[js.Any])
  }
}
