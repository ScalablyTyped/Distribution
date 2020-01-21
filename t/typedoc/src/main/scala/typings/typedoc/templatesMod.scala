package typings.typedoc

import typings.handlebars.Handlebars.RuntimeOptions
import typings.handlebars.Handlebars.TemplateDelegate
import typings.typedoc.stackMod.Resource
import typings.typedoc.stackMod.ResourceStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/utils/resources/templates", JSImport.Namespace)
@js.native
object templatesMod extends js.Object {
  @js.native
  class PartialStack () extends TemplateStack {
    var registeredNames: js.Any = js.native
  }
  
  @js.native
  class Template[T] () extends Resource {
    var template: js.UndefOr[js.Any] = js.native
    def getTemplate(): TemplateDelegate[T] = js.native
    def render(context: js.Any): String = js.native
    def render(context: js.Any, options: RuntimeOptions): String = js.native
  }
  
  @js.native
  class TemplateStack ()
    extends ResourceStack[Template[js.Any]]
  
}

