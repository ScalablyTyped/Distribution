package typings.winrtUwp.global.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The result of the request to trigger a background task. The RequestAsync method returns a value of this enumeration type. */
@JSGlobal("Windows.ApplicationModel.Background.ApplicationTriggerResult")
@js.native
object ApplicationTriggerResult extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Background.ApplicationTriggerResult with Double
  ] = js.native
  
  /* 0 */ val allowed: typings.winrtUwp.Windows.ApplicationModel.Background.ApplicationTriggerResult.allowed with Double = js.native
  
  /* 1 */ val currentlyRunning: typings.winrtUwp.Windows.ApplicationModel.Background.ApplicationTriggerResult.currentlyRunning with Double = js.native
  
  /* 2 */ val disabledByPolicy: typings.winrtUwp.Windows.ApplicationModel.Background.ApplicationTriggerResult.disabledByPolicy with Double = js.native
  
  /* 3 */ val unknownError: typings.winrtUwp.Windows.ApplicationModel.Background.ApplicationTriggerResult.unknownError with Double = js.native
}
