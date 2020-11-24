package typings.winrtUwp.Windows.Storage.Compression

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompressAlgorithm extends js.Object
/** Identifies a compression algorithm to use when creating an instance of a compressor. */
@JSGlobal("Windows.Storage.Compression.CompressAlgorithm")
@js.native
object CompressAlgorithm extends js.Object {
  
  /** This value represents an invalid compression algorithm. It is useful primarily for error checking. */
  @js.native
  sealed trait invalidAlgorithm extends CompressAlgorithm
  
  /** The compressor will use the LZMS compression algorithm. */
  @js.native
  sealed trait lzms extends CompressAlgorithm
  
  /** The compressor will use the MSZIP compression algorithm. */
  @js.native
  sealed trait mszip extends CompressAlgorithm
  
  /** This value represents an algorithm that passes data through with no compression. It is useful primarily for testing. */
  @js.native
  sealed trait nullAlgorithm extends CompressAlgorithm
  
  /** The compressor will use the XPRESS compression algorithm. */
  @js.native
  sealed trait xpress extends CompressAlgorithm
  
  /** The compressor will use the XPRESS compression algorithm with Huffman encoding. */
  @js.native
  sealed trait xpressHuff extends CompressAlgorithm
}
