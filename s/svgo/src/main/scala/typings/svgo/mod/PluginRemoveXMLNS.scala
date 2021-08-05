package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveXMLNS
  extends StObject
     with PluginConfig {
  
  var removeXMLNS: Boolean | js.Object
}
object PluginRemoveXMLNS {
  
  inline def apply(removeXMLNS: Boolean | js.Object): PluginRemoveXMLNS = {
    val __obj = js.Dynamic.literal(removeXMLNS = removeXMLNS.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveXMLNS]
  }
  
  extension [Self <: PluginRemoveXMLNS](x: Self) {
    
    inline def setRemoveXMLNS(value: Boolean | js.Object): Self = StObject.set(x, "removeXMLNS", value.asInstanceOf[js.Any])
  }
}
