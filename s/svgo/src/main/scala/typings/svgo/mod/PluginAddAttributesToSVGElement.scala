package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginAddAttributesToSVGElement extends PluginConfig {
  
  var addAttributesToSVGElement: Boolean | js.Object = js.native
}
object PluginAddAttributesToSVGElement {
  
  @scala.inline
  def apply(addAttributesToSVGElement: Boolean | js.Object): PluginAddAttributesToSVGElement = {
    val __obj = js.Dynamic.literal(addAttributesToSVGElement = addAttributesToSVGElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginAddAttributesToSVGElement]
  }
  
  @scala.inline
  implicit class PluginAddAttributesToSVGElementMutableBuilder[Self <: PluginAddAttributesToSVGElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAttributesToSVGElement(value: Boolean | js.Object): Self = StObject.set(x, "addAttributesToSVGElement", value.asInstanceOf[js.Any])
  }
}
