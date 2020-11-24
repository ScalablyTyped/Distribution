package typings.winrtUwp.global.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the result of a call to MediaProcessingTrigger::RequestAsync . */
@JSGlobal("Windows.ApplicationModel.Background.MediaProcessingTriggerResult")
@js.native
object MediaProcessingTriggerResult extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Background.MediaProcessingTriggerResult with Double
  ] = js.native
  
  /* 0 */ val allowed: typings.winrtUwp.Windows.ApplicationModel.Background.MediaProcessingTriggerResult.allowed with Double = js.native
  
  /* 1 */ val currentlyRunning: typings.winrtUwp.Windows.ApplicationModel.Background.MediaProcessingTriggerResult.currentlyRunning with Double = js.native
  
  /* 2 */ val disabledByPolicy: typings.winrtUwp.Windows.ApplicationModel.Background.MediaProcessingTriggerResult.disabledByPolicy with Double = js.native
  
  /* 3 */ val unknownError: typings.winrtUwp.Windows.ApplicationModel.Background.MediaProcessingTriggerResult.unknownError with Double = js.native
}
