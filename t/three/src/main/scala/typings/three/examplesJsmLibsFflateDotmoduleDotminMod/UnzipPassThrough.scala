package typings.three.examplesJsmLibsFflateDotmoduleDotminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/libs/fflate.module.min", "UnzipPassThrough")
@js.native
open class UnzipPassThrough ()
  extends StObject
     with UnzipDecoder {
  
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
}
/* static members */
object UnzipPassThrough {
  
  @JSImport("three/examples/jsm/libs/fflate.module.min", "UnzipPassThrough")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/libs/fflate.module.min", "UnzipPassThrough.compression")
  @js.native
  def compression: Double = js.native
  inline def compression_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compression")(x.asInstanceOf[js.Any])
}
