package typings.three.examplesJsmLibsFflateDotmoduleDotminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/libs/fflate.module.min", "DecodeUTF8")
@js.native
/**
  * Creates a UTF-8 decoding stream
  * @param cb The callback to call whenever data is decoded
  */
open class DecodeUTF8 () extends StObject {
  def this(cb: StringStreamHandler) = this()
  
  /**
    * The handler to call whenever data is available
    */
  def ondata(data: String, `final`: Boolean): Unit = js.native
  /**
    * The handler to call whenever data is available
    */
  @JSName("ondata")
  var ondata_Original: StringStreamHandler = js.native
  
  /* private */ var p: Any = js.native
  
  /**
    * Pushes a chunk to be decoded from UTF-8 binary
    * @param chunk The chunk to push
    * @param final Whether this is the last chunk
    */
  def push(chunk: js.typedarray.Uint8Array): Unit = js.native
  def push(chunk: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
  
  /* private */ var t: Any = js.native
}
