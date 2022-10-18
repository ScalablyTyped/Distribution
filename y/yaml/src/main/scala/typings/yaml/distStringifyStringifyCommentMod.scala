package typings.yaml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStringifyStringifyCommentMod {
  
  @JSImport("yaml/dist/stringify/stringifyComment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def indentComment(comment: String, indent: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indentComment")(comment.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def lineComment(str: String, indent: String, comment: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lineComment")(str.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], comment.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringifyComment(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyComment")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
