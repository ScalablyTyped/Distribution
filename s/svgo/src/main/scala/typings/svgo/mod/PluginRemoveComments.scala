package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveComments
  extends StObject
     with PluginConfig {
  
  var removeComments: Boolean | js.Object
}
object PluginRemoveComments {
  
  inline def apply(removeComments: Boolean | js.Object): PluginRemoveComments = {
    val __obj = js.Dynamic.literal(removeComments = removeComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveComments]
  }
  
  extension [Self <: PluginRemoveComments](x: Self) {
    
    inline def setRemoveComments(value: Boolean | js.Object): Self = StObject.set(x, "removeComments", value.asInstanceOf[js.Any])
  }
}
