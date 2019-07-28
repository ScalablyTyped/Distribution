package typings.winrtDashUwp.WindowsNs.StorageNs.CompressionNs

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
  
  /* 0 */ val invalidAlgorithm: typings.winrtDashUwp.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm.invalidAlgorithm with Double = js.native
  /* 5 */ val lzms: typings.winrtDashUwp.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm.lzms with Double = js.native
  /* 2 */ val mszip: typings.winrtDashUwp.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm.mszip with Double = js.native
  /* 1 */ val nullAlgorithm: typings.winrtDashUwp.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm.nullAlgorithm with Double = js.native
  /* 3 */ val xpress: typings.winrtDashUwp.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm.xpress with Double = js.native
  /* 4 */ val xpressHuff: typings.winrtDashUwp.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm.xpressHuff with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompressAlgorithm with Double] = js.native
}

