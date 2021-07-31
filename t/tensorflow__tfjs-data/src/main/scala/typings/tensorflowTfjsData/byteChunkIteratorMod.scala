package typings.tensorflowTfjsData

import typings.std.Uint8Array
import typings.tensorflowTfjsData.lazyIteratorMod.LazyIterator
import typings.tensorflowTfjsData.stringIteratorMod.StringIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byteChunkIteratorMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/iterators/byte_chunk_iterator", "ByteChunkIterator")
  @js.native
  abstract class ByteChunkIterator () extends LazyIterator[Uint8Array] {
    
    /**
      * Decode a stream of UTF8-encoded byte arrays to a stream of strings.
      *
      * The byte arrays producetd from the ByteChunkIterator on which this is
      * called will be interpreted as concatenated.  No assumptions are made about
      * the boundaries of the incoming chunks, so a multi-byte UTF8 encoding of a
      * character may span the boundary between chunks.  This naturally happens,
      * for instance, when reading fixed-size byte arrays from a file.
      */
    def decodeUTF8(): StringIterator = js.native
  }
}
