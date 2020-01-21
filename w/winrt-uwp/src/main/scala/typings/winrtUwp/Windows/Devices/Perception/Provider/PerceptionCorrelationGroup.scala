package typings.winrtUwp.Windows.Devices.Perception.Provider

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of PerceptionCorrelations describing multiple unique providers in a common coordinate frame. */
@JSGlobal("Windows.Devices.Perception.Provider.PerceptionCorrelationGroup")
@js.native
class PerceptionCorrelationGroup protected () extends js.Object {
  /**
    * Initializes a new PerceptionCorrelationGroup from a collection of one or more PerceptionCorrelation objects describing multiple providers in a common coordinate frame.
    * @param relativeLocations The collection of PerceptionCorrelations describing multiple providers in a common coordinate frame.
    */
  def this(relativeLocations: IIterable[PerceptionCorrelation]) = this()
  /** The collection of PerceptionCorrelations describing multiple unique providers in a common coordinate frame. */
  var relativeLocations: IVectorView[PerceptionCorrelation] = js.native
}

