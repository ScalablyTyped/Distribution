package typings.typedoc

import typings.typedoc.distLibModelsCommentsMod.Comment
import typings.typescript.typescriptMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories/comment", JSImport.Namespace)
@js.native
object distLibConverterFactoriesCommentMod extends js.Object {
  def createComment(node: Node): js.UndefOr[Comment] = js.native
  def getRawComment(node: Node): js.UndefOr[String] = js.native
  def parseComment(text: String): Comment = js.native
  def parseComment(text: String, comment: Comment): Comment = js.native
}

