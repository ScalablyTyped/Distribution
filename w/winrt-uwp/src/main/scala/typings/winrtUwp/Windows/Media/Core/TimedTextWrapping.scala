package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimedTextWrapping extends StObject
/** Specifies the wrapping behavior of timed text. */
@JSGlobal("Windows.Media.Core.TimedTextWrapping")
@js.native
object TimedTextWrapping extends StObject {
  
  /** The text is not wrapped. */
  @js.native
  sealed trait noWrap extends TimedTextWrapping
  
  /** The text is wrapped. */
  @js.native
  sealed trait wrap extends TimedTextWrapping
}
