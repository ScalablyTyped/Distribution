package typings.winston.libWinstonTransportsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.winstonDashTransport.winstonDashTransportMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleTransportInstance
  extends ^
     with Instantiable0[ConsoleTransportInstance]
     with Instantiable1[/* options */ ConsoleTransportOptions, ConsoleTransportInstance] {
  var eol: String = js.native
  var name: String = js.native
  var stderrLevels: js.Array[String] = js.native
  /* InferMemberOverrides */
  override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def emit(event: String, args: js.Any*): Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: String): Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: Double): this.type = js.native
}

