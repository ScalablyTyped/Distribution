package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveUselessStrokeAndFill
  extends StObject
     with PluginConfig {
  
  var removeUselessStrokeAndFill: Boolean | js.Object
}
object PluginRemoveUselessStrokeAndFill {
  
  inline def apply(removeUselessStrokeAndFill: Boolean | js.Object): PluginRemoveUselessStrokeAndFill = {
    val __obj = js.Dynamic.literal(removeUselessStrokeAndFill = removeUselessStrokeAndFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveUselessStrokeAndFill]
  }
  
  extension [Self <: PluginRemoveUselessStrokeAndFill](x: Self) {
    
    inline def setRemoveUselessStrokeAndFill(value: Boolean | js.Object): Self = StObject.set(x, "removeUselessStrokeAndFill", value.asInstanceOf[js.Any])
  }
}
