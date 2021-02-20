package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.vueDocgenApi.anon.CommentIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDocblockMod {
  
  @JSImport("vue-docgen-api/dist/utils/getDocblock", JSImport.Default)
  @js.native
  def default(path: NodePath[_, _]): String | Null = js.native
  @JSImport("vue-docgen-api/dist/utils/getDocblock", JSImport.Default)
  @js.native
  def default(path: NodePath[_, _], hasCommentIndex: CommentIndex): String | Null = js.native
  
  @JSImport("vue-docgen-api/dist/utils/getDocblock", "parseDocblock")
  @js.native
  def parseDocblock(str: String): String = js.native
}
