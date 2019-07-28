package typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InputStreamOptions extends js.Object

/** Specifies the read options for an input stream. */
@JSGlobal("Windows.Storage.Streams.InputStreamOptions")
@js.native
object InputStreamOptions extends js.Object {
  /** No options are specified. */
  @js.native
  sealed trait none extends InputStreamOptions
  
  /** The asynchronous read operation completes when one or more bytes is available. */
  @js.native
  sealed trait partial extends InputStreamOptions
  
  /** The asynchronous read operation may optionally read ahead and prefetch additional bytes. */
  @js.native
  sealed trait readAhead extends InputStreamOptions
  
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.InputStreamOptions.none with Double = js.native
  /* 1 */ val partial: typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.InputStreamOptions.partial with Double = js.native
  /* 2 */ val readAhead: typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.InputStreamOptions.readAhead with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputStreamOptions with Double] = js.native
}

