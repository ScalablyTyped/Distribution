package typings
package tediousLib.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tedious", "RequestError")
@js.native
class RequestError ()
  extends nodeLib.Error {
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, code: java.lang.String) = this()
  var code: java.lang.String = js.native
  var message: java.lang.String = js.native
}

