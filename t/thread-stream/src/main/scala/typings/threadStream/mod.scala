package typings.threadStream

import typings.node.eventsMod.EventEmitter
import typings.node.workerThreadsMod.WorkerOptions
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("thread-stream", JSImport.Namespace)
  @js.native
  open class ^ protected () extends ThreadStream {
    /**
      * @param {ThreadStreamOptions} opts 
      */
    def this(opts: ThreadStreamOptions) = this()
  }
  
  @js.native
  trait ThreadStream extends EventEmitter {
    
    /**
      * Signal that no more data will be written.
      * 
      * **Please note that this method should not throw an {Error} if something goes wrong but emit an error event.**
      * 
      * Calling the {@link write()} method after calling {@link end()} will emit an error.
      */
    def end(): Unit = js.native
    
    /**
      * Flush the stream synchronously.
      * This method should be called in the shutdown phase to make sure that all data has been flushed.
      * 
      * **Please note that this method will throw an {Error} if something goes wrong.**
      * 
      * @throws {Error} if the stream is already flushing, if it fails to flush or if it takes more than 10 seconds to flush.
      */
    def flushSync(): Unit = js.native
    
    /**
      * Write some data to the stream.
      * 
      * **Please note that this method should not throw an {Error} if something goes wrong but emit an error event.**
      * @param {string} data data to write.
      * @returns {boolean} false if the stream wishes for the calling code to wait for the 'drain' event to be emitted before continuing to write additional data or if it fails to write; otherwise true.
      */
    def write(data: String): Boolean = js.native
  }
  
  trait ThreadStreamOptions extends StObject {
    
    /**
      * The size (in bytes) of the buffer.
      * Must be greater than 4 (i.e. it must at least fit a 4-byte utf-8 char).
      * 
      * Default: `4 * 1024 * 1024` = `4194304`
      */
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The path to the Worker's main script or module.
      * Must be either an absolute path or a relative path (i.e. relative to the current working directory) starting with ./ or ../, or a WHATWG URL object using file: or data: protocol.
      * When using a data: URL, the data is interpreted based on MIME type using the ECMAScript module loader.
      * 
      * {@link workerThreads.Worker()}
      */
    var filename: String | URL
    
    /**
      * If `true`, write data synchronously; otherwise write data asynchronously.
      * 
      * Default: `false`.
      */
    var sync: js.UndefOr[Boolean] = js.undefined
    
    /**
      * {@link workerThreads.WorkerOptions.workerData}
      * 
      * Default: `{}`
      */
    var workerData: js.UndefOr[Any] = js.undefined
    
    /**
      * {@link workerThreads.WorkerOptions}
      * 
      * Default: `{}`
      */
    var workerOpts: js.UndefOr[WorkerOptions] = js.undefined
  }
  object ThreadStreamOptions {
    
    inline def apply(filename: String | URL): ThreadStreamOptions = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThreadStreamOptions]
    }
    
    extension [Self <: ThreadStreamOptions](x: Self) {
      
      inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setFilename(value: String | URL): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      inline def setWorkerData(value: Any): Self = StObject.set(x, "workerData", value.asInstanceOf[js.Any])
      
      inline def setWorkerDataUndefined: Self = StObject.set(x, "workerData", js.undefined)
      
      inline def setWorkerOpts(value: WorkerOptions): Self = StObject.set(x, "workerOpts", value.asInstanceOf[js.Any])
      
      inline def setWorkerOptsUndefined: Self = StObject.set(x, "workerOpts", js.undefined)
    }
  }
}
