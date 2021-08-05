package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginSortAttrs
  extends StObject
     with PluginConfig {
  
  var sortAttrs: Boolean | js.Object
}
object PluginSortAttrs {
  
  inline def apply(sortAttrs: Boolean | js.Object): PluginSortAttrs = {
    val __obj = js.Dynamic.literal(sortAttrs = sortAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginSortAttrs]
  }
  
  extension [Self <: PluginSortAttrs](x: Self) {
    
    inline def setSortAttrs(value: Boolean | js.Object): Self = StObject.set(x, "sortAttrs", value.asInstanceOf[js.Any])
  }
}
