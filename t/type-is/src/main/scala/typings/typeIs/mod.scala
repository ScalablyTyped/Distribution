package typings.typeIs

import typings.node.httpMod.IncomingMessage
import typings.typeIs.typeIsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("type-is", JSImport.Namespace)
  @js.native
  def apply(request: IncomingMessage, types: String*): String | `false` | Null = js.native
  @JSImport("type-is", JSImport.Namespace)
  @js.native
  def apply(request: IncomingMessage, types: js.Array[String]): String | `false` | Null = js.native
  
  @JSImport("type-is", "hasBody")
  @js.native
  def hasBody(request: IncomingMessage): Boolean = js.native
  
  @JSImport("type-is", "is")
  @js.native
  def is(mediaType: String, types: String*): String | `false` = js.native
  @JSImport("type-is", "is")
  @js.native
  def is(mediaType: String, types: js.Array[String]): String | `false` = js.native
  
  @JSImport("type-is", "mimeMatch")
  @js.native
  def mimeMatch(expected: String, actual: String): Boolean = js.native
  @JSImport("type-is", "mimeMatch")
  @js.native
  def mimeMatch_false(expected: `false`, actual: String): Boolean = js.native
  
  @JSImport("type-is", "normalize")
  @js.native
  def normalize(`type`: String): String | `false` = js.native
}
