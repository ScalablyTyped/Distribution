package typings.typeIs

import typings.node.httpMod.IncomingMessage
import typings.typeIs.typeIsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(request: IncomingMessage, types: String*): String | `false` | Null = ^.asInstanceOf[js.Dynamic].apply(List(request.asInstanceOf[js.Any]).`++`(types.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String | `false` | Null]
  inline def apply(request: IncomingMessage, types: js.Array[String]): String | `false` | Null = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[String | `false` | Null]
  
  @JSImport("type-is", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasBody(request: IncomingMessage): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasBody")(request.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def is(mediaType: String, types: String*): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(List(mediaType.asInstanceOf[js.Any]).`++`(types.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String | `false`]
  inline def is(mediaType: String, types: js.Array[String]): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(mediaType.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  
  inline def mimeMatch(expected: String, actual: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeMatch")(expected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def mimeMatch_false(expected: `false`, actual: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("mimeMatch")(expected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def normalize(`type`: String): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(`type`.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
}
