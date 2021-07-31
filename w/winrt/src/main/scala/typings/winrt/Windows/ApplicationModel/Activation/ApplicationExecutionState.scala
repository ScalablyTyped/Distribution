package typings.winrt.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationExecutionState extends StObject
@JSGlobal("Windows.ApplicationModel.Activation.ApplicationExecutionState")
@js.native
object ApplicationExecutionState extends StObject {
  
  @js.native
  sealed trait closedByUser
    extends StObject
       with ApplicationExecutionState
  
  @js.native
  sealed trait notRunning
    extends StObject
       with ApplicationExecutionState
  
  @js.native
  sealed trait running
    extends StObject
       with ApplicationExecutionState
  
  @js.native
  sealed trait suspended
    extends StObject
       with ApplicationExecutionState
  
  @js.native
  sealed trait terminated
    extends StObject
       with ApplicationExecutionState
}
