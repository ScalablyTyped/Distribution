package typings.typedoc

import typings.typedoc.componentMod.AbstractComponent
import typings.typedoc.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/plugins/JavascriptIndexPlugin", JSImport.Namespace)
@js.native
object javascriptIndexPluginMod extends js.Object {
  
  @js.native
  class JavascriptIndexPlugin () extends AbstractComponent[Renderer] {
    
    var onRendererBegin: js.Any = js.native
  }
}
