package typings
package typedocLib.distLibOutputThemeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/theme", "Theme")
@js.native
abstract class Theme protected ()
  extends typedocLib.distLibOutputComponentsMod.RendererComponent {
  def this(renderer: typedocLib.distLibOutputRendererMod.Renderer, basePath: java.lang.String) = this()
  var basePath: java.lang.String = js.native
  var resources: typedocLib.distLibOutputUtilsResourcesMod.Resources = js.native
  def getNavigation(project: typedocLib.distLibModelsReflectionsProjectMod.ProjectReflection): typedocLib.distLibOutputModelsNavigationItemMod.NavigationItem = js.native
  def getUrls(project: typedocLib.distLibModelsReflectionsProjectMod.ProjectReflection): js.Array[typedocLib.distLibOutputModelsUrlMappingMod.UrlMapping] = js.native
  def isOutputDirectory(path: java.lang.String): scala.Boolean = js.native
}

