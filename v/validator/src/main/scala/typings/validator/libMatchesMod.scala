package typings.validator

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/matches", JSImport.Namespace)
@js.native
object libMatchesMod extends js.Object {
  def default(str: String, pattern: String): Boolean = js.native
  def default(str: String, pattern: String, modifiers: String): Boolean = js.native
  def default(str: String, pattern: RegExp): Boolean = js.native
}

