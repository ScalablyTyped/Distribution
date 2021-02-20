package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginAddClassesToSVGElement extends PluginConfig {
  
  var addClassesToSVGElement: Boolean | js.Object = js.native
}
object PluginAddClassesToSVGElement {
  
  @scala.inline
  def apply(addClassesToSVGElement: Boolean | js.Object): PluginAddClassesToSVGElement = {
    val __obj = js.Dynamic.literal(addClassesToSVGElement = addClassesToSVGElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginAddClassesToSVGElement]
  }
  
  @scala.inline
  implicit class PluginAddClassesToSVGElementMutableBuilder[Self <: PluginAddClassesToSVGElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddClassesToSVGElement(value: Boolean | js.Object): Self = StObject.set(x, "addClassesToSVGElement", value.asInstanceOf[js.Any])
  }
}
