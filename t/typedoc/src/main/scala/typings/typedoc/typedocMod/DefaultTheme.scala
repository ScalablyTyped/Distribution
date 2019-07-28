package typings.typedoc.typedocMod

import typings.std.RegExp
import typings.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup
import typings.typedoc.distLibOutputThemesDefaultThemeMod.TemplateMapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "DefaultTheme")
@js.native
class DefaultTheme protected ()
  extends typings.typedoc.distLibOutputThemesDefaultThemeMod.DefaultTheme {
  def this(renderer: typings.typedoc.distLibOutputRendererMod.Renderer, basePath: String) = this()
}

/* static members */
@JSImport("typedoc", "DefaultTheme")
@js.native
object DefaultTheme extends js.Object {
  var MAPPINGS: js.Array[TemplateMapping] = js.native
  var URL_PREFIX: RegExp = js.native
  def applyAnchorUrl(
    reflection: typings.typedoc.distLibModelsReflectionsMod.Reflection,
    container: typings.typedoc.distLibModelsReflectionsMod.Reflection
  ): Unit = js.native
  def applyGroupClasses(group: ReflectionGroup): Unit = js.native
  def applyReflectionClasses(reflection: typings.typedoc.distLibModelsReflectionsMod.DeclarationReflection): Unit = js.native
  def buildUrls(
    reflection: typings.typedoc.distLibModelsReflectionsMod.DeclarationReflection,
    urls: js.Array[typings.typedoc.distLibOutputModelsUrlMappingMod.UrlMapping]
  ): js.Array[typings.typedoc.distLibOutputModelsUrlMappingMod.UrlMapping] = js.native
  def getMapping(reflection: typings.typedoc.distLibModelsReflectionsMod.DeclarationReflection): js.UndefOr[TemplateMapping] = js.native
  def getUrl(reflection: typings.typedoc.distLibModelsReflectionsMod.Reflection): String = js.native
  def getUrl(
    reflection: typings.typedoc.distLibModelsReflectionsMod.Reflection,
    relative: typings.typedoc.distLibModelsReflectionsMod.Reflection
  ): String = js.native
  def getUrl(
    reflection: typings.typedoc.distLibModelsReflectionsMod.Reflection,
    relative: typings.typedoc.distLibModelsReflectionsMod.Reflection,
    separator: String
  ): String = js.native
  def toStyleClass(str: String): String = js.native
}

