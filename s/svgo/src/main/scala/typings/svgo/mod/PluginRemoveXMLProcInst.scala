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
  
  @scala.inline
  def apply(removeXMLProcInst: Boolean | js.Object): PluginRemoveXMLProcInst = {
    val __obj = js.Dynamic.literal(removeXMLProcInst = removeXMLProcInst.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveXMLProcInst]
  }
  
  @scala.inline
  implicit class PluginRemoveXMLProcInstMutableBuilder[Self <: PluginRemoveXMLProcInst] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveXMLProcInst(value: Boolean | js.Object): Self = StObject.set(x, "removeXMLProcInst", value.asInstanceOf[js.Any])
  }
}
