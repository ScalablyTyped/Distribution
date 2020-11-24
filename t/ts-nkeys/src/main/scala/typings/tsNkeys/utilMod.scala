package typings.tsNkeys

import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-nkeys/lib/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def dump(buf: Buffer): Unit = js.native
  def dump(buf: Buffer, msg: String): Unit = js.native
  
  def toArrayBuffer(): ToArrayBuffer_ = js.native
  
  type ToArrayBuffer_ = js.Function1[/* buf */ Buffer, ArrayBuffer]
}
