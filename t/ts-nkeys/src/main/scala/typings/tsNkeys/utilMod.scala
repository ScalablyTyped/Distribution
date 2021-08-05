package typings.tsNkeys

import typings.node.Buffer
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("ts-nkeys/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dump(buf: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dump")(buf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def dump(buf: Buffer, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dump")(buf.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toArrayBuffer(): ToArrayBuffer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("toArrayBuffer")().asInstanceOf[ToArrayBuffer_]
  
  type ToArrayBuffer_ = js.Function1[/* buf */ Buffer, ArrayBuffer]
}
