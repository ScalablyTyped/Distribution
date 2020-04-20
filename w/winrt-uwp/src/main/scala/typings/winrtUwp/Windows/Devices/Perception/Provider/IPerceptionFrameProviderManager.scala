package typings.winrtUwp.Windows.Devices.Perception.Provider

import typings.winrtUwp.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The IPerceptionFrameProviderManager is expected to provide any IPerceptionFrameProvider that has been registered via PerceptionFrameProviderManagerService::RegisterFrameProviderInfo(). */
trait IPerceptionFrameProviderManager extends IClosable {
  /**
    * The method to request an IPerceptionFrameProvider associated with a registered PerceptionFrameProviderInfo.
    * @param frameProviderInfo The info specifying the desired IPerceptionFrameProvider.
    * @return The associated IPerceptionFrameProvider, or nullptr if there is no such registerd provider.
    */
  def getFrameProvider(frameProviderInfo: PerceptionFrameProviderInfo): IPerceptionFrameProvider
}

object IPerceptionFrameProviderManager {
  @scala.inline
  def apply(close: () => Unit, getFrameProvider: PerceptionFrameProviderInfo => IPerceptionFrameProvider): IPerceptionFrameProviderManager = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getFrameProvider = js.Any.fromFunction1(getFrameProvider))
    __obj.asInstanceOf[IPerceptionFrameProviderManager]
  }
}

