package typings.typedoc.mod

import typings.std.RegExp
import typings.typedoc.defaultThemeMod.TemplateMapping
import typings.typedoc.reflectionGroupMod.ReflectionGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  inline def MAPPINGS_=(x: js.Array[TemplateMapping]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAPPINGS")(x.asInstanceOf[js.Any])
  
  @JSImport("typedoc", "DefaultTheme.URL_PREFIX")
  @js.native
  def URL_PREFIX: RegExp = js.native
  inline def URL_PREFIX_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL_PREFIX")(x.asInstanceOf[js.Any])
  
  inline def applyAnchorUrl(
    reflection: typings.typedoc.reflectionsMod.Reflection,
    container: typings.typedoc.reflectionsMod.Reflection
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAnchorUrl")(reflection.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def applyGroupClasses(group: ReflectionGroup): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyGroupClasses")(group.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def applyReflectionClasses(reflection: typings.typedoc.reflectionsMod.DeclarationReflection): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyReflectionClasses")(reflection.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def buildUrls(
    reflection: typings.typedoc.reflectionsMod.DeclarationReflection,
    urls: js.Array[typings.typedoc.urlMappingMod.UrlMapping]
  ): js.Array[typings.typedoc.urlMappingMod.UrlMapping] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildUrls")(reflection.asInstanceOf[js.Any], urls.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typedoc.urlMappingMod.UrlMapping]]
  
  inline def getMapping(reflection: typings.typedoc.reflectionsMod.DeclarationReflection): js.UndefOr[TemplateMapping] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMapping")(reflection.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TemplateMapping]]
  
  inline def getUrl(reflection: typings.typedoc.reflectionsMod.Reflection): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getUrl(reflection: typings.typedoc.reflectionsMod.Reflection, relative: Unit, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any], relative.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getUrl(
    reflection: typings.typedoc.reflectionsMod.Reflection,
    relative: typings.typedoc.reflectionsMod.Reflection
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any], relative.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getUrl(
    reflection: typings.typedoc.reflectionsMod.Reflection,
    relative: typings.typedoc.reflectionsMod.Reflection,
    separator: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any], relative.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toStyleClass(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toStyleClass")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
