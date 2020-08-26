package typings.thrift.mod.Thrift

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "Thrift.TProtocolException")
@js.native
class TProtocolException protected () extends Error {
  def this(`type`: TProtocolExceptionType, message: String) = this()
  var `type`: TProtocolExceptionType = js.native
}

