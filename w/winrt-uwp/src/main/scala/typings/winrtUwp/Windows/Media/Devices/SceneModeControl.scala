package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the scene mode settings on a capture device. */
@js.native
trait SceneModeControl extends js.Object {
  
  /**
    * Asynchronously sets the color temperature Value .
    * @param sceneMode The scene mode to set the Value property to.
    * @return The object that is used to control the asynchronous operation.
    */
  def setValueAsync(sceneMode: CaptureSceneMode): IPromiseWithIAsyncAction = js.native
  
  /** Gets the scene modes supported on the capture device. */
  var supportedModes: IVectorView[CaptureSceneMode] = js.native
  
  /** Gets the current scene mod ethe capture device is set to. */
  var value: CaptureSceneMode = js.native
}
object SceneModeControl {
  
  @scala.inline
  def apply(
    setValueAsync: CaptureSceneMode => IPromiseWithIAsyncAction,
    supportedModes: IVectorView[CaptureSceneMode],
    value: CaptureSceneMode
  ): SceneModeControl = {
    val __obj = js.Dynamic.literal(setValueAsync = js.Any.fromFunction1(setValueAsync), supportedModes = supportedModes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneModeControl]
  }
  
  @scala.inline
  implicit class SceneModeControlOps[Self <: SceneModeControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSetValueAsync(value: CaptureSceneMode => IPromiseWithIAsyncAction): Self = this.set("setValueAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSupportedModes(value: IVectorView[CaptureSceneMode]): Self = this.set("supportedModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: CaptureSceneMode): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
