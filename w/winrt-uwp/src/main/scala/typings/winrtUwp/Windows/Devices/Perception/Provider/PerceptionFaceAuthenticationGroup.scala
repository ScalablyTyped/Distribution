package typings.winrtUwp.Windows.Devices.Perception.Provider

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A group of unique identifiers specifying IPerceptionFrameProviders that share handlers for entering and exiting Face Authentication mode. */
trait PerceptionFaceAuthenticationGroup extends js.Object {
  /** The id(s) of the IPerceptionFrameProvider(s) referenced by this group. */
  var frameProviderIds: IVectorView[String]
}

object PerceptionFaceAuthenticationGroup {
  @scala.inline
  def apply(frameProviderIds: IVectorView[String]): PerceptionFaceAuthenticationGroup = {
    val __obj = js.Dynamic.literal(frameProviderIds = frameProviderIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionFaceAuthenticationGroup]
  }
}

