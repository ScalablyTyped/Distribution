package typings
package vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetMetadata extends js.Object {
  /**
    * Sizes supported by the Widget.
    */
  var allowedSizes: js.Array[WidgetSize]
  /**
    * Opt-in boolean that indicates if the widget requires the Analytics Service to function. Widgets requiring the analytics service are hidden from the catalog if the Analytics Service is not available.
    */
  var analyticsServiceRequired: scala.Boolean
  /**
    * Resource for an icon in the widget catalog.
    */
  var catalogIconUrl: java.lang.String
  /**
    * Opt-in URL string pointing at widget information. Defaults to extension marketplace URL if omitted
    */
  var catalogInfoUrl: java.lang.String
  /**
    * The id of the underlying contribution defining the supplied Widget custom configuration UI. Null if custom configuration UI is not available.
    */
  var configurationContributionId: java.lang.String
  /**
    * The relative id of the underlying contribution defining the supplied Widget custom configuration UI. Null if custom configuration UI is not available.
    */
  var configurationContributionRelativeId: java.lang.String
  /**
    * Indicates if the widget requires configuration before being added to dashboard.
    */
  var configurationRequired: scala.Boolean
  /**
    * Uri for the widget content to be loaded from .
    */
  var contentUri: java.lang.String
  /**
    * The id of the underlying contribution defining the supplied Widget.
    */
  var contributionId: java.lang.String
  /**
    * Optional default settings to be copied into widget settings.
    */
  var defaultSettings: java.lang.String
  /**
    * Summary information describing the widget.
    */
  var description: java.lang.String
  /**
    * Widgets can be disabled by the app store.  We'll need to gracefully handle for: - persistence (Allow) - Requests (Tag as disabled, and provide context)
    */
  var isEnabled: scala.Boolean
  /**
    * Opt-out boolean that indicates if the widget supports widget name/title configuration. Widgets ignoring the name should set it to false in the manifest.
    */
  var isNameConfigurable: scala.Boolean
  /**
    * Opt-out boolean indicating if the widget is hidden from the catalog. Commonly, this is used to allow developers to disable creation of a deprecated widget. A widget must have a functional default state, or have a configuration experience, in order to be visible from the catalog.
    */
  var isVisibleFromCatalog: scala.Boolean
  /**
    * Opt-in properties for customizing widget presentation in a "lightbox" dialog.
    */
  var lightboxOptions: LightboxOptions
  /**
    * Resource for a loading placeholder image on dashboard
    */
  var loadingImageUrl: java.lang.String
  /**
    * User facing name of the widget type. Each widget must use a unique value here.
    */
  var name: java.lang.String
  /**
    * Publisher Name of this kind of widget.
    */
  var publisherName: java.lang.String
  /**
    * Data contract required for the widget to function and to work in its container.
    */
  var supportedScopes: js.Array[WidgetScope]
  /**
    * Contribution target IDs
    */
  var targets: js.Array[java.lang.String]
  /**
    * Deprecated: locally unique developer-facing id of this kind of widget. ContributionId provides a globally unique identifier for widget types.
    */
  var typeId: java.lang.String
}

object WidgetMetadata {
  @scala.inline
  def apply(
    allowedSizes: js.Array[WidgetSize],
    analyticsServiceRequired: scala.Boolean,
    catalogIconUrl: java.lang.String,
    catalogInfoUrl: java.lang.String,
    configurationContributionId: java.lang.String,
    configurationContributionRelativeId: java.lang.String,
    configurationRequired: scala.Boolean,
    contentUri: java.lang.String,
    contributionId: java.lang.String,
    defaultSettings: java.lang.String,
    description: java.lang.String,
    isEnabled: scala.Boolean,
    isNameConfigurable: scala.Boolean,
    isVisibleFromCatalog: scala.Boolean,
    lightboxOptions: LightboxOptions,
    loadingImageUrl: java.lang.String,
    name: java.lang.String,
    publisherName: java.lang.String,
    supportedScopes: js.Array[WidgetScope],
    targets: js.Array[java.lang.String],
    typeId: java.lang.String
  ): WidgetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowedSizes")(allowedSizes)
    __obj.updateDynamic("analyticsServiceRequired")(analyticsServiceRequired)
    __obj.updateDynamic("catalogIconUrl")(catalogIconUrl)
    __obj.updateDynamic("catalogInfoUrl")(catalogInfoUrl)
    __obj.updateDynamic("configurationContributionId")(configurationContributionId)
    __obj.updateDynamic("configurationContributionRelativeId")(configurationContributionRelativeId)
    __obj.updateDynamic("configurationRequired")(configurationRequired)
    __obj.updateDynamic("contentUri")(contentUri)
    __obj.updateDynamic("contributionId")(contributionId)
    __obj.updateDynamic("defaultSettings")(defaultSettings)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("isNameConfigurable")(isNameConfigurable)
    __obj.updateDynamic("isVisibleFromCatalog")(isVisibleFromCatalog)
    __obj.updateDynamic("lightboxOptions")(lightboxOptions)
    __obj.updateDynamic("loadingImageUrl")(loadingImageUrl)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("publisherName")(publisherName)
    __obj.updateDynamic("supportedScopes")(supportedScopes)
    __obj.updateDynamic("targets")(targets)
    __obj.updateDynamic("typeId")(typeId)
    __obj.asInstanceOf[WidgetMetadata]
  }
}

