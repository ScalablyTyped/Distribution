package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginConvertStyleToAttrs
  extends StObject
     with PluginConfig {
  
  var convertStyleToAttrs: Boolean | js.Object
}
object PluginConvertStyleToAttrs {
  
  @scala.inline
  def apply(convertStyleToAttrs: Boolean | js.Object): PluginConvertStyleToAttrs = {
    val __obj = js.Dynamic.literal(convertStyleToAttrs = convertStyleToAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertStyleToAttrs]
  }
  
  @scala.inline
  implicit class PluginConvertStyleToAttrsMutableBuilder[Self <: PluginConvertStyleToAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvertStyleToAttrs(value: Boolean | js.Object): Self = StObject.set(x, "convertStyleToAttrs", value.asInstanceOf[js.Any])
  }
}
