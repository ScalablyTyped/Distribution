package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveXMLProcInst
  extends StObject
     with PluginConfig {
  
  var removeXMLProcInst: Boolean | js.Object
}
object PluginRemoveXMLProcInst {
  
  inline def apply(removeXMLProcInst: Boolean | js.Object): PluginRemoveXMLProcInst = {
    val __obj = js.Dynamic.literal(removeXMLProcInst = removeXMLProcInst.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveXMLProcInst]
  }
  
  extension [Self <: PluginRemoveXMLProcInst](x: Self) {
    
    inline def setRemoveXMLProcInst(value: Boolean | js.Object): Self = StObject.set(x, "removeXMLProcInst", value.asInstanceOf[js.Any])
  }
}
