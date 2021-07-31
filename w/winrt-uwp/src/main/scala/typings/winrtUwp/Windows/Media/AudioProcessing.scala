package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AudioProcessing extends StObject
/** Defines the audio processing modes. */
@JSGlobal("Windows.Media.AudioProcessing")
@js.native
object AudioProcessing extends StObject {
  
  /** Normal audio signal processing. */
  @js.native
  sealed trait default
    extends StObject
       with AudioProcessing
  
  /** Minimal audio signal processing. */
  @js.native
  sealed trait raw
    extends StObject
       with AudioProcessing
}
