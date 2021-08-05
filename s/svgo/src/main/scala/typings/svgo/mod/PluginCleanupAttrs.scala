package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginCleanupAttrs
  extends StObject
     with PluginConfig {
  
  var cleanupAttrs: Boolean | js.Object
}
object PluginCleanupAttrs {
  
  inline def apply(cleanupAttrs: Boolean | js.Object): PluginCleanupAttrs = {
    val __obj = js.Dynamic.literal(cleanupAttrs = cleanupAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCleanupAttrs]
  }
  
  extension [Self <: PluginCleanupAttrs](x: Self) {
    
    inline def setCleanupAttrs(value: Boolean | js.Object): Self = StObject.set(x, "cleanupAttrs", value.asInstanceOf[js.Any])
  }
}
