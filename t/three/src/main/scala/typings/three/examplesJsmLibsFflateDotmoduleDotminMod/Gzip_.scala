package typings.three.examplesJsmLibsFflateDotmoduleDotminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/libs/fflate.module.min", "Gzip")
@js.native
/**
  * Creates a GZIP stream
  * @param cb The callback to call whenever data is deflated
  */
open class Gzip_ () extends StObject {
  def this(cb: FlateStreamHandler) = this()
  /**
    * Creates a GZIP stream
    * @param opts The compression options
    * @param cb The callback to call whenever data is deflated
    */
  def this(opts: GzipOptions) = this()
  def this(opts: GzipOptions, cb: FlateStreamHandler) = this()
  
  /* private */ var c: Any = js.native
  
  /* private */ var l: Any = js.native
  
  /* private */ var o: Any = js.native
  
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
    * Pushes a chunk to be GZIPped
    * @param chunk The chunk to push
    * @param final Whether this is the last chunk
    */
  def push(chunk: js.typedarray.Uint8Array): Unit = js.native
  def push(chunk: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
  
  /* private */ var v: Any = js.native
}
