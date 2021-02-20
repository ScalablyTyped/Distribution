package typings.tensorflowTfjsData

import typings.tensorflowTfjsData.byteChunkIteratorMod.ByteChunkIterator
import typings.tensorflowTfjsData.typesMod.FileElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileChunkIteratorMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/iterators/file_chunk_iterator", "FileChunkIterator")
  @js.native
  class FileChunkIterator protected () extends ByteChunkIterator {
    def this(file: FileElement) = this()
    def this(file: FileElement, options: FileChunkIteratorOptions) = this()
    
    var chunkSize: Double = js.native
    
    var file: FileElement = js.native
    
    var offset: Double = js.native
    
    var options: FileChunkIteratorOptions = js.native
  }
  
  @js.native
  trait FileChunkIteratorOptions extends StObject {
    
    /** The number of bytes to read at a time. Default 1MB. */
    var chunkSize: js.UndefOr[Double] = js.native
    
    /** The byte offset at which to begin reading the File or Blob. Default 0. */
    var offset: js.UndefOr[Double] = js.native
  }
  object FileChunkIteratorOptions {
    
    @scala.inline
    def apply(): FileChunkIteratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileChunkIteratorOptions]
    }
    
    @scala.inline
    implicit class FileChunkIteratorOptionsMutableBuilder[Self <: FileChunkIteratorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
}
