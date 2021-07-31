package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PowerlineFrequency extends StObject
/** Specifies the local power line frequency. */
@JSGlobal("Windows.Media.Capture.PowerlineFrequency")
@js.native
object PowerlineFrequency extends StObject {
  
  /** Power-line frequency control is disabled. */
  @js.native
  sealed trait disabled
    extends StObject
       with PowerlineFrequency
  
  /** The power-line frequency is 50 Hz. */
  @js.native
  sealed trait fiftyHertz
    extends StObject
       with PowerlineFrequency
  
  /** The power-line frequency is 60 Hz. */
  @js.native
  sealed trait sixtyHertz
    extends StObject
       with PowerlineFrequency
}
