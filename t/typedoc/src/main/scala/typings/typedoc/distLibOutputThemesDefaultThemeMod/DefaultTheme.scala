package typings.typedoc.distLibOutputThemesDefaultThemeMod

import typings.std.RegExp
import typings.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup
import typings.typedoc.distLibModelsReflectionsMod.ContainerReflection
import typings.typedoc.distLibModelsReflectionsMod.DeclarationReflection
import typings.typedoc.distLibModelsReflectionsMod.ProjectReflection
import typings.typedoc.distLibModelsReflectionsMod.Reflection
import typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
import typings.typedoc.distLibOutputModelsUrlMappingMod.UrlMapping
import typings.typedoc.distLibOutputRendererMod.Renderer
import typings.typedoc.distLibOutputThemeMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme")
@js.native
class DefaultTheme protected () extends Theme {
  def this(renderer: Renderer, basePath: String) = this()
  var onRendererBegin: js.Any = js.native
  def getEntryPoint(project: ProjectReflection): ContainerReflection = js.native
  def getNavigation(project: ProjectReflection): NavigationItem = js.native
  def getUrls(project: ProjectReflection): js.Array[UrlMapping] = js.native
}

/* static members */
@JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme")
@js.native
object DefaultTheme extends js.Object {
  var MAPPINGS: js.Array[TemplateMapping] = js.native
  var URL_PREFIX: RegExp = js.native
  def applyAnchorUrl(reflection: Reflection, container: Reflection): Unit = js.native
  def applyGroupClasses(group: ReflectionGroup): Unit = js.native
  def applyReflectionClasses(reflection: DeclarationReflection): Unit = js.native
  def buildUrls(reflection: DeclarationReflection, urls: js.Array[UrlMapping]): js.Array[UrlMapping] = js.native
  def getMapping(reflection: DeclarationReflection): js.UndefOr[TemplateMapping] = js.native
  def getUrl(reflection: Reflection): String = js.native
  def getUrl(reflection: Reflection, relative: Reflection): String = js.native
  def getUrl(reflection: Reflection, relative: Reflection, separator: String): String = js.native
  def toStyleClass(str: String): String = js.native
}

