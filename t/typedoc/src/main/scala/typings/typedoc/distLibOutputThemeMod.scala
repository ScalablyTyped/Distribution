package typings.typedoc

import typings.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
import typings.typedoc.distLibOutputComponentsMod.RendererComponent
import typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
import typings.typedoc.distLibOutputModelsUrlMappingMod.UrlMapping
import typings.typedoc.distLibOutputRendererMod.Renderer
import typings.typedoc.distLibOutputUtilsResourcesMod.Resources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/theme", JSImport.Namespace)
@js.native
object distLibOutputThemeMod extends js.Object {
  @js.native
  abstract class Theme protected () extends RendererComponent {
    def this(renderer: Renderer, basePath: String) = this()
    var basePath: String = js.native
    var resources: Resources = js.native
    def getNavigation(project: ProjectReflection): NavigationItem = js.native
    def getUrls(project: ProjectReflection): js.Array[UrlMapping] = js.native
    def isOutputDirectory(path: String): Boolean = js.native
  }
  
}

