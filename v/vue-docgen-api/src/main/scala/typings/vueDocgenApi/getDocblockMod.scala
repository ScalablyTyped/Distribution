package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.vueDocgenApi.anon.CommentIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDocblockMod {
  
  @JSImport("vue-docgen-api/dist/utils/getDocblock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(path: NodePath[js.Any, js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  @scala.inline
  def default(path: NodePath[js.Any, js.Any], hasCommentIndex: CommentIndex): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], hasCommentIndex.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @scala.inline
  def parseDocblock(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDocblock")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
