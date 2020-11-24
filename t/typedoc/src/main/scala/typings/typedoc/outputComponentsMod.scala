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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/components", JSImport.Namespace)
@js.native
object outputComponentsMod extends js.Object {
  
  def Component(options: ComponentOptions): ClassDecorator = js.native
  
  @js.native
  abstract class ContextAwareRendererComponent () extends AbstractComponent[Renderer] {
    
    def getRelativeUrl(absolute: String): String = js.native
    
    var location: js.Any = js.native
    
    /* protected */ def onBeginPage(page: PageEvent): Unit = js.native
    
    /* protected */ def onBeginRenderer(event: RendererEvent): Unit = js.native
    
    var project: js.UndefOr[ProjectReflection] = js.native
    
    var reflection: js.UndefOr[DeclarationReflection] = js.native
    
    var urlPrefix: RegExp = js.native
  }
  
  @js.native
  abstract class RendererComponent () extends AbstractComponent[Renderer]
}
