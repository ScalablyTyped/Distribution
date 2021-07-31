package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HoldingState extends StObject
@JSGlobal("Windows.UI.Input.HoldingState")
@js.native
object HoldingState extends StObject {
  
  @js.native
  sealed trait canceled
    extends StObject
       with HoldingState
  
  @js.native
  sealed trait completed
    extends StObject
       with HoldingState
  
  @js.native
  sealed trait started
    extends StObject
       with HoldingState
}
