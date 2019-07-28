package typings.winrt.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InputStreamOptions extends js.Object

@JSGlobal("Windows.Storage.Streams.InputStreamOptions")
@js.native
object InputStreamOptions extends js.Object {
  @js.native
  sealed trait none extends InputStreamOptions
  
  @js.native
  sealed trait partial extends InputStreamOptions
  
  @js.native
  sealed trait readAhead extends InputStreamOptions
  
  /* 0 */ val none: typings.winrt.WindowsNs.StorageNs.StreamsNs.InputStreamOptions.none with Double = js.native
  /* 1 */ val partial: typings.winrt.WindowsNs.StorageNs.StreamsNs.InputStreamOptions.partial with Double = js.native
  /* 2 */ val readAhead: typings.winrt.WindowsNs.StorageNs.StreamsNs.InputStreamOptions.readAhead with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputStreamOptions with Double] = js.native
}

