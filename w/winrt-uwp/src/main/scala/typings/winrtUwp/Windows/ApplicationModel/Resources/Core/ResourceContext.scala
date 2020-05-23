package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IObservableMap
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates all of the factors ( ResourceQualifier s) that might affect resource selection. */
@js.native
trait ResourceContext extends js.Object {
  /** Gets or sets the language qualifier for this context. */
  var languages: IVectorView[String] = js.native
  /** Gets a writable, observable map of all supported qualifiers, indexed by name. */
  var qualifierValues: IObservableMap[String, String] = js.native
  /**
    * Overrides the qualifier values supplied by this context to match a specified list of resolved ResourceQualifier s. Typically the resolved ResourceQualifiers are associated with a resource that was looked up earlier.
    * @param result The ResourceQualifier s to be applied to the context.
    */
  def overrideToMatch(result: IIterable[ResourceQualifier]): Unit = js.native
  /** Resets the overridden values for all qualifiers on the given ResourceContext instance. */
  def reset(): Unit = js.native
  /**
    * Resets the overridden values for the specified qualifiers on the given ResourceContext instance.
    * @param qualifierNames The names of the qualifiers to be reset.
    */
  def reset(qualifierNames: IIterable[String]): Unit = js.native
}

