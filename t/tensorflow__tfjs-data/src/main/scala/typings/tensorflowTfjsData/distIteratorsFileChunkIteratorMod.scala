package typings.tensorflowTfjsData

import typings.tensorflowTfjsData.distIteratorsByteChunkIteratorMod.ByteChunkIterator
import typings.tensorflowTfjsData.distTypesMod.FileElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIteratorsFileChunkIteratorMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/iterators/file_chunk_iterator", "FileChunkIterator")
  @js.native
  open class FileChunkIterator protected () extends ByteChunkIterator {
    def this(file: FileElement) = this()
    def this(file: FileElement, options: FileChunkIteratorOptions) = this()
    
    var chunkSize: Double = js.native
    
    /* protected */ var file: FileElement = js.native
    
    var offset: Double = js.native
    
    /* protected */ var options: FileChunkIteratorOptions = js.native
  }
  
  trait FileChunkIteratorOptions extends StObject {
    
    /** The number of bytes to read at a time. Default 1MB. */
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    /** The byte offset at which to begin reading the File or Blob. Default 0. */
    var offset: js.UndefOr[Double] = js.undefined
  }
  object FileChunkIteratorOptions {
    
    inline def apply(): FileChunkIteratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileChunkIteratorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileChunkIteratorOptions] (val x: Self) extends AnyVal {
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
}
