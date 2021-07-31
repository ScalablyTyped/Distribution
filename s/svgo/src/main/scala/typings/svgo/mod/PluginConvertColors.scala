package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginConvertColors
  extends StObject
     with PluginConfig {
  
  var convertColors: Boolean | js.Object
}
object PluginConvertColors {
  
  @scala.inline
  def apply(convertColors: Boolean | js.Object): PluginConvertColors = {
    val __obj = js.Dynamic.literal(convertColors = convertColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertColors]
  }
  
  @scala.inline
  implicit class PluginConvertColorsMutableBuilder[Self <: PluginConvertColors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvertColors(value: Boolean | js.Object): Self = StObject.set(x, "convertColors", value.asInstanceOf[js.Any])
  }
}
