package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the execution state of the app. */
@JSGlobal("Windows.ApplicationModel.Activation.ApplicationExecutionState")
@js.native
object ApplicationExecutionState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState & Double
  ] = js.native
  
  /* 4 */ val closedByUser: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState.closedByUser & Double = js.native
  
  /* 0 */ val notRunning: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState.notRunning & Double = js.native
  
  /* 1 */ val running: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState.running & Double = js.native
  
  /* 2 */ val suspended: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState.suspended & Double = js.native
  
  /* 3 */ val terminated: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState.terminated & Double = js.native
}
