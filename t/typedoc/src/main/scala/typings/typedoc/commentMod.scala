package typings.typedoc

import typings.typedoc.commentsMod.Comment
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentMod {
  
  @JSImport("typedoc/dist/lib/converter/factories/comment", "createComment")
  @js.native
  def createComment(node: Node): js.UndefOr[Comment] = js.native
  
  @JSImport("typedoc/dist/lib/converter/factories/comment", "getRawComment")
  @js.native
  def getRawComment(node: Node): js.UndefOr[String] = js.native
  
  @JSImport("typedoc/dist/lib/converter/factories/comment", "parseComment")
  @js.native
  def parseComment(text: String): Comment = js.native
  @JSImport("typedoc/dist/lib/converter/factories/comment", "parseComment")
  @js.native
  def parseComment(text: String, comment: Comment): Comment = js.native
}
