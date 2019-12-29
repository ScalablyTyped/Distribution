package typings.typedoc

import typings.handlebars.Handlebars.TemplateDelegate
import typings.typedoc.distLibOutputUtilsResourcesStackMod.Resource
import typings.typedoc.distLibOutputUtilsResourcesStackMod.ResourceStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/utils/resources/templates", JSImport.Namespace)
@js.native
object distLibOutputUtilsResourcesTemplatesMod extends js.Object {
  @js.native
  class PartialStack () extends TemplateStack {
    var registeredNames: js.Any = js.native
  }
  
  @js.native
  class Template[T] () extends Resource {
    var template: js.UndefOr[js.Any] = js.native
    def getTemplate(): TemplateDelegate[T] = js.native
    def render(context: js.Any): String = js.native
    def render(context: js.Any, options: js.Any): String = js.native
  }
  
  @js.native
  class TemplateStack ()
    extends ResourceStack[Template[js.Any]]
  
}

