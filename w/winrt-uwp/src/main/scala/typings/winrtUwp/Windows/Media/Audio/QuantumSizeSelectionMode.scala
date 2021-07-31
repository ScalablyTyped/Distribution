package typings.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QuantumSizeSelectionMode extends StObject
/** Defines values used for quantum size selection. */
@JSGlobal("Windows.Media.Audio.QuantumSizeSelectionMode")
@js.native
object QuantumSizeSelectionMode extends StObject {
  
  /** Use the value closest to the one desired. */
  @js.native
  sealed trait closestToDesired
    extends StObject
       with QuantumSizeSelectionMode
  
  /** Use the value with the lowest latency. */
  @js.native
  sealed trait lowestLatency
    extends StObject
       with QuantumSizeSelectionMode
  
  /** Use the system default value. */
  @js.native
  sealed trait systemDefault
    extends StObject
       with QuantumSizeSelectionMode
}
