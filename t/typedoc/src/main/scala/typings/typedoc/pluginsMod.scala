package typings.typedoc

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.commentsMod.Comment
import typings.typedoc.converterConverterMod.Converter
import typings.typedoc.modelsMod.Reflection
import typings.typedoc.reflectionCategoryMod.ReflectionCategory
import typings.typedoc.reflectionGroupMod.ReflectionGroup
import typings.typedoc.reflectionsMod.ProjectReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins", "CategoryPlugin")
  @js.native
  class CategoryPlugin protected ()
    extends typings.typedoc.categoryPluginMod.CategoryPlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
  /* static members */
  object CategoryPlugin {
    
    @JSImport("typedoc/dist/lib/converter/plugins", "CategoryPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins", "CategoryPlugin.WEIGHTS")
    @js.native
    def WEIGHTS: js.Array[String] = js.native
    @scala.inline
    def WEIGHTS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEIGHTS")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/plugins", "CategoryPlugin.defaultCategory")
    @js.native
    def defaultCategory: String = js.native
    @scala.inline
    def defaultCategory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultCategory")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/plugins", "CategoryPlugin.getCategory")
    @js.native
    def getCategory(reflection: Reflection): String = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins", "CategoryPlugin.getReflectionCategories")
    @js.native
    def getReflectionCategories(reflections: js.Array[Reflection]): js.Array[ReflectionCategory] = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins", "CategoryPlugin.sortCatCallback")
    @js.native
    def sortCatCallback(a: ReflectionCategory, b: ReflectionCategory): Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins", "CommentPlugin")
  @js.native
  class CommentPlugin protected ()
    extends typings.typedoc.commentPluginMod.CommentPlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
  /* static members */
  object CommentPlugin {
    
    @JSImport("typedoc/dist/lib/converter/plugins", "CommentPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins", "CommentPlugin.isHidden")
    @js.native
    def isHidden: js.Any = js.native
    @scala.inline
    def isHidden_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/plugins", "CommentPlugin.removeReflection")
    @js.native
    def removeReflection(project: ProjectReflection, reflection: typings.typedoc.reflectionsMod.Reflection): Unit = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins", "CommentPlugin.removeReflections")
    @js.native
    def removeReflections(project: ProjectReflection, reflections: js.Array[typings.typedoc.reflectionsMod.Reflection]): Unit = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins", "CommentPlugin.removeTags")
    @js.native
    def removeTags(comment: js.UndefOr[scala.Nothing], tagName: String): Unit = js.native
    @JSImport("typedoc/dist/lib/converter/plugins", "CommentPlugin.removeTags")
    @js.native
    def removeTags(comment: Comment, tagName: String): Unit = js.native
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins", "DecoratorPlugin")
  @js.native
  class DecoratorPlugin protected ()
    extends typings.typedoc.decoratorPluginMod.DecoratorPlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins", "DeepCommentPlugin")
  @js.native
  class DeepCommentPlugin protected ()
    extends typings.typedoc.deepCommentPluginMod.DeepCommentPlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins", "DynamicModulePlugin")
  @js.native
  class DynamicModulePlugin protected ()
    extends typings.typedoc.dynamicModulePluginMod.DynamicModulePlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins", "GitHubPlugin")
  @js.native
  class GitHubPlugin protected ()
    extends typings.typedoc.gitHubPluginMod.GitHubPlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin")
  @js.native
  class GroupPlugin protected ()
    extends typings.typedoc.groupPluginMod.GroupPlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
  /* static members */
  object GroupPlugin {
    
    @JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin.PLURALS")
    @js.native
    def PLURALS: js.Object = js.native
    @scala.inline
    def PLURALS_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLURALS")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin.SINGULARS")
    @js.native
    def SINGULARS: js.Object = js.native
    @scala.inline
    def SINGULARS_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SINGULARS")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin.WEIGHTS")
    @js.native
    def WEIGHTS: js.Array[ReflectionKind] = js.native
    @scala.inline
    def WEIGHTS_=(x: js.Array[ReflectionKind]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEIGHTS")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin.getKindPlural")
    @js.native
    def getKindPlural(kind: ReflectionKind): String = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin.getKindSingular")
    @js.native
    def getKindSingular(kind: ReflectionKind): String = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin.getKindString")
    @js.native
    def getKindString: js.Any = js.native
    @scala.inline
    def getKindString_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getKindString")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin.getReflectionGroups")
    @js.native
    def getReflectionGroups(reflections: js.Array[typings.typedoc.reflectionsMod.Reflection]): js.Array[ReflectionGroup] = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins", "GroupPlugin.sortCallback")
    @js.native
    def sortCallback(a: typings.typedoc.reflectionsMod.Reflection, b: typings.typedoc.reflectionsMod.Reflection): Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins", "ImplementsPlugin")
  @js.native
  class ImplementsPlugin protected ()
    extends typings.typedoc.implementsPluginMod.ImplementsPlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins", "PackagePlugin")
  @js.native
  class PackagePlugin protected ()
    extends typings.typedoc.packagePluginMod.PackagePlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins", "SourcePlugin")
  @js.native
  class SourcePlugin protected ()
    extends typings.typedoc.sourcePluginMod.SourcePlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
  
  @JSImport("typedoc/dist/lib/converter/plugins", "TypePlugin")
  @js.native
  class TypePlugin protected ()
    extends typings.typedoc.typePluginMod.TypePlugin {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
