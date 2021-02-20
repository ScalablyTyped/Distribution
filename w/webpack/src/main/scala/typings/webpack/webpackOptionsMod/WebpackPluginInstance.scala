package typings.webpack.webpackOptionsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpackPluginInstance
  extends /* k */ StringDictionary[js.Any] {
  
  /**
  	 * The run point of the plugin, required method.
  	 */
  @JSName("apply")
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ js.Any
  ): Unit = js.native
}
object WebpackPluginInstance {
  
  @scala.inline
  def apply(
    apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ js.Any => Unit
  ): WebpackPluginInstance = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[WebpackPluginInstance]
  }
  
  @scala.inline
  implicit class WebpackPluginInstanceMutableBuilder[Self <: WebpackPluginInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ js.Any => Unit
    ): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
  }
}
