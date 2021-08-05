package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginCleanupNumericValues
  extends StObject
     with PluginConfig {
  
  var cleanupNumericValues: Boolean | js.Object
}
object PluginCleanupNumericValues {
  
  inline def apply(cleanupNumericValues: Boolean | js.Object): PluginCleanupNumericValues = {
    val __obj = js.Dynamic.literal(cleanupNumericValues = cleanupNumericValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCleanupNumericValues]
  }
  
  extension [Self <: PluginCleanupNumericValues](x: Self) {
    
    inline def setCleanupNumericValues(value: Boolean | js.Object): Self = StObject.set(x, "cleanupNumericValues", value.asInstanceOf[js.Any])
  }
}
