package typings.typedoc

import typings.handlebars.Handlebars.RuntimeOptions
import typings.handlebars.Handlebars.TemplateDelegate
import typings.typedoc.stackMod.Resource
import typings.typedoc.stackMod.ResourceStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/utils/resources/templates", JSImport.Namespace)
@js.native
object templatesMod extends js.Object {
  
  @js.native
  class PartialStack () extends TemplateStack {
    
    var registeredNames: js.Any = js.native
  }
  
  @js.native
  class Template[T] () extends Resource {
    
    def getTemplate(): TemplateDelegate[T] = js.native
    
    def render(context: js.Any): String = js.native
    def render(context: js.Any, options: RuntimeOptions): String = js.native
    
    var template: js.Any = js.native
  }
  
  @js.native
  class TemplateStack ()
    extends ResourceStack[Template[js.Any]]
}
