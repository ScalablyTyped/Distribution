package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginConvertShapeToPath
  extends StObject
     with PluginConfig {
  
  var convertShapeToPath: Boolean | js.Object
}
object PluginConvertShapeToPath {
  
  inline def apply(convertShapeToPath: Boolean | js.Object): PluginConvertShapeToPath = {
    val __obj = js.Dynamic.literal(convertShapeToPath = convertShapeToPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertShapeToPath]
  }
  
  extension [Self <: PluginConvertShapeToPath](x: Self) {
    
    inline def setConvertShapeToPath(value: Boolean | js.Object): Self = StObject.set(x, "convertShapeToPath", value.asInstanceOf[js.Any])
  }
}
