package typings.typeIs

import typings.node.httpMod.IncomingMessage
import typings.typeIs.typeIsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("type-is", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(request: IncomingMessage, types: String*): String | `false` | Null = js.native
  def apply(request: IncomingMessage, types: js.Array[String]): String | `false` | Null = js.native
  
  def hasBody(request: IncomingMessage): Boolean = js.native
  
  def is(mediaType: String, types: String*): String | `false` = js.native
  def is(mediaType: String, types: js.Array[String]): String | `false` = js.native
  
  def mimeMatch(expected: String, actual: String): Boolean = js.native
  @JSName("mimeMatch")
  def mimeMatch_false(expected: `false`, actual: String): Boolean = js.native
  
  def normalize(`type`: String): String | `false` = js.native
}
