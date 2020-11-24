package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimedTextWeight extends js.Object
/** Specifies the weight of timed text. */
@JSGlobal("Windows.Media.Core.TimedTextWeight")
@js.native
object TimedTextWeight extends js.Object {
  
  /** The text is bold. */
  @js.native
  sealed trait bold extends TimedTextWeight
  
  /** The text is normal weight. */
  @js.native
  sealed trait normal extends TimedTextWeight
}
