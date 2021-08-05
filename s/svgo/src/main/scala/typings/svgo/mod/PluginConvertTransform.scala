package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginConvertTransform
  extends StObject
     with PluginConfig {
  
  var convertTransform: Boolean | js.Object
}
object PluginConvertTransform {
  
  inline def apply(convertTransform: Boolean | js.Object): PluginConvertTransform = {
    val __obj = js.Dynamic.literal(convertTransform = convertTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertTransform]
  }
  
  extension [Self <: PluginConvertTransform](x: Self) {
    
    inline def setConvertTransform(value: Boolean | js.Object): Self = StObject.set(x, "convertTransform", value.asInstanceOf[js.Any])
  }
}
