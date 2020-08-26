package typings.thrift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "TBinaryProtocol")
@js.native
class TBinaryProtocol protected () extends TProtocol {
  def this(trans: TTransport) = this()
  def this(trans: TTransport, strictRead: Boolean) = this()
  def this(trans: TTransport, strictRead: js.UndefOr[scala.Nothing], strictWrite: Boolean) = this()
  def this(trans: TTransport, strictRead: Boolean, strictWrite: Boolean) = this()
}

