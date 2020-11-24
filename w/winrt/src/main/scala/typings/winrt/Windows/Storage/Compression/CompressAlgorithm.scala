package typings.winrt.Windows.Storage.Compression

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
