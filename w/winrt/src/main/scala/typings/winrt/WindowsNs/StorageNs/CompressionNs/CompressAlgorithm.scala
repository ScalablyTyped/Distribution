package typings.winrt.WindowsNs.StorageNs.CompressionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompressAlgorithm extends js.Object

@JSGlobal("Windows.Storage.Compression.CompressAlgorithm")
@js.native
object CompressAlgorithm extends js.Object {
  @js.native
  sealed trait invalidAlgorithm extends CompressAlgorithm
  
  @js.native
  sealed trait lzms extends CompressAlgorithm
  
  @js.native
  sealed trait mszip extends CompressAlgorithm
  
  @js.native
  sealed trait nullAlgorithm extends CompressAlgorithm
  
  @js.native
  sealed trait xpress extends CompressAlgorithm
  
  @js.native
  sealed trait xpressHuff extends CompressAlgorithm
  
  /* 0 */ val invalidAlgorithm: typings.winrt.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm.invalidAlgorithm with Double = js.native
  /* 5 */ val lzms: typings.winrt.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm.lzms with Double = js.native
  /* 2 */ val mszip: typings.winrt.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm.mszip with Double = js.native
  /* 1 */ val nullAlgorithm: typings.winrt.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm.nullAlgorithm with Double = js.native
  /* 3 */ val xpress: typings.winrt.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm.xpress with Double = js.native
  /* 4 */ val xpressHuff: typings.winrt.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm.xpressHuff with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompressAlgorithm with Double] = js.native
}

