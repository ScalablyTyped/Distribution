package typings.typedoc

import typings.std.ClassDecorator
import typings.std.RegExp
import typings.typedoc.componentMod.AbstractComponent
import typings.typedoc.componentMod.ComponentOptions
import typings.typedoc.eventsMod.PageEvent
import typings.typedoc.eventsMod.RendererEvent
import typings.typedoc.reflectionsMod.DeclarationReflection
import typings.typedoc.reflectionsMod.ProjectReflection
import typings.typedoc.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/components", JSImport.Namespace)
@js.native
object outputComponentsMod extends js.Object {
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

