package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginAddClassesToSVGElement
  extends StObject
     with PluginConfig {
  
  var addClassesToSVGElement: Boolean | js.Object
}
object PluginAddClassesToSVGElement {
  
  inline def apply(addClassesToSVGElement: Boolean | js.Object): PluginAddClassesToSVGElement = {
    val __obj = js.Dynamic.literal(addClassesToSVGElement = addClassesToSVGElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginAddClassesToSVGElement]
  }
  
  extension [Self <: PluginAddClassesToSVGElement](x: Self) {
    
    inline def setAddClassesToSVGElement(value: Boolean | js.Object): Self = StObject.set(x, "addClassesToSVGElement", value.asInstanceOf[js.Any])
  }
}
