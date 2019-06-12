package typings
package typeDashIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("type-is", JSImport.Namespace)
@js.native
object typeDashIsMod extends js.Object {
  def apply(request: nodeLib.httpMod.IncomingMessage, types: java.lang.String*): java.lang.String | typeDashIsLib.typeDashIsLibNumbers.`false` | scala.Null = js.native
  def apply(request: nodeLib.httpMod.IncomingMessage, types: js.Array[java.lang.String]): java.lang.String | typeDashIsLib.typeDashIsLibNumbers.`false` | scala.Null = js.native
  def hasBody(request: nodeLib.httpMod.IncomingMessage): scala.Boolean = js.native
  def is(mediaType: java.lang.String, types: java.lang.String*): java.lang.String | typeDashIsLib.typeDashIsLibNumbers.`false` = js.native
  def is(mediaType: java.lang.String, types: js.Array[java.lang.String]): java.lang.String | typeDashIsLib.typeDashIsLibNumbers.`false` = js.native
  def mimeMatch(expected: java.lang.String, actual: java.lang.String): scala.Boolean = js.native
  @JSName("mimeMatch")
  def mimeMatch_false(expected: typeDashIsLib.typeDashIsLibNumbers.`false`, actual: java.lang.String): scala.Boolean = js.native
  def normalize(`type`: java.lang.String): java.lang.String | typeDashIsLib.typeDashIsLibNumbers.`false` = js.native
}

