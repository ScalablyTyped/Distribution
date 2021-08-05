package typings.typedoc

import typings.std.RegExp
import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.navigationItemMod.NavigationItem
import typings.typedoc.reflectionGroupMod.ReflectionGroup
import typings.typedoc.reflectionsMod.ContainerReflection
import typings.typedoc.reflectionsMod.DeclarationReflection
import typings.typedoc.reflectionsMod.ProjectReflection
import typings.typedoc.reflectionsMod.Reflection
import typings.typedoc.rendererMod.Renderer
import typings.typedoc.themeMod.Theme
import typings.typedoc.urlMappingMod.UrlMapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultThemeMod {
  
  @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme")
  @js.native
  class DefaultTheme protected () extends Theme {
    def this(renderer: Renderer, basePath: String) = this()
    
    def getEntryPoint(project: ProjectReflection): ContainerReflection = js.native
    
    def getNavigation(project: ProjectReflection): NavigationItem = js.native
    
    def getUrls(project: ProjectReflection): js.Array[UrlMapping] = js.native
    
    /* private */ var onRendererBegin: js.Any = js.native
  }
  /* static members */
  object DefaultTheme {
    
    @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme.MAPPINGS")
    @js.native
    def MAPPINGS: js.Array[TemplateMapping] = js.native
    inline def MAPPINGS_=(x: js.Array[TemplateMapping]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAPPINGS")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme.URL_PREFIX")
    @js.native
    def URL_PREFIX: RegExp = js.native
    inline def URL_PREFIX_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL_PREFIX")(x.asInstanceOf[js.Any])
    
    inline def applyAnchorUrl(reflection: Reflection, container: Reflection): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAnchorUrl")(reflection.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def applyGroupClasses(group: ReflectionGroup): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyGroupClasses")(group.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def applyReflectionClasses(reflection: DeclarationReflection): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyReflectionClasses")(reflection.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def buildUrls(reflection: DeclarationReflection, urls: js.Array[UrlMapping]): js.Array[UrlMapping] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildUrls")(reflection.asInstanceOf[js.Any], urls.asInstanceOf[js.Any])).asInstanceOf[js.Array[UrlMapping]]
    
    inline def getMapping(reflection: DeclarationReflection): js.UndefOr[TemplateMapping] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMapping")(reflection.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TemplateMapping]]
    
    inline def getUrl(reflection: Reflection): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getUrl(reflection: Reflection, relative: Unit, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any], relative.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getUrl(reflection: Reflection, relative: Reflection): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any], relative.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getUrl(reflection: Reflection, relative: Reflection, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any], relative.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toStyleClass(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toStyleClass")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "NavigationBuilder")
  @js.native
  class NavigationBuilder protected () extends StObject {
    def this(project: ProjectReflection, entryPoint: ContainerReflection) = this()
    
    def build(hasSeparateGlobals: Boolean): NavigationItem = js.native
    
    /* protected */ def buildChildren(reflection: DeclarationReflection, parent: NavigationItem): Unit = js.native
    
    /* protected */ def buildGroups(reflections: js.Array[DeclarationReflection], parent: NavigationItem): Unit = js.native
    /* protected */ def buildGroups(reflections: js.Array[DeclarationReflection], parent: NavigationItem, buildChildren: Boolean): Unit = js.native
    
    /* protected */ def containsExternals(modules: js.Array[DeclarationReflection]): Boolean = js.native
    
    /* private */ var entryPoint: js.Any = js.native
    
    /* protected */ def includeDedicatedUrls(reflection: DeclarationReflection, item: NavigationItem): Unit = js.native
    
    /* private */ var project: js.Any = js.native
    
    /* protected */ def sortReflections(modules: js.Array[DeclarationReflection]): Unit = js.native
  }
  
  trait TemplateMapping extends StObject {
    
    var directory: String
    
    var isLeaf: Boolean
    
    var kind: js.Array[ReflectionKind]
    
    var template: String
  }
  object TemplateMapping {
    
    inline def apply(directory: String, isLeaf: Boolean, kind: js.Array[ReflectionKind], template: String): TemplateMapping = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateMapping]
    }
    
    extension [Self <: TemplateMapping](x: Self) {
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setKind(value: js.Array[ReflectionKind]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindVarargs(value: ReflectionKind*): Self = StObject.set(x, "kind", js.Array(value :_*))
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
}
