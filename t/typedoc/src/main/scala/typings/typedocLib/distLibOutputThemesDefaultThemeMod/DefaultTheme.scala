package typings
package typedocLib.distLibOutputThemesDefaultThemeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme")
@js.native
class DefaultTheme protected ()
  extends typedocLib.distLibOutputThemeMod.Theme {
  def this(renderer: typedocLib.distLibOutputRendererMod.Renderer, basePath: java.lang.String) = this()
  var onRendererBegin: js.Any = js.native
  def getEntryPoint(project: typedocLib.distLibModelsReflectionsMod.ProjectReflection): typedocLib.distLibModelsReflectionsMod.ContainerReflection = js.native
  def getNavigation(project: typedocLib.distLibModelsReflectionsMod.ProjectReflection): typedocLib.distLibOutputModelsNavigationItemMod.NavigationItem = js.native
  def getUrls(project: typedocLib.distLibModelsReflectionsMod.ProjectReflection): js.Array[typedocLib.distLibOutputModelsUrlMappingMod.UrlMapping] = js.native
}

/* static members */
@JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme")
@js.native
object DefaultTheme extends js.Object {
  var MAPPINGS: js.Array[typedocLib.distLibOutputThemesDefaultThemeMod.TemplateMapping] = js.native
  var URL_PREFIX: stdLib.RegExp = js.native
  def applyAnchorUrl(
    reflection: typedocLib.distLibModelsReflectionsMod.Reflection,
    container: typedocLib.distLibModelsReflectionsMod.Reflection
  ): scala.Unit = js.native
  def applyGroupClasses(group: typedocLib.distLibModelsReflectionGroupMod.ReflectionGroup): scala.Unit = js.native
  def applyReflectionClasses(reflection: typedocLib.distLibModelsReflectionsMod.DeclarationReflection): scala.Unit = js.native
  def buildUrls(
    reflection: typedocLib.distLibModelsReflectionsMod.DeclarationReflection,
    urls: js.Array[typedocLib.distLibOutputModelsUrlMappingMod.UrlMapping]
  ): js.Array[typedocLib.distLibOutputModelsUrlMappingMod.UrlMapping] = js.native
  def getMapping(reflection: typedocLib.distLibModelsReflectionsMod.DeclarationReflection): js.UndefOr[typedocLib.distLibOutputThemesDefaultThemeMod.TemplateMapping] = js.native
  def getUrl(reflection: typedocLib.distLibModelsReflectionsMod.Reflection): java.lang.String = js.native
  def getUrl(
    reflection: typedocLib.distLibModelsReflectionsMod.Reflection,
    relative: typedocLib.distLibModelsReflectionsMod.Reflection
  ): java.lang.String = js.native
  def getUrl(
    reflection: typedocLib.distLibModelsReflectionsMod.Reflection,
    relative: typedocLib.distLibModelsReflectionsMod.Reflection,
    separator: java.lang.String
  ): java.lang.String = js.native
  def toStyleClass(str: java.lang.String): java.lang.String = js.native
}

