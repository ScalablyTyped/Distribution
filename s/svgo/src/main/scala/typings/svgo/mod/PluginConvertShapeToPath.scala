package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginConvertShapeToPath extends PluginConfig {
  
  var convertShapeToPath: Boolean | js.Object = js.native
}
object PluginConvertShapeToPath {
  
  @scala.inline
  def apply(convertShapeToPath: Boolean | js.Object): PluginConvertShapeToPath = {
    val __obj = js.Dynamic.literal(convertShapeToPath = convertShapeToPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertShapeToPath]
  }
  
  @scala.inline
  implicit class PluginConvertShapeToPathMutableBuilder[Self <: PluginConvertShapeToPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvertShapeToPath(value: Boolean | js.Object): Self = StObject.set(x, "convertShapeToPath", value.asInstanceOf[js.Any])
  }
}
