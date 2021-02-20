package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginInlineStyles extends PluginConfig {
  
  var inlineStyles: Boolean | js.Object = js.native
}
object PluginInlineStyles {
  
  @scala.inline
  def apply(inlineStyles: Boolean | js.Object): PluginInlineStyles = {
    val __obj = js.Dynamic.literal(inlineStyles = inlineStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginInlineStyles]
  }
  
  @scala.inline
  implicit class PluginInlineStylesMutableBuilder[Self <: PluginInlineStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInlineStyles(value: Boolean | js.Object): Self = StObject.set(x, "inlineStyles", value.asInstanceOf[js.Any])
  }
}
