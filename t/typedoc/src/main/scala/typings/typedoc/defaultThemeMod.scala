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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultThemeMod {
  
  @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme")
  @js.native
  class DefaultTheme protected () extends Theme {
    def this(renderer: Renderer, basePath: String) = this()
    
    def getEntryPoint(project: ProjectReflection): ContainerReflection = js.native
    
    def getNavigation(project: ProjectReflection): NavigationItem = js.native
    
    def getUrls(project: ProjectReflection): js.Array[UrlMapping] = js.native
    
    var onRendererBegin: js.Any = js.native
  }
  /* static members */
  object DefaultTheme {
    
    @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme.MAPPINGS")
    @js.native
    def MAPPINGS: js.Array[TemplateMapping] = js.native
    @scala.inline
    def MAPPINGS_=(x: js.Array[TemplateMapping]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAPPINGS")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme.URL_PREFIX")
    @js.native
    def URL_PREFIX: RegExp = js.native
    @scala.inline
    def URL_PREFIX_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL_PREFIX")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme.applyAnchorUrl")
    @js.native
    def applyAnchorUrl(reflection: Reflection, container: Reflection): Unit = js.native
    
    @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme.applyGroupClasses")
    @js.native
    def applyGroupClasses(group: ReflectionGroup): Unit = js.native
    
    @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme.applyReflectionClasses")
    @js.native
    def applyReflectionClasses(reflection: DeclarationReflection): Unit = js.native
    
    @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme.buildUrls")
    @js.native
    def buildUrls(reflection: DeclarationReflection, urls: js.Array[UrlMapping]): js.Array[UrlMapping] = js.native
    
    @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme.getMapping")
    @js.native
    def getMapping(reflection: DeclarationReflection): js.UndefOr[TemplateMapping] = js.native
    
    @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme.getUrl")
    @js.native
    def getUrl(reflection: Reflection): String = js.native
    @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme.getUrl")
    @js.native
    def getUrl(reflection: Reflection, relative: js.UndefOr[scala.Nothing], separator: String): String = js.native
    @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme.getUrl")
    @js.native
    def getUrl(reflection: Reflection, relative: Reflection): String = js.native
    @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme.getUrl")
    @js.native
    def getUrl(reflection: Reflection, relative: Reflection, separator: String): String = js.native
    
    @JSImport("typedoc/dist/lib/output/themes/DefaultTheme", "DefaultTheme.toStyleClass")
    @js.native
    def toStyleClass(str: String): String = js.native
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
    
    var entryPoint: js.Any = js.native
    
    /* protected */ def includeDedicatedUrls(reflection: DeclarationReflection, item: NavigationItem): Unit = js.native
    
    var project: js.Any = js.native
    
    /* protected */ def sortReflections(modules: js.Array[DeclarationReflection]): Unit = js.native
  }
  
  @js.native
  trait TemplateMapping extends StObject {
    
    var directory: String = js.native
    
    var isLeaf: Boolean = js.native
    
    var kind: js.Array[ReflectionKind] = js.native
    
    var template: String = js.native
  }
  object TemplateMapping {
    
    @scala.inline
    def apply(directory: String, isLeaf: Boolean, kind: js.Array[ReflectionKind], template: String): TemplateMapping = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateMapping]
    }
    
    @scala.inline
    implicit class TemplateMappingMutableBuilder[Self <: TemplateMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: js.Array[ReflectionKind]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindVarargs(value: ReflectionKind*): Self = StObject.set(x, "kind", js.Array(value :_*))
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
}
