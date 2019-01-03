package typings
package typedocLib.typedocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "DefaultTheme")
@js.native
class DefaultTheme protected ()
  extends typedocLib.distLibOutputThemesDefaultThemeMod.DefaultTheme {
  def this(renderer: typedocLib.distLibOutputRendererMod.Renderer, basePath: java.lang.String) = this()
}

@JSImport("typedoc", "DefaultTheme")
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

