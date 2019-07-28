package typings.typedoc.distLibConverterPluginsMod

import typings.typedoc.distLibModelsCommentsMod.Comment
import typings.typedoc.distLibModelsReflectionsMod.ProjectReflection
import typings.typedoc.distLibModelsReflectionsMod.Reflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins", "CommentPlugin")
@js.native
class CommentPlugin ()
  extends typings.typedoc.distLibConverterPluginsCommentPluginMod.CommentPlugin

/* static members */
@JSImport("typedoc/dist/lib/converter/plugins", "CommentPlugin")
@js.native
object CommentPlugin extends js.Object {
  def removeReflection(project: ProjectReflection, reflection: Reflection): Unit = js.native
  def removeReflection(project: ProjectReflection, reflection: Reflection, deletedIds: js.Array[Double]): Unit = js.native
  def removeReflections(project: ProjectReflection, reflections: js.Array[Reflection]): Unit = js.native
  def removeTags(comment: js.UndefOr[scala.Nothing], tagName: String): Unit = js.native
  def removeTags(comment: Comment, tagName: String): Unit = js.native
}

