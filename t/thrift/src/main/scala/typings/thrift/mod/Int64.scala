package typings.thrift.mod

import typings.node.Buffer
import typings.nodeInt64.mod.^
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thrift", "Int64")
@js.native
class Int64 protected () extends ^ {
  def this(array: Uint8Array) = this()
  def this(buffer: Buffer) = this()
  def this(num: Double) = this()
  def this(str: String) = this()
  def this(array: Uint8Array, offset: Double) = this()
  def this(buffer: Buffer, offset: Double) = this()
  def this(hi: Double, lo: Double) = this()
}
/* static members */
@JSImport("thrift", "Int64")
@js.native
object Int64 extends js.Object {
  
  var MAX_INT: Double = js.native
  
  var MIN_INT: Double = js.native
}
