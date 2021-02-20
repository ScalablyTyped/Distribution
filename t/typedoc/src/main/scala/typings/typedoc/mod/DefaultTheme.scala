package typings.typedoc.mod

import typings.std.RegExp
import typings.typedoc.defaultThemeMod.TemplateMapping
import typings.typedoc.reflectionGroupMod.ReflectionGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "DefaultTheme")
@js.native
class DefaultTheme protected ()
  extends typings.typedoc.defaultThemeMod.DefaultTheme {
  def this(renderer: typings.typedoc.rendererMod.Renderer, basePath: String) = this()
}
/* static members */
object DefaultTheme {
  
  @JSImport("typedoc", "DefaultTheme")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc", "DefaultTheme.MAPPINGS")
  @js.native
  def MAPPINGS: js.Array[TemplateMapping] = js.native
  @scala.inline
  def MAPPINGS_=(x: js.Array[TemplateMapping]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAPPINGS")(x.asInstanceOf[js.Any])
  
  @JSImport("typedoc", "DefaultTheme.URL_PREFIX")
  @js.native
  def URL_PREFIX: RegExp = js.native
  @scala.inline
  def URL_PREFIX_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL_PREFIX")(x.asInstanceOf[js.Any])
  
  @JSImport("typedoc", "DefaultTheme.applyAnchorUrl")
  @js.native
  def applyAnchorUrl(
    reflection: typings.typedoc.reflectionsMod.Reflection,
    container: typings.typedoc.reflectionsMod.Reflection
  ): Unit = js.native
  
  @JSImport("typedoc", "DefaultTheme.applyGroupClasses")
  @js.native
  def applyGroupClasses(group: ReflectionGroup): Unit = js.native
  
  @JSImport("typedoc", "DefaultTheme.applyReflectionClasses")
  @js.native
  def applyReflectionClasses(reflection: typings.typedoc.reflectionsMod.DeclarationReflection): Unit = js.native
  
  @JSImport("typedoc", "DefaultTheme.buildUrls")
  @js.native
  def buildUrls(
    reflection: typings.typedoc.reflectionsMod.DeclarationReflection,
    urls: js.Array[typings.typedoc.urlMappingMod.UrlMapping]
  ): js.Array[typings.typedoc.urlMappingMod.UrlMapping] = js.native
  
  @JSImport("typedoc", "DefaultTheme.getMapping")
  @js.native
  def getMapping(reflection: typings.typedoc.reflectionsMod.DeclarationReflection): js.UndefOr[TemplateMapping] = js.native
  
  @JSImport("typedoc", "DefaultTheme.getUrl")
  @js.native
  def getUrl(reflection: typings.typedoc.reflectionsMod.Reflection): String = js.native
  @JSImport("typedoc", "DefaultTheme.getUrl")
  @js.native
  def getUrl(
    reflection: typings.typedoc.reflectionsMod.Reflection,
    relative: js.UndefOr[scala.Nothing],
    separator: String
  ): String = js.native
  @JSImport("typedoc", "DefaultTheme.getUrl")
  @js.native
  def getUrl(
    reflection: typings.typedoc.reflectionsMod.Reflection,
    relative: typings.typedoc.reflectionsMod.Reflection
  ): String = js.native
  @JSImport("typedoc", "DefaultTheme.getUrl")
  @js.native
  def getUrl(
    reflection: typings.typedoc.reflectionsMod.Reflection,
    relative: typings.typedoc.reflectionsMod.Reflection,
    separator: String
  ): String = js.native
  
  @JSImport("typedoc", "DefaultTheme.toStyleClass")
  @js.native
  def toStyleClass(str: String): String = js.native
}
