package typings.three.fflateModuleMinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/libs/fflate.module.min", "AsyncUnzipInflate")
@js.native
open class AsyncUnzipInflate protected ()
  extends StObject
     with UnzipDecoder {
  /**
    * Creates a DEFLATE decompression that can be used in ZIP archives
    */
  def this(_underscore: String) = this()
  def this(_underscore: String, sz: Double) = this()
  
  /* private */ var i: Any = js.native
  
  /**
    * The handler to call whenever data is available
    */
  /* CompleteClass */
  override def ondata(err: js.Error, data: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
  /**
    * The handler to call whenever data is available
    */
  /* CompleteClass */
  @JSName("ondata")
  var ondata_Original: AsyncFlateStreamHandler = js.native
  
  /**
    * Pushes a chunk to be decompressed
    * @param data The data in this chunk. Do not consume (detach) this data.
    * @param final Whether this is the last chunk in the data stream
    */
  /* CompleteClass */
  override def push(data: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
  
  @JSName("terminate")
  def terminate_MAsyncUnzipInflate(): Unit = js.native
  @JSName("terminate")
  var terminate_Original: AsyncTerminable = js.native
}
/* static members */
object AsyncUnzipInflate {
  
  @JSImport("three/examples/jsm/libs/fflate.module.min", "AsyncUnzipInflate")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/libs/fflate.module.min", "AsyncUnzipInflate.compression")
  @js.native
  def compression: Double = js.native
  inline def compression_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compression")(x.asInstanceOf[js.Any])
}
