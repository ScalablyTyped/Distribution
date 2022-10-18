package typings.three.examplesJsmLibsFflateDotmoduleDotminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/libs/fflate.module.min", "ZipPassThrough")
@js.native
open class ZipPassThrough protected ()
  extends StObject
     with ZipInputFile {
  /**
    * Creates a pass-through stream that can be added to ZIP archives
    * @param filename The filename to associate with this data stream
    */
  def this(filename: String) = this()
  
  /* private */ var c: Any = js.native
  
  /**
    * The compression format for the data stream. This number is determined by
    * the spec in PKZIP's APPNOTE.txt, section 4.4.5. For example, 0 = no
    * compression, 8 = deflate, 14 = LZMA
    */
  /* CompleteClass */
  var compression: Double = js.native
  
  /**
    * A CRC of the original file contents. This attribute may be invalid after
    * the file is added to the ZIP archive; it must be correct only before the
    * stream completes.
    *
    * If you don't want to have to generate this yourself, consider extending the
    * ZipPassThrough class and overriding its process() method, or using one of
    * ZipDeflate or AsyncZipDeflate.
    */
  /* CompleteClass */
  var crc: Double = js.native
  
  /**
    * The filename to associate with the data provided to this stream. If you
    * want a file in a subdirectory, use forward slashes as a separator (e.g.
    * `directory/filename.ext`). This will still work on Windows.
    */
  /* CompleteClass */
  var filename: String = js.native
  
  @JSName("ondata")
  def ondata_MZipPassThrough(err: js.Error, data: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
  @JSName("ondata")
  var ondata_Original: AsyncFlateStreamHandler = js.native
  
  /**
    * Processes a chunk and pushes to the output stream. You can override this
    * method in a subclass for custom behavior, but by default this passes
    * the data through. You must call this.ondata(err, chunk, final) at some
    * point in this method.
    * @param chunk The chunk to process
    * @param final Whether this is the last chunk
    */
  /* protected */ def process(chunk: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
  
  /**
    * Pushes a chunk to be added. If you are subclassing this with a custom
    * compression algorithm, note that you must push data from the source
    * file only, pre-compression.
    * @param chunk The chunk to push
    * @param final Whether this is the last chunk
    */
  def push(chunk: js.typedarray.Uint8Array): Unit = js.native
  def push(chunk: js.typedarray.Uint8Array, `final`: Boolean): Unit = js.native
  
  /**
    * The size of the file in bytes. This attribute may be invalid after
    * the file is added to the ZIP archive; it must be correct only before the
    * stream completes.
    *
    * If you don't want to have to compute this yourself, consider extending the
    * ZipPassThrough class and overriding its process() method, or using one of
    * ZipDeflate or AsyncZipDeflate.
    */
  /* CompleteClass */
  var size: Double = js.native
}
