package typings.telnetClient

import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.netMod.Socket
import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("telnet-client/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("telnet-client/lib/utils", "Stream")
  @js.native
  open class Stream protected () extends Duplex {
    def this(source: Socket) = this()
    def this(source: Socket, options: DuplexOptions) = this()
    
    def _read(): Unit = js.native
    
    def _write(data: String): Unit = js.native
    def _write(data: String, encoding: Unit, callback: Callback[Unit]): Unit = js.native
    def _write(data: String, encoding: BufferEncoding): Unit = js.native
    def _write(data: String, encoding: BufferEncoding, callback: Callback[Unit]): Unit = js.native
    def _write(data: Buffer): Unit = js.native
    def _write(data: Buffer, encoding: Unit, callback: Callback[Unit]): Unit = js.native
    def _write(data: Buffer, encoding: BufferEncoding): Unit = js.native
    def _write(data: Buffer, encoding: BufferEncoding, callback: Callback[Unit]): Unit = js.native
    
    /* private */ var source: Any = js.native
  }
  
  inline def asCallback[T](promise: js.Promise[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asCallback")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def asCallback[T](promise: js.Promise[T], callback: Callback[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("asCallback")(promise.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def search(str: String, pattern: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(str.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def search(str: String, pattern: js.RegExp): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(str.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type Callback[T] = js.Function2[/* err */ Any, /* value */ js.UndefOr[T], Unit]
}
