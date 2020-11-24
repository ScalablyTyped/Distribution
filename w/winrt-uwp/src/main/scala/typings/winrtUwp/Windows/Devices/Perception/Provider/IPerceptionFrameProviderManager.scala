package typings.winrtUwp.Windows.Devices.Perception.Provider

import typings.winrtUwp.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The IPerceptionFrameProviderManager is expected to provide any IPerceptionFrameProvider that has been registered via PerceptionFrameProviderManagerService::RegisterFrameProviderInfo(). */
@js.native
trait IPerceptionFrameProviderManager extends IClosable {
  
  /**
    * The method to request an IPerceptionFrameProvider associated with a registered PerceptionFrameProviderInfo.
    * @param frameProviderInfo The info specifying the desired IPerceptionFrameProvider.
    * @return The associated IPerceptionFrameProvider, or nullptr if there is no such registerd provider.
    */
  def getFrameProvider(frameProviderInfo: PerceptionFrameProviderInfo): IPerceptionFrameProvider = js.native
}
object IPerceptionFrameProviderManager {
  
  @scala.inline
  def apply(close: () => Unit, getFrameProvider: PerceptionFrameProviderInfo => IPerceptionFrameProvider): IPerceptionFrameProviderManager = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getFrameProvider = js.Any.fromFunction1(getFrameProvider))
    __obj.asInstanceOf[IPerceptionFrameProviderManager]
  }
  
  @scala.inline
  implicit class IPerceptionFrameProviderManagerOps[Self <: IPerceptionFrameProviderManager] (val x: Self) extends AnyVal {
    
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
    def setGetFrameProvider(value: PerceptionFrameProviderInfo => IPerceptionFrameProvider): Self = this.set("getFrameProvider", js.Any.fromFunction1(value))
  }
}
