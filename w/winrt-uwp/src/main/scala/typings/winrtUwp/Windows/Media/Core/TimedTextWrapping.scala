package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimedTextWrapping extends js.Object
/** Specifies the wrapping behavior of timed text. */
@JSGlobal("Windows.Media.Core.TimedTextWrapping")
@js.native
object TimedTextWrapping extends js.Object {
  
  /** The text is not wrapped. */
  @js.native
  sealed trait noWrap extends TimedTextWrapping
  
  /** The text is wrapped. */
  @js.native
  sealed trait wrap extends TimedTextWrapping
}
