package typings
package winrtLib.WindowsNs.StorageNs.CompressionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompressAlgorithm extends js.Object

@JSGlobal("Windows.Storage.Compression.CompressAlgorithm")
@js.native
object CompressAlgorithm extends js.Object {
  @js.native
  sealed trait invalidAlgorithm
    extends winrtLib.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm
  
  @js.native
  sealed trait lzms
    extends winrtLib.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm
  
  @js.native
  sealed trait mszip
    extends winrtLib.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm
  
  @js.native
  sealed trait nullAlgorithm
    extends winrtLib.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm
  
  @js.native
  sealed trait xpress
    extends winrtLib.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm
  
  @js.native
  sealed trait xpressHuff
    extends winrtLib.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm
  
  /* 0 */ val invalidAlgorithm: invalidAlgorithm with scala.Double = js.native
  /* 5 */ val lzms: lzms with scala.Double = js.native
  /* 2 */ val mszip: mszip with scala.Double = js.native
  /* 1 */ val nullAlgorithm: nullAlgorithm with scala.Double = js.native
  /* 3 */ val xpress: xpress with scala.Double = js.native
  /* 4 */ val xpressHuff: xpressHuff with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm with scala.Double] = js.native
}

