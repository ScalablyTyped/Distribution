package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PowerlineFrequency extends StObject
@JSGlobal("Windows.Media.Capture.PowerlineFrequency")
@js.native
object PowerlineFrequency extends StObject {
  
  @js.native
  sealed trait disabled
    extends StObject
       with PowerlineFrequency
  
  @js.native
  sealed trait fiftyHertz
    extends StObject
       with PowerlineFrequency
  
  @js.native
  sealed trait sixtyHertz
    extends StObject
       with PowerlineFrequency
}
