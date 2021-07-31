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
  
  @scala.inline
  def apply(removeXMLNS: Boolean | js.Object): PluginRemoveXMLNS = {
    val __obj = js.Dynamic.literal(removeXMLNS = removeXMLNS.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveXMLNS]
  }
  
  @scala.inline
  implicit class PluginRemoveXMLNSMutableBuilder[Self <: PluginRemoveXMLNS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveXMLNS(value: Boolean | js.Object): Self = StObject.set(x, "removeXMLNS", value.asInstanceOf[js.Any])
  }
}
