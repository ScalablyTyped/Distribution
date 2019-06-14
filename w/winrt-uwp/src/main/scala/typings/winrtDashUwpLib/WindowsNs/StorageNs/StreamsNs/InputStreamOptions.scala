package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

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
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.InputStreamOptions
  
  /** The asynchronous read operation completes when one or more bytes is available. */
  @js.native
  sealed trait partial
    extends winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.InputStreamOptions
  
  /** The asynchronous read operation may optionally read ahead and prefetch additional bytes. */
  @js.native
  sealed trait readAhead
    extends winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.InputStreamOptions
  
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val partial: partial with scala.Double = js.native
  /* 2 */ val readAhead: readAhead with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.InputStreamOptions with scala.Double
  ] = js.native
}

