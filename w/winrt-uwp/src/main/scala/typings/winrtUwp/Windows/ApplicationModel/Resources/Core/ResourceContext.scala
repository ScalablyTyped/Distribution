package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IObservableMap
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates all of the factors ( ResourceQualifier s) that might affect resource selection. */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext")
@js.native
/** Creates a cloned ResourceContext object. */
class ResourceContext () extends js.Object {
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

/* static members */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext")
@js.native
object ResourceContext extends js.Object {
  /**
    * Creates a new ResourceContext that matches a supplied set of qualifiers.
    * @param result The list of qualifiers to be matched.
    * @return The new ResourceContext .
    */
  def createMatchingContext(result: IIterable[ResourceQualifier]): ResourceContext = js.native
  /**
    * Gets a default ResourceContext associated with the current view for the currently running application.
    * @return The default context associated with the current view.
    */
  def getForCurrentView(): ResourceContext = js.native
  /**
    * Gets a default ResourceContext not associated with any view.
    * @return A default ResourceContext not associated with any view.
    */
  def getForViewIndependentUse(): ResourceContext = js.native
  /** Removes any qualifier overrides from default contexts of all views across the app. */
  def resetGlobalQualifierValues(): Unit = js.native
  /**
    * Removes qualifier overrides for the specified qualifiers from default contexts of all views across the app.
    * @param qualifierNames The names of the qualifiers to be reset.
    */
  def resetGlobalQualifierValues(qualifierNames: IIterable[String]): Unit = js.native
  /**
    * Applies a single qualifier value override to default contexts of all views for the current app.
    * @param key The name of the qualifier to override.
    * @param value The override value to set.
    */
  def setGlobalQualifierValue(key: String, value: String): Unit = js.native
  /**
    * Applies a single qualifier value override to default contexts of all views for the current app, and specifies the persistence of the override.
    * @param key The name of the qualifier to override.
    * @param value The override value to set.
    * @param persistence The persistence of the override value.
    */
  def setGlobalQualifierValue(key: String, value: String, persistence: ResourceQualifierPersistence): Unit = js.native
}

