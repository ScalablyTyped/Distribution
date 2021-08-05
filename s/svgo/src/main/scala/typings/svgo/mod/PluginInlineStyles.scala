package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginInlineStyles
  extends StObject
     with PluginConfig {
  
  var inlineStyles: Boolean | js.Object
}
object PluginInlineStyles {
  
  inline def apply(inlineStyles: Boolean | js.Object): PluginInlineStyles = {
    val __obj = js.Dynamic.literal(inlineStyles = inlineStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginInlineStyles]
  }
  
  extension [Self <: PluginInlineStyles](x: Self) {
    
    inline def setInlineStyles(value: Boolean | js.Object): Self = StObject.set(x, "inlineStyles", value.asInstanceOf[js.Any])
  }
}
