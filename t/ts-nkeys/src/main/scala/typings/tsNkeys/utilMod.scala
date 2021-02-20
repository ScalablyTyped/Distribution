package typings.tsNkeys

import typings.node.Buffer
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("ts-nkeys/lib/util", "dump")
  @js.native
  def dump(buf: Buffer): Unit = js.native
  @JSImport("ts-nkeys/lib/util", "dump")
  @js.native
  def dump(buf: Buffer, msg: String): Unit = js.native
  
  @JSImport("ts-nkeys/lib/util", "toArrayBuffer")
  @js.native
  def toArrayBuffer(): ToArrayBuffer_ = js.native
  
  type ToArrayBuffer_ = js.Function1[/* buf */ Buffer, ArrayBuffer]
}
