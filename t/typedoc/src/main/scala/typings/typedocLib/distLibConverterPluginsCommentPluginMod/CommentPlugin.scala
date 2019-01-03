package typings
package typedocLib.distLibConverterPluginsCommentPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins/CommentPlugin", "CommentPlugin")
@js.native
class CommentPlugin ()
  extends typedocLib.distLibConverterComponentsMod.ConverterComponent {
  var applyModifiers: js.Any = js.native
  var comments: js.Any = js.native
  var hidden: js.UndefOr[js.Any] = js.native
  var onBegin: js.Any = js.native
  var onBeginResolve: js.Any = js.native
  var onCreateTypeParameter: js.Any = js.native
  var onDeclaration: js.Any = js.native
  var onFunctionImplementation: js.Any = js.native
  var onResolve: js.Any = js.native
  var storeModuleComment: js.Any = js.native
}

@JSImport("typedoc/dist/lib/converter/plugins/CommentPlugin", "CommentPlugin")
@js.native
object CommentPlugin extends js.Object {
  def removeReflection(
    project: typedocLib.distLibModelsReflectionsMod.ProjectReflection,
    reflection: typedocLib.distLibModelsReflectionsMod.Reflection
  ): scala.Unit = js.native
  def removeReflection(
    project: typedocLib.distLibModelsReflectionsMod.ProjectReflection,
    reflection: typedocLib.distLibModelsReflectionsMod.Reflection,
    deletedIds: js.Array[scala.Double]
  ): scala.Unit = js.native
  def removeReflections(
    project: typedocLib.distLibModelsReflectionsMod.ProjectReflection,
    reflections: js.Array[typedocLib.distLibModelsReflectionsMod.Reflection]
  ): scala.Unit = js.native
  def removeTags(comment: js.UndefOr[scala.Nothing], tagName: java.lang.String): scala.Unit = js.native
  def removeTags(comment: typedocLib.distLibModelsCommentsMod.Comment, tagName: java.lang.String): scala.Unit = js.native
}

