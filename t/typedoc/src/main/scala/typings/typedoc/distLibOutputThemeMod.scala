package typings.typedoc

import typings.typedoc.distLibModelsMod.Reflection
import typings.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
import typings.typedoc.distLibOutputComponentsMod.RendererComponent
import typings.typedoc.distLibOutputEventsMod.PageEvent
import typings.typedoc.distLibOutputModelsUrlMappingMod.UrlMapping
import typings.typedoc.distLibOutputRendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemeMod {
  
  /* note: abstract class */ @JSImport("typedoc/dist/lib/output/theme", "Theme")
  @js.native
  open class Theme protected () extends RendererComponent {
    /**
      * Create a new BaseTheme instance.
      *
      * @param renderer  The renderer this theme is attached to.
      */
    def this(renderer: Renderer) = this()
    
    /**
      * Map the models of the given project to the desired output files.
      * It is assumed that with the project structure:
      * ```text
      * A
      * |- B
      *    |- C
      * ```
      * If `B` has a UrlMapping, then `A` also has a UrlMapping, and `C` may or
      * may not have a UrlMapping. If `B` does not have a UrlMapping, then `A`
      * may or may not have a UrlMapping, but `C` must not have a UrlMapping.
      *
      * @param project The project whose urls should be generated.
      * @returns A list of {@link UrlMapping} instances defining which models
      * should be rendered to which files.
      */
    def getUrls(project: ProjectReflection): js.Array[UrlMapping[Any]] = js.native
    
    /**
      * Renders the provided page to a string, which will be written to disk by the {@link Renderer}
      */
    def render(page: PageEvent[Reflection]): String = js.native
  }
}
