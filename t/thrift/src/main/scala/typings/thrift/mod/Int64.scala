package typings.thrift.mod

import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thrift", "Int64")
@js.native
class Int64 protected ()
  extends typings.nodeInt64.mod.^ {
  def this(array: Uint8Array) = this()
  def this(buffer: Buffer) = this()
  def this(num: Double) = this()
  def this(str: String) = this()
  def this(array: Uint8Array, offset: Double) = this()
  def this(buffer: Buffer, offset: Double) = this()
  def this(hi: Double, lo: Double) = this()
}
object Int64 {
  
  @JSImport("thrift", "Int64")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("thrift", "Int64.MAX_INT")
  @js.native
  def MAX_INT: Double = js.native
  @scala.inline
  def MAX_INT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_INT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("thrift", "Int64.MIN_INT")
  @js.native
  def MIN_INT: Double = js.native
  @scala.inline
  def MIN_INT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_INT")(x.asInstanceOf[js.Any])
}
