package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginMergePaths extends PluginConfig {
  
  var mergePaths: Boolean | js.Object = js.native
}
object PluginMergePaths {
  
  @scala.inline
  def apply(mergePaths: Boolean | js.Object): PluginMergePaths = {
    val __obj = js.Dynamic.literal(mergePaths = mergePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMergePaths]
  }
  
  @scala.inline
  implicit class PluginMergePathsMutableBuilder[Self <: PluginMergePaths] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMergePaths(value: Boolean | js.Object): Self = StObject.set(x, "mergePaths", value.asInstanceOf[js.Any])
  }
}
