package typings.typedoc.mod

import typings.std.RegExp
import typings.typedoc.defaultThemeMod.TemplateMapping
import typings.typedoc.reflectionGroupMod.ReflectionGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "DefaultTheme")
@js.native
class DefaultTheme protected ()
  extends typings.typedoc.defaultThemeMod.DefaultTheme {
  def this(renderer: typings.typedoc.rendererMod.Renderer, basePath: String) = this()
}

/* static members */
@JSImport("typedoc", "DefaultTheme")
@js.native
object DefaultTheme extends js.Object {
  var MAPPINGS: js.Array[TemplateMapping] = js.native
  var URL_PREFIX: RegExp = js.native
  def applyAnchorUrl(
    reflection: typings.typedoc.reflectionsMod.Reflection,
    container: typings.typedoc.reflectionsMod.Reflection
  ): Unit = js.native
  def applyGroupClasses(group: ReflectionGroup): Unit = js.native
  def applyReflectionClasses(reflection: typings.typedoc.reflectionsMod.DeclarationReflection): Unit = js.native
  def buildUrls(
    reflection: typings.typedoc.reflectionsMod.DeclarationReflection,
    urls: js.Array[typings.typedoc.urlMappingMod.UrlMapping]
  ): js.Array[typings.typedoc.urlMappingMod.UrlMapping] = js.native
  def getMapping(reflection: typings.typedoc.reflectionsMod.DeclarationReflection): js.UndefOr[TemplateMapping] = js.native
  def getUrl(reflection: typings.typedoc.reflectionsMod.Reflection): String = js.native
  def getUrl(
    reflection: typings.typedoc.reflectionsMod.Reflection,
    relative: js.UndefOr[scala.Nothing],
    separator: String
  ): String = js.native
  def getUrl(
    reflection: typings.typedoc.reflectionsMod.Reflection,
    relative: typings.typedoc.reflectionsMod.Reflection
  ): String = js.native
  def getUrl(
    reflection: typings.typedoc.reflectionsMod.Reflection,
    relative: typings.typedoc.reflectionsMod.Reflection,
    separator: String
  ): String = js.native
  def toStyleClass(str: String): String = js.native
}

