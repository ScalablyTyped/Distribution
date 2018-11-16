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
  
  val invalidAlgorithm: invalidAlgorithm with java.lang.String = js.native
  val lzms: lzms with java.lang.String = js.native
  val mszip: mszip with java.lang.String = js.native
  val nullAlgorithm: nullAlgorithm with java.lang.String = js.native
  val xpress: xpress with java.lang.String = js.native
  val xpressHuff: xpressHuff with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.StorageNs.CompressionNs.CompressAlgorithm with java.lang.String
  ] = js.native
}

