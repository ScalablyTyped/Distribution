package typings.thrift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thrift", "MultiplexedProcessor")
@js.native
class MultiplexedProcessor () extends js.Object {
  def this(stream: js.Any) = this()
  def this(stream: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(stream: js.Any, options: js.Any) = this()
  
  def process(input: TProtocol, output: TProtocol): Unit = js.native
}
