package typings
package winrtDashUwpLib.WindowsNs.StorageNs.CompressionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompressAlgorithm extends js.Object

/** Identifies a compression algorithm to use when creating an instance of a compressor. */
@JSGlobal("Windows.Storage.Compression.CompressAlgorithm")
@js.native
object CompressAlgorithm extends js.Object {
  /** This value represents an invalid compression algorithm. It is useful primarily for error checking. */
  @js.native
  sealed trait invalidAlgorithm
    extends winrtDashUwpLib.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm
  
  /** The compressor will use the LZMS compression algorithm. */
  @js.native
  sealed trait lzms
    extends winrtDashUwpLib.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm
  
  /** The compressor will use the MSZIP compression algorithm. */
  @js.native
  sealed trait mszip
    extends winrtDashUwpLib.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm
  
  /** This value represents an algorithm that passes data through with no compression. It is useful primarily for testing. */
  @js.native
  sealed trait nullAlgorithm
    extends winrtDashUwpLib.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm
  
  /** The compressor will use the XPRESS compression algorithm. */
  @js.native
  sealed trait xpress
    extends winrtDashUwpLib.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm
  
  /** The compressor will use the XPRESS compression algorithm with Huffman encoding. */
  @js.native
  sealed trait xpressHuff
    extends winrtDashUwpLib.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm
  
  val invalidAlgorithm: invalidAlgorithm with java.lang.String = js.native
  val lzms: lzms with java.lang.String = js.native
  val mszip: mszip with java.lang.String = js.native
  val nullAlgorithm: nullAlgorithm with java.lang.String = js.native
  val xpress: xpress with java.lang.String = js.native
  val xpressHuff: xpressHuff with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm with java.lang.String
  ] = js.native
}

