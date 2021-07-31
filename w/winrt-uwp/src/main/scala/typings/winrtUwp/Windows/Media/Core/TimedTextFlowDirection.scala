package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimedTextFlowDirection extends StObject
/** Specifies the direction timed text is flowed. */
@JSGlobal("Windows.Media.Core.TimedTextFlowDirection")
@js.native
object TimedTextFlowDirection extends StObject {
  
  /** Text is flowed left to right. */
  @js.native
  sealed trait leftToRight
    extends StObject
       with TimedTextFlowDirection
  
  /** Text is flowed right to left. */
  @js.native
  sealed trait rightToLeft
    extends StObject
       with TimedTextFlowDirection
}
