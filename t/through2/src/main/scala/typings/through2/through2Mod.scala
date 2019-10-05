package typings.through2

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.Anon_End
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Transform
import typings.through2.through2Mod.FlushCallback
import typings.through2.through2Mod.Through2Constructor
import typings.through2.through2Mod.TransformCallback
import typings.through2.through2Mod.TransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("through2", JSImport.Namespace)
@js.native
object through2Mod extends js.Object {
  @js.native
  trait Through2Constructor
    extends Transform
       with Instantiable0[Transform]
       with Instantiable1[/* opts */ DuplexOptions, Transform] {
    def apply(): Transform = js.native
    def apply(opts: DuplexOptions): Transform = js.native
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
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
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
  
  def apply(): Transform = js.native
  def apply(opts: DuplexOptions): Transform = js.native
  def apply(opts: DuplexOptions, transform: TransformFunction): Transform = js.native
  def apply(opts: DuplexOptions, transform: TransformFunction, flush: FlushCallback): Transform = js.native
  def apply(transform: TransformFunction): Transform = js.native
  def apply(transform: TransformFunction, flush: FlushCallback): Transform = js.native
  /**
  	 * Creates a constructor for a custom Transform. This is useful when you
  	 * want to use the same transform logic in multiple instances.
  	 */
  def ctor(): Through2Constructor = js.native
  def ctor(opts: DuplexOptions): Through2Constructor = js.native
  def ctor(opts: DuplexOptions, transform: TransformFunction): Through2Constructor = js.native
  def ctor(opts: DuplexOptions, transform: TransformFunction, flush: FlushCallback): Through2Constructor = js.native
  def ctor(transform: TransformFunction): Through2Constructor = js.native
  def ctor(transform: TransformFunction, flush: FlushCallback): Through2Constructor = js.native
  /**
  	 * Convenvience method for creating object streams
  	 */
  def obj(): Transform = js.native
  def obj(transform: TransformFunction): Transform = js.native
  def obj(transform: TransformFunction, flush: FlushCallback): Transform = js.native
  type FlushCallback = js.ThisFunction1[/* this */ Transform, /* flushCallback */ js.Function0[Unit], Unit]
  type TransformCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any], Unit]
  type TransformFunction = js.ThisFunction3[
    /* this */ Transform, 
    /* chunk */ js.Any, 
    /* enc */ String, 
    /* callback */ TransformCallback, 
    Unit
  ]
}

