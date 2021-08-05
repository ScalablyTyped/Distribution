package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginCleanupListOfValues
  extends StObject
     with PluginConfig {
  
  var cleanupListOfValues: Boolean | js.Object
}
object PluginCleanupListOfValues {
  
  inline def apply(cleanupListOfValues: Boolean | js.Object): PluginCleanupListOfValues = {
    val __obj = js.Dynamic.literal(cleanupListOfValues = cleanupListOfValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCleanupListOfValues]
  }
  
  extension [Self <: PluginCleanupListOfValues](x: Self) {
    
    inline def setCleanupListOfValues(value: Boolean | js.Object): Self = StObject.set(x, "cleanupListOfValues", value.asInstanceOf[js.Any])
  }
}
