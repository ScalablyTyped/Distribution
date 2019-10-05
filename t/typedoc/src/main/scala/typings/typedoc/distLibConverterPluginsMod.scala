package typings.typedoc

import typings.typedoc.distLibModelsCommentsMod.Comment
import typings.typedoc.distLibModelsMod.Reflection
import typings.typedoc.distLibModelsReflectionCategoryMod.ReflectionCategory
import typings.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup
import typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind
import typings.typedoc.distLibModelsReflectionsMod.ProjectReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins", JSImport.Namespace)
@js.native
object distLibConverterPluginsMod extends js.Object {
  @js.native
  class CategoryPlugin ()
    extends typings.typedoc.distLibConverterPluginsCategoryPluginMod.CategoryPlugin
  
  @js.native
  class CommentPlugin ()
    extends typings.typedoc.distLibConverterPluginsCommentPluginMod.CommentPlugin
  
  @js.native
  class DecoratorPlugin ()
    extends typings.typedoc.distLibConverterPluginsDecoratorPluginMod.DecoratorPlugin
  
  @js.native
  class DeepCommentPlugin ()
    extends typings.typedoc.distLibConverterPluginsDeepCommentPluginMod.DeepCommentPlugin
  
  @js.native
  class DynamicModulePlugin ()
    extends typings.typedoc.distLibConverterPluginsDynamicModulePluginMod.DynamicModulePlugin
  
  @js.native
  class GitHubPlugin ()
    extends typings.typedoc.distLibConverterPluginsGitHubPluginMod.GitHubPlugin
  
  @js.native
  class GroupPlugin ()
    extends typings.typedoc.distLibConverterPluginsGroupPluginMod.GroupPlugin
  
  @js.native
  class ImplementsPlugin ()
    extends typings.typedoc.distLibConverterPluginsImplementsPluginMod.ImplementsPlugin
  
  @js.native
  class PackagePlugin ()
    extends typings.typedoc.distLibConverterPluginsPackagePluginMod.PackagePlugin
  
  @js.native
  class SourcePlugin ()
    extends typings.typedoc.distLibConverterPluginsSourcePluginMod.SourcePlugin
  
  @js.native
  class TypePlugin ()
    extends typings.typedoc.distLibConverterPluginsTypePluginMod.TypePlugin
  
  /* static members */
  @js.native
  object CategoryPlugin extends js.Object {
    var WEIGHTS: js.Array[String] = js.native
    var defaultCategory: String = js.native
    def getCategory(reflection: Reflection): String = js.native
    def getReflectionCategories(reflections: js.Array[Reflection]): js.Array[ReflectionCategory] = js.native
    def sortCatCallback(a: ReflectionCategory, b: ReflectionCategory): Double = js.native
  }
  
  /* static members */
  @js.native
  object CommentPlugin extends js.Object {
    def removeReflection(project: ProjectReflection, reflection: typings.typedoc.distLibModelsReflectionsMod.Reflection): Unit = js.native
    def removeReflection(
      project: ProjectReflection,
      reflection: typings.typedoc.distLibModelsReflectionsMod.Reflection,
      deletedIds: js.Array[Double]
    ): Unit = js.native
    def removeReflections(
      project: ProjectReflection,
      reflections: js.Array[typings.typedoc.distLibModelsReflectionsMod.Reflection]
    ): Unit = js.native
    def removeTags(comment: js.UndefOr[scala.Nothing], tagName: String): Unit = js.native
    def removeTags(comment: Comment, tagName: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object GroupPlugin extends js.Object {
    var WEIGHTS: js.Array[ReflectionKind] = js.native
    var getKindString: js.Any = js.native
    def getKindPlural(kind: ReflectionKind): String = js.native
    def getKindSingular(kind: ReflectionKind): String = js.native
    def getReflectionGroups(reflections: js.Array[typings.typedoc.distLibModelsReflectionsMod.Reflection]): js.Array[ReflectionGroup] = js.native
    def sortCallback(
      a: typings.typedoc.distLibModelsReflectionsMod.Reflection,
      b: typings.typedoc.distLibModelsReflectionsMod.Reflection
    ): Double = js.native
  }
  
}

