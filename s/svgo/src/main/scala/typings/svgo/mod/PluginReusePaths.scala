package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginReusePaths
  extends StObject
     with PluginConfig {
  
  var reusePaths: Boolean | js.Object
}
object PluginReusePaths {
  
  inline def apply(reusePaths: Boolean | js.Object): PluginReusePaths = {
    val __obj = js.Dynamic.literal(reusePaths = reusePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginReusePaths]
  }
  
  extension [Self <: PluginReusePaths](x: Self) {
    
    inline def setReusePaths(value: Boolean | js.Object): Self = StObject.set(x, "reusePaths", value.asInstanceOf[js.Any])
  }
}
