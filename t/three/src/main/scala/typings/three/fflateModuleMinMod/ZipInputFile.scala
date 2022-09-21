package typings.three.fflateModuleMinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZipInputFile
  extends StObject
     with ZipAttributes {
  
  /**
    * The compression format for the data stream. This number is determined by
    * the spec in PKZIP's APPNOTE.txt, section 4.4.5. For example, 0 = no
    * compression, 8 = deflate, 14 = LZMA
    */
  var compression: Double
  
  /**
    * A CRC of the original file contents. This attribute may be invalid after
    * the file is added to the ZIP archive; it must be correct only before the
    * stream completes.
    *
    * If you don't want to have to generate this yourself, consider extending the
    * ZipPassThrough class and overriding its process() method, or using one of
    * ZipDeflate or AsyncZipDeflate.
    */
  var crc: Double
  
  /**
    * The filename to associate with the data provided to this stream. If you
    * want a file in a subdirectory, use forward slashes as a separator (e.g.
    * `directory/filename.ext`). This will still work on Windows.
    */
  var filename: String
  
  /**
    * Bits 1 and 2 of the general purpose bit flag, specified in PKZIP's
    * APPNOTE.txt, section 4.4.4. Should be between 0 and 3. This is unlikely
    * to be necessary.
    */
  var flag: js.UndefOr[Double] = js.undefined
  
  /**
    * The handler to be called when data is added. After passing this stream to
    * the ZIP file object, this handler will always be defined. To call it:
    *
    * `stream.ondata(error, chunk, final)`
    *
    * error = any error that occurred (null if there was no error)
    *
    * chunk = a Uint8Array of the data that was added (null if there was an
    * error)
    *
    * final = boolean, whether this is the final chunk in the stream
    */
  var ondata: js.UndefOr[AsyncFlateStreamHandler] = js.undefined
  
  /**
    * The size of the file in bytes. This attribute may be invalid after
    * the file is added to the ZIP archive; it must be correct only before the
    * stream completes.
    *
    * If you don't want to have to compute this yourself, consider extending the
    * ZipPassThrough class and overriding its process() method, or using one of
    * ZipDeflate or AsyncZipDeflate.
    */
  var size: Double
  
  /**
    * A method called when the stream is no longer needed, for clean-up
    * purposes. This will not always be called after the stream completes,
    * so you may wish to call this.terminate() after the final chunk is
    * processed if you have clean-up logic.
    */
  var terminate: js.UndefOr[AsyncTerminable] = js.undefined
}
object ZipInputFile {
  
  inline def apply(compression: Double, crc: Double, filename: String, size: Double): ZipInputFile = {
    val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any], crc = crc.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipInputFile]
  }
  
  extension [Self <: ZipInputFile](x: Self) {
    
    inline def setCompression(value: Double): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCrc(value: Double): Self = StObject.set(x, "crc", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFlag(value: Double): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    inline def setOndata(value: (/* err */ js.Error, /* data */ js.typedarray.Uint8Array, /* final */ Boolean) => Unit): Self = StObject.set(x, "ondata", js.Any.fromFunction3(value))
    
    inline def setOndataUndefined: Self = StObject.set(x, "ondata", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTerminate(value: () => Unit): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
    
    inline def setTerminateUndefined: Self = StObject.set(x, "terminate", js.undefined)
  }
}
