package typings.winrtDashUwp.Windows.Storage.Streams

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Storage.Streams.InputStreamOptions.none
import typings.winrtDashUwp.Windows.Storage.Streams.InputStreamOptions.partial
import typings.winrtDashUwp.Windows.Storage.Streams.InputStreamOptions.readAhead
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputStreamOptions with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object partial extends TopLevel[partial with Double]
  
  /* 2 */ @js.native
  object readAhead extends TopLevel[readAhead with Double]
  
}

