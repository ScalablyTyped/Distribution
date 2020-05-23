package typings.winrtUwp.Windows.Devices.Perception.Provider

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of PerceptionCorrelations describing multiple unique providers in a common coordinate frame. */
trait PerceptionCorrelationGroup extends js.Object {
  /** The collection of PerceptionCorrelations describing multiple unique providers in a common coordinate frame. */
  var relativeLocations: IVectorView[PerceptionCorrelation]
}

object PerceptionCorrelationGroup {
  @scala.inline
  def apply(relativeLocations: IVectorView[PerceptionCorrelation]): PerceptionCorrelationGroup = {
    val __obj = js.Dynamic.literal(relativeLocations = relativeLocations.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionCorrelationGroup]
  }
}

