package typings.winrt.Windows.Storage.Compression

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
  
  /* 0 */ val invalidAlgorithm: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.invalidAlgorithm with Double = js.native
  /* 5 */ val lzms: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.lzms with Double = js.native
  /* 2 */ val mszip: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.mszip with Double = js.native
  /* 1 */ val nullAlgorithm: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.nullAlgorithm with Double = js.native
  /* 3 */ val xpress: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.xpress with Double = js.native
  /* 4 */ val xpressHuff: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.xpressHuff with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompressAlgorithm with Double] = js.native
}

