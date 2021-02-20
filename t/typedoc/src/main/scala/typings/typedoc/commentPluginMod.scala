package typings.typedoc

import typings.typedoc.commentsMod.Comment
import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.converterConverterMod.Converter
import typings.typedoc.reflectionsMod.ProjectReflection
import typings.typedoc.reflectionsMod.Reflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentPluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/CommentPlugin", "CommentPlugin")
  @js.native
  class CommentPlugin protected () extends ConverterComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    var applyModifiers: js.Any = js.native
    
    var comments: js.Any = js.native
    
    var excludeTags: js.Array[String] = js.native
    
    var onBegin: js.Any = js.native
    
    var onBeginResolve: js.Any = js.native
    
    var onCreateTypeParameter: js.Any = js.native
    
    var onDeclaration: js.Any = js.native
    
    var onFunctionImplementation: js.Any = js.native
    
    var onResolve: js.Any = js.native
    
    var removeExcludedTags: js.Any = js.native
    
    var storeModuleComment: js.Any = js.native
  }
  /* static members */
  object CommentPlugin {
    
    @JSImport("typedoc/dist/lib/converter/plugins/CommentPlugin", "CommentPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins/CommentPlugin", "CommentPlugin.isHidden")
    @js.native
    def isHidden: js.Any = js.native
    @scala.inline
    def isHidden_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/plugins/CommentPlugin", "CommentPlugin.removeReflection")
    @js.native
    def removeReflection(project: ProjectReflection, reflection: Reflection): Unit = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins/CommentPlugin", "CommentPlugin.removeReflections")
    @js.native
    def removeReflections(project: ProjectReflection, reflections: js.Array[Reflection]): Unit = js.native
    
    @JSImport("typedoc/dist/lib/converter/plugins/CommentPlugin", "CommentPlugin.removeTags")
    @js.native
    def removeTags(comment: js.UndefOr[scala.Nothing], tagName: String): Unit = js.native
    @JSImport("typedoc/dist/lib/converter/plugins/CommentPlugin", "CommentPlugin.removeTags")
    @js.native
    def removeTags(comment: Comment, tagName: String): Unit = js.native
  }
}
