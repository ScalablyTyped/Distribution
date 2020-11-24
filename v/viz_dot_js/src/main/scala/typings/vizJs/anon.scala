package typings.vizJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Module extends js.Object {
    
    var Module: typings.vizJs.Module = js.native
    
    def render(instance: typings.vizJs.Module, src: String, options: Options): String = js.native
    @JSName("render")
    var render_Original: RenderFunction = js.native
  }
}
