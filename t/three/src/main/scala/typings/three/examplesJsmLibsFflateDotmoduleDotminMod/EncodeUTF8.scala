package typings.three.examplesJsmLibsFflateDotmoduleDotminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/libs/fflate.module.min", "EncodeUTF8")
@js.native
/**
  * Creates a UTF-8 decoding stream
  * @param cb The callback to call whenever data is encoded
  */
open class EncodeUTF8 () extends StObject {
  def this(cb: FlateStreamHandler) = this()
  
  /**
    * The handler to call whenever data is available
    */
  def ondata(data: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
  /**
    * The handler to call whenever data is available
    */
  @JSName("ondata")
  var ondata_Original: FlateStreamHandler = js.native
  
  /**
    * Pushes a chunk to be encoded to UTF-8
    * @param chunk The string data to push
    * @param final Whether this is the last chunk
    */
  def push(chunk: String): Unit = js.native
  def push(chunk: String, `final`: Boolean): Unit = js.native
}
