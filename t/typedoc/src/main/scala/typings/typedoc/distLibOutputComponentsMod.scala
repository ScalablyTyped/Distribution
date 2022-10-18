package typings.typedoc

import typings.std.ClassDecorator
import typings.typedoc.distLibModelsReflectionsMod.DeclarationReflection
import typings.typedoc.distLibModelsReflectionsMod.ProjectReflection
import typings.typedoc.distLibOutputEventsMod.PageEvent
import typings.typedoc.distLibOutputEventsMod.RendererEvent
import typings.typedoc.distLibOutputRendererMod.Renderer
import typings.typedoc.distLibUtilsComponentMod.AbstractComponent
import typings.typedoc.distLibUtilsComponentMod.ComponentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputComponentsMod {
  
  @JSImport("typedoc/dist/lib/output/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Component(options: ComponentOptions): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Component")(options.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  
  /* note: abstract class */ @JSImport("typedoc/dist/lib/output/components", "ContextAwareRendererComponent")
  @js.native
  open class ContextAwareRendererComponent protected () extends RendererComponent {
    /**
      * Create new Component instance.
      */
    def this(owner: Renderer) = this()
    
    /**
      * Transform the given absolute path into a relative path.
      *
      * @param absolute  The absolute path to transform.
      * @returns A path relative to the document currently processed.
      */
    def getRelativeUrl(absolute: String): String = js.native
    
    /**
      * The url of the document that is being currently generated.
      * Set when a page begins rendering.
      */
    /* private */ var location: Any = js.native
    
    /**
      * Triggered before a document will be rendered.
      *
      * @param page  An event object describing the current render operation.
      */
    /* protected */ def onBeginPage(page: PageEvent[Any]): Unit = js.native
    
    /**
      * Triggered before the renderer starts rendering a project.
      *
      * @param event  An event object describing the current render operation.
      */
    /* protected */ def onBeginRenderer(event: RendererEvent): Unit = js.native
    
    /**
      * The project that is currently processed.
      */
    /* protected */ var project: js.UndefOr[ProjectReflection] = js.native
    
    /**
      * The reflection that is currently processed.
      */
    /* protected */ var reflection: js.UndefOr[DeclarationReflection] = js.native
    
    /**
      * Regular expression to test if a string looks like an external url.
      */
    /* protected */ var urlPrefix: js.RegExp = js.native
  }
  
  /* note: abstract class */ @JSImport("typedoc/dist/lib/output/components", "RendererComponent")
  @js.native
  open class RendererComponent protected () extends AbstractComponent[Renderer] {
    /**
      * Create new Component instance.
      */
    def this(owner: Renderer) = this()
  }
}
