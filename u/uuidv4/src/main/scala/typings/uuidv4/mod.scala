package typings.uuidv4

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuidv4", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def empty(): String = js.native
  def fromString(text: String): String = js.native
  def isUuid(value: String): Boolean = js.native
  def uuid(): String = js.native
  @js.native
  object regex extends js.Object {
    var v4: RegExp = js.native
    var v5: RegExp = js.native
  }
  
}

