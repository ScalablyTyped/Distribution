package typings
package typedocLib.distLibConverterPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins", "CommentPlugin")
@js.native
class CommentPlugin ()
  extends typedocLib.distLibConverterPluginsCommentPluginMod.CommentPlugin

@JSImport("typedoc/dist/lib/converter/plugins", "CommentPlugin")
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

