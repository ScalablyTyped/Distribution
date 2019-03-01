package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The IPerceptionFrameProviderManager is expected to provide any IPerceptionFrameProvider that has been registered via PerceptionFrameProviderManagerService::RegisterFrameProviderInfo(). */
trait IPerceptionFrameProviderManager
  extends winrtDashUwpLib.WindowsNs.FoundationNs.IClosable {
  /**
    * The method to request an IPerceptionFrameProvider associated with a registered PerceptionFrameProviderInfo.
    * @param frameProviderInfo The info specifying the desired IPerceptionFrameProvider.
    * @return The associated IPerceptionFrameProvider, or nullptr if there is no such registerd provider.
    */
  def getFrameProvider(frameProviderInfo: PerceptionFrameProviderInfo): IPerceptionFrameProvider
}

object IPerceptionFrameProviderManager {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    getFrameProvider: js.Function1[PerceptionFrameProviderInfo, IPerceptionFrameProvider]
  ): IPerceptionFrameProviderManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("getFrameProvider")(getFrameProvider)
    __obj.asInstanceOf[IPerceptionFrameProviderManager]
  }
}

