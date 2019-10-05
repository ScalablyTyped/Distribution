package typings.thrift.thriftMod.Thrift

import typings.thrift.thriftMod.TProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "Thrift.TApplicationException")
@js.native
class TApplicationException () extends TException {
  def this(`type`: TApplicationExceptionType) = this()
  def this(`type`: TApplicationExceptionType, message: String) = this()
  var code: Double = js.native
  def getCode(): Double = js.native
  def read(input: TProtocol): Unit = js.native
  def write(output: TProtocol): Unit = js.native
}

