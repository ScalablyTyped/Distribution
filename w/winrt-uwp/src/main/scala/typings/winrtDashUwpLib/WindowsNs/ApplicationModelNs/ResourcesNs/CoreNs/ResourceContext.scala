package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates all of the factors ( ResourceQualifier s) that might affect resource selection. */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext")
@js.native
/** Creates a cloned ResourceContext object. */
class ResourceContext () extends js.Object {
  /** Gets or sets the language qualifier for this context. */
  var languages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets a writable, observable map of all supported qualifiers, indexed by name. */
  var qualifierValues: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IObservableMap[java.lang.String, java.lang.String] = js.native
  /**
    * Overrides the qualifier values supplied by this context to match a specified list of resolved ResourceQualifier s. Typically the resolved ResourceQualifiers are associated with a resource that was looked up earlier.
    * @param result The ResourceQualifier s to be applied to the context.
    */
  def overrideToMatch(result: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[ResourceQualifier]): scala.Unit = js.native
  /** Resets the overridden values for all qualifiers on the given ResourceContext instance. */
  def reset(): scala.Unit = js.native
  /**
    * Resets the overridden values for the specified qualifiers on the given ResourceContext instance.
    * @param qualifierNames The names of the qualifiers to be reset.
    */
  def reset(qualifierNames: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]): scala.Unit = js.native
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
  def createMatchingContext(
    result: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[
      winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceQualifier
    ]
  ): winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceContext = js.native
  /**
    * Gets a default ResourceContext associated with the current view for the currently running application.
    * @return The default context associated with the current view.
    */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceContext = js.native
  /**
    * Gets a default ResourceContext not associated with any view.
    * @return A default ResourceContext not associated with any view.
    */
  def getForViewIndependentUse(): winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceContext = js.native
  /** Removes any qualifier overrides from default contexts of all views across the app. */
  def resetGlobalQualifierValues(): scala.Unit = js.native
  /**
    * Removes qualifier overrides for the specified qualifiers from default contexts of all views across the app.
    * @param qualifierNames The names of the qualifiers to be reset.
    */
  def resetGlobalQualifierValues(qualifierNames: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]): scala.Unit = js.native
  /**
    * Applies a single qualifier value override to default contexts of all views for the current app.
    * @param key The name of the qualifier to override.
    * @param value The override value to set.
    */
  def setGlobalQualifierValue(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * Applies a single qualifier value override to default contexts of all views for the current app, and specifies the persistence of the override.
    * @param key The name of the qualifier to override.
    * @param value The override value to set.
    * @param persistence The persistence of the override value.
    */
  def setGlobalQualifierValue(
    key: java.lang.String,
    value: java.lang.String,
    persistence: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceQualifierPersistence
  ): scala.Unit = js.native
}

