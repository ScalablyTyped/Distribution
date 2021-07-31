package typings.typedoc

import typings.typedoc.commentsMod.Comment
import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.converterConverterMod.Converter
import typings.typedoc.reflectionsMod.ProjectReflection
import typings.typedoc.reflectionsMod.Reflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @scala.inline
    def removeReflection(project: ProjectReflection, reflection: Reflection): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeReflection")(project.asInstanceOf[js.Any], reflection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def removeReflections(project: ProjectReflection, reflections: js.Array[Reflection]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeReflections")(project.asInstanceOf[js.Any], reflections.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def removeTags(comment: Unit, tagName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTags")(comment.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def removeTags(comment: Comment, tagName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTags")(comment.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
