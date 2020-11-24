package typings.typedoc

import typings.typedoc.commentsMod.Comment
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/factories/comment", JSImport.Namespace)
@js.native
object commentMod extends js.Object {
  
  def createComment(node: Node): js.UndefOr[Comment] = js.native
  
  def getRawComment(node: Node): js.UndefOr[String] = js.native
  
  def parseComment(text: String): Comment = js.native
  def parseComment(text: String, comment: Comment): Comment = js.native
}
