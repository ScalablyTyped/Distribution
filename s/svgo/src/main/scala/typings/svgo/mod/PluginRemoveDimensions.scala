package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveDimensions
  extends StObject
     with PluginConfig {
  
  var removeDimensions: Boolean | js.Object
}
object PluginRemoveDimensions {
  
  inline def apply(removeDimensions: Boolean | js.Object): PluginRemoveDimensions = {
    val __obj = js.Dynamic.literal(removeDimensions = removeDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveDimensions]
  }
  
  extension [Self <: PluginRemoveDimensions](x: Self) {
    
    inline def setRemoveDimensions(value: Boolean | js.Object): Self = StObject.set(x, "removeDimensions", value.asInstanceOf[js.Any])
  }
}
