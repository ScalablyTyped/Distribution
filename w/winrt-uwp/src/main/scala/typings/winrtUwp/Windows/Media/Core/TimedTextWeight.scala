package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimedTextWeight extends StObject
/** Specifies the weight of timed text. */
@JSGlobal("Windows.Media.Core.TimedTextWeight")
@js.native
object TimedTextWeight extends StObject {
  
  /** The text is bold. */
  @js.native
  sealed trait bold extends TimedTextWeight
  
  /** The text is normal weight. */
  @js.native
  sealed trait normal extends TimedTextWeight
}
