package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginMergePaths
  extends StObject
     with PluginConfig {
  
  var mergePaths: Boolean | js.Object
}
object PluginMergePaths {
  
  inline def apply(mergePaths: Boolean | js.Object): PluginMergePaths = {
    val __obj = js.Dynamic.literal(mergePaths = mergePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMergePaths]
  }
  
  extension [Self <: PluginMergePaths](x: Self) {
    
    inline def setMergePaths(value: Boolean | js.Object): Self = StObject.set(x, "mergePaths", value.asInstanceOf[js.Any])
  }
}
