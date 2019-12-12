package typings.winrt.Windows.Storage.Compression

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Storage.Compression.CompressAlgorithm.invalidAlgorithm
import typings.winrt.Windows.Storage.Compression.CompressAlgorithm.lzms
import typings.winrt.Windows.Storage.Compression.CompressAlgorithm.mszip
import typings.winrt.Windows.Storage.Compression.CompressAlgorithm.nullAlgorithm
import typings.winrt.Windows.Storage.Compression.CompressAlgorithm.xpress
import typings.winrt.Windows.Storage.Compression.CompressAlgorithm.xpressHuff
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompressAlgorithm with Double] = js.native
  /* 0 */ @js.native
  object invalidAlgorithm extends TopLevel[invalidAlgorithm with Double]
  
  /* 5 */ @js.native
  object lzms extends TopLevel[lzms with Double]
  
  /* 2 */ @js.native
  object mszip extends TopLevel[mszip with Double]
  
  /* 1 */ @js.native
  object nullAlgorithm extends TopLevel[nullAlgorithm with Double]
  
  /* 3 */ @js.native
  object xpress extends TopLevel[xpress with Double]
  
  /* 4 */ @js.native
  object xpressHuff extends TopLevel[xpressHuff with Double]
  
}

