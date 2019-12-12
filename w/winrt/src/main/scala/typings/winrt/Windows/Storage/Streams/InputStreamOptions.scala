package typings.winrt.Windows.Storage.Streams

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Storage.Streams.InputStreamOptions.none
import typings.winrt.Windows.Storage.Streams.InputStreamOptions.partial
import typings.winrt.Windows.Storage.Streams.InputStreamOptions.readAhead
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputStreamOptions with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object partial extends TopLevel[partial with Double]
  
  /* 2 */ @js.native
  object readAhead extends TopLevel[readAhead with Double]
  
}

