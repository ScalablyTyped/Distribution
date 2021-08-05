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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputComponentsMod {
  
  @JSImport("typedoc/dist/lib/output/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Component(options: ComponentOptions): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Component")(options.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  
  @JSImport("typedoc/dist/lib/output/components", "ContextAwareRendererComponent")
  @js.native
  abstract class ContextAwareRendererComponent protected () extends RendererComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
    
    def getRelativeUrl(absolute: String): String = js.native
    
    /* private */ var location: js.Any = js.native
    
    /* protected */ def onBeginPage(page: PageEvent): Unit = js.native
    
    /* protected */ def onBeginRenderer(event: RendererEvent): Unit = js.native
    
    /* protected */ var project: js.UndefOr[ProjectReflection] = js.native
    
    /* protected */ var reflection: js.UndefOr[DeclarationReflection] = js.native
    
    /* protected */ var urlPrefix: RegExp = js.native
  }
  
  @JSImport("typedoc/dist/lib/output/components", "RendererComponent")
  @js.native
  abstract class RendererComponent protected () extends AbstractComponent[Renderer] {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
  }
}
