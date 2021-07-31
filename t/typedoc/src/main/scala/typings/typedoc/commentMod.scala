package typings.typedoc

import typings.typedoc.commentsMod.Comment
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentMod {
  
  @JSImport("typedoc/dist/lib/converter/factories/comment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createComment(node: Node): js.UndefOr[Comment] = ^.asInstanceOf[js.Dynamic].applyDynamic("createComment")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Comment]]
  
  @scala.inline
  def getRawComment(node: Node): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawComment")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def parseComment(text: String): Comment = ^.asInstanceOf[js.Dynamic].applyDynamic("parseComment")(text.asInstanceOf[js.Any]).asInstanceOf[Comment]
  @scala.inline
  def parseComment(text: String, comment: Comment): Comment = (^.asInstanceOf[js.Dynamic].applyDynamic("parseComment")(text.asInstanceOf[js.Any], comment.asInstanceOf[js.Any])).asInstanceOf[Comment]
}
