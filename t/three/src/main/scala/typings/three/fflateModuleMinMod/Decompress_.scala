package typings.three.fflateModuleMinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/libs/fflate.module.min", "Decompress")
@js.native
/**
  * Creates a decompression stream
  * @param cb The callback to call whenever data is decompressed
  */
open class Decompress_ () extends StObject {
  def this(cb: FlateStreamHandler) = this()
  
  /* private */ var G: Any = js.native
  
  /* private */ var I: Any = js.native
  
  /* private */ var Z: Any = js.native
  
  /**
    * The handler to call whenever data is available
    */
  def ondata(data: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
  /**
    * The handler to call whenever data is available
    */
  @JSName("ondata")
  var ondata_Original: FlateStreamHandler = js.native
  
  /* private */ var p: Any = js.native
  
  /**
    * Pushes a chunk to be decompressed
    * @param chunk The chunk to push
    * @param final Whether this is the last chunk
    */
  def push(chunk: js.typedarray.Uint8Array): Unit = js.native
  def push(chunk: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
  
  /* private */ var s: Any = js.native
}
