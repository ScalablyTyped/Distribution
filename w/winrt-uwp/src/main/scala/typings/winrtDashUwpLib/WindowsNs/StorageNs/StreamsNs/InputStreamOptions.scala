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
  
  val none: none with java.lang.String = js.native
  val partial: partial with java.lang.String = js.native
  val readAhead: readAhead with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.InputStreamOptions with java.lang.String
  ] = js.native
}

