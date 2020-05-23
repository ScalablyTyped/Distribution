package typings.winrtUwp.Windows.Devices.Perception.Provider

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A group of IPerceptionFrameProvider identifiers to be controlled together. */
trait PerceptionControlGroup extends js.Object {
  /** The id(s) of the IPerceptionFrameProvider(s) controlled by this group. */
  var frameProviderIds: IVectorView[String]
}

object PerceptionControlGroup {
  @scala.inline
  def apply(frameProviderIds: IVectorView[String]): PerceptionControlGroup = {
    val __obj = js.Dynamic.literal(frameProviderIds = frameProviderIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionControlGroup]
  }
}

