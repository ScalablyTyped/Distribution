package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginCollapseGroups
  extends StObject
     with PluginConfig {
  
  var collapseGroups: Boolean | js.Object
}
object PluginCollapseGroups {
  
  inline def apply(collapseGroups: Boolean | js.Object): PluginCollapseGroups = {
    val __obj = js.Dynamic.literal(collapseGroups = collapseGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCollapseGroups]
  }
  
  extension [Self <: PluginCollapseGroups](x: Self) {
    
    inline def setCollapseGroups(value: Boolean | js.Object): Self = StObject.set(x, "collapseGroups", value.asInstanceOf[js.Any])
  }
}
