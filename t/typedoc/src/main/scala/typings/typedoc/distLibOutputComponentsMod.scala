package typings.typedoc

import typings.std.ClassDecorator
import typings.std.RegExp
import typings.typedoc.distLibModelsReflectionsMod.DeclarationReflection
import typings.typedoc.distLibModelsReflectionsMod.ProjectReflection
import typings.typedoc.distLibOutputEventsMod.PageEvent
import typings.typedoc.distLibOutputEventsMod.RendererEvent
import typings.typedoc.distLibOutputRendererMod.Renderer
import typings.typedoc.distLibUtilsComponentMod.AbstractComponent
import typings.typedoc.distLibUtilsComponentMod.ComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/components", JSImport.Namespace)
@js.native
object distLibOutputComponentsMod extends js.Object {
  @js.native
  abstract class ContextAwareRendererComponent () extends AbstractComponent[Renderer] {
    var location: js.Any = js.native
    var project: js.UndefOr[ProjectReflection] = js.native
    var reflection: js.UndefOr[DeclarationReflection] = js.native
    var urlPrefix: RegExp = js.native
    def getRelativeUrl(absolute: String): String = js.native
    /* protected */ def onBeginPage(page: PageEvent): Unit = js.native
    /* protected */ def onBeginRenderer(event: RendererEvent): Unit = js.native
  }
  
  @js.native
  abstract class RendererComponent () extends AbstractComponent[Renderer]
  
  def Component(options: ComponentOptions): ClassDecorator = js.native
}

