package typings.three.fflateModuleMinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/libs/fflate.module.min", "Zip")
@js.native
/**
  * Creates an empty ZIP archive to which files can be added
  * @param cb The callback to call whenever data for the generated ZIP archive
  *           is available
  */
open class Zip_ () extends StObject {
  def this(cb: AsyncFlateStreamHandler) = this()
  
  /**
    * Adds a file to the ZIP archive
    * @param file The file stream to add
    */
  def add(file: ZipInputFile): Unit = js.native
  
  /* private */ var d: Any = js.native
  
  /* private */ var e: Any = js.native
  
  /**
    * Ends the process of adding files and prepares to emit the final chunks.
    * This *must* be called after adding all desired files for the resulting
    * ZIP file to work properly.
    */
  def end(): Unit = js.native
  
  /**
    * The handler to call whenever data is available
    */
  def ondata(err: js.Error, data: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
  /**
    * The handler to call whenever data is available
    */
  @JSName("ondata")
  var ondata_Original: AsyncFlateStreamHandler = js.native
  
  /**
    * A method to terminate any internal workers used by the stream. Subsequent
    * calls to add() will fail.
    */
  def terminate(): Unit = js.native
  
  /* private */ var u: Any = js.native
}
