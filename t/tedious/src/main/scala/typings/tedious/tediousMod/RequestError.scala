package typings.tedious.tediousMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tedious", "RequestError")
@js.native
class RequestError () extends Error {
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  var code: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

