package typings.typedoc

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.commentsMod.Comment
import typings.typedoc.modelsMod.Reflection
import typings.typedoc.reflectionCategoryMod.ReflectionCategory
import typings.typedoc.reflectionGroupMod.ReflectionGroup
import typings.typedoc.reflectionsMod.ProjectReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/plugins", JSImport.Namespace)
@js.native
object pluginsMod extends js.Object {
  
  @js.native
  class CategoryPlugin ()
    extends typings.typedoc.categoryPluginMod.CategoryPlugin
  /* static members */
  @js.native
  object CategoryPlugin extends js.Object {
    
    var WEIGHTS: js.Array[String] = js.native
    
    var defaultCategory: String = js.native
    
    def getCategory(reflection: Reflection): String = js.native
    
    def getReflectionCategories(reflections: js.Array[Reflection]): js.Array[ReflectionCategory] = js.native
    
    def sortCatCallback(a: ReflectionCategory, b: ReflectionCategory): Double = js.native
  }
  
  @js.native
  class CommentPlugin ()
    extends typings.typedoc.commentPluginMod.CommentPlugin
  /* static members */
  @js.native
  object CommentPlugin extends js.Object {
    
    var isHidden: js.Any = js.native
    
    def removeReflection(project: ProjectReflection, reflection: typings.typedoc.reflectionsMod.Reflection): Unit = js.native
    
    def removeReflections(project: ProjectReflection, reflections: js.Array[typings.typedoc.reflectionsMod.Reflection]): Unit = js.native
    
    def removeTags(comment: js.UndefOr[scala.Nothing], tagName: String): Unit = js.native
    def removeTags(comment: Comment, tagName: String): Unit = js.native
  }
  
  @js.native
  class DecoratorPlugin ()
    extends typings.typedoc.decoratorPluginMod.DecoratorPlugin
  
  @js.native
  class DeepCommentPlugin ()
    extends typings.typedoc.deepCommentPluginMod.DeepCommentPlugin
  
  @js.native
  class DynamicModulePlugin ()
    extends typings.typedoc.dynamicModulePluginMod.DynamicModulePlugin
  
  @js.native
  class GitHubPlugin ()
    extends typings.typedoc.gitHubPluginMod.GitHubPlugin
  
  @js.native
  class GroupPlugin ()
    extends typings.typedoc.groupPluginMod.GroupPlugin
  /* static members */
  @js.native
  object GroupPlugin extends js.Object {
    
    var WEIGHTS: js.Array[ReflectionKind] = js.native
    
    def getKindPlural(kind: ReflectionKind): String = js.native
    
    def getKindSingular(kind: ReflectionKind): String = js.native
    
    var getKindString: js.Any = js.native
    
    def getReflectionGroups(reflections: js.Array[typings.typedoc.reflectionsMod.Reflection]): js.Array[ReflectionGroup] = js.native
    
    def sortCallback(a: typings.typedoc.reflectionsMod.Reflection, b: typings.typedoc.reflectionsMod.Reflection): Double = js.native
  }
  
  @js.native
  class ImplementsPlugin ()
    extends typings.typedoc.implementsPluginMod.ImplementsPlugin
  
  @js.native
  class PackagePlugin ()
    extends typings.typedoc.packagePluginMod.PackagePlugin
  
  @js.native
  class SourcePlugin ()
    extends typings.typedoc.sourcePluginMod.SourcePlugin
  
  @js.native
  class TypePlugin ()
    extends typings.typedoc.typePluginMod.TypePlugin
}
