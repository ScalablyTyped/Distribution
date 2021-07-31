package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveDoctype
  extends StObject
     with PluginConfig {
  
  var removeDoctype: Boolean | js.Object
}
object PluginRemoveDoctype {
  
  @scala.inline
  def apply(removeDoctype: Boolean | js.Object): PluginRemoveDoctype = {
    val __obj = js.Dynamic.literal(removeDoctype = removeDoctype.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveDoctype]
  }
  
  @scala.inline
  implicit class PluginRemoveDoctypeMutableBuilder[Self <: PluginRemoveDoctype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveDoctype(value: Boolean | js.Object): Self = StObject.set(x, "removeDoctype", value.asInstanceOf[js.Any])
  }
}
