package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginConvertPathData extends PluginConfig {
  
  var convertPathData: Boolean | js.Object = js.native
}
object PluginConvertPathData {
  
  @scala.inline
  def apply(convertPathData: Boolean | js.Object): PluginConvertPathData = {
    val __obj = js.Dynamic.literal(convertPathData = convertPathData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertPathData]
  }
  
  @scala.inline
  implicit class PluginConvertPathDataMutableBuilder[Self <: PluginConvertPathData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvertPathData(value: Boolean | js.Object): Self = StObject.set(x, "convertPathData", value.asInstanceOf[js.Any])
  }
}
