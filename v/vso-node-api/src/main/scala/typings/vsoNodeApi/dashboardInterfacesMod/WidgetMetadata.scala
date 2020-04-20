package typings.vsoNodeApi.dashboardInterfacesMod

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
  var analyticsServiceRequired: Boolean
  /**
    * Resource for an icon in the widget catalog.
    */
  var catalogIconUrl: String
  /**
    * Opt-in URL string pointing at widget information. Defaults to extension marketplace URL if omitted
    */
  var catalogInfoUrl: String
  /**
    * The id of the underlying contribution defining the supplied Widget custom configuration UI. Null if custom configuration UI is not available.
    */
  var configurationContributionId: String
  /**
    * The relative id of the underlying contribution defining the supplied Widget custom configuration UI. Null if custom configuration UI is not available.
    */
  var configurationContributionRelativeId: String
  /**
    * Indicates if the widget requires configuration before being added to dashboard.
    */
  var configurationRequired: Boolean
  /**
    * Uri for the widget content to be loaded from .
    */
  var contentUri: String
  /**
    * The id of the underlying contribution defining the supplied Widget.
    */
  var contributionId: String
  /**
    * Optional default settings to be copied into widget settings.
    */
  var defaultSettings: String
  /**
    * Summary information describing the widget.
    */
  var description: String
  /**
    * Widgets can be disabled by the app store.  We'll need to gracefully handle for: - persistence (Allow) - Requests (Tag as disabled, and provide context)
    */
  var isEnabled: Boolean
  /**
    * Opt-out boolean that indicates if the widget supports widget name/title configuration. Widgets ignoring the name should set it to false in the manifest.
    */
  var isNameConfigurable: Boolean
  /**
    * Opt-out boolean indicating if the widget is hidden from the catalog. Commonly, this is used to allow developers to disable creation of a deprecated widget. A widget must have a functional default state, or have a configuration experience, in order to be visible from the catalog.
    */
  var isVisibleFromCatalog: Boolean
  /**
    * Opt-in properties for customizing widget presentation in a "lightbox" dialog.
    */
  var lightboxOptions: LightboxOptions
  /**
    * Resource for a loading placeholder image on dashboard
    */
  var loadingImageUrl: String
  /**
    * User facing name of the widget type. Each widget must use a unique value here.
    */
  var name: String
  /**
    * Publisher Name of this kind of widget.
    */
  var publisherName: String
  /**
    * Data contract required for the widget to function and to work in its container.
    */
  var supportedScopes: js.Array[WidgetScope]
  /**
    * Contribution target IDs
    */
  var targets: js.Array[String]
  /**
    * Deprecated: locally unique developer-facing id of this kind of widget. ContributionId provides a globally unique identifier for widget types.
    */
  var typeId: String
}

object WidgetMetadata {
  @scala.inline
  def apply(
    allowedSizes: js.Array[WidgetSize],
    analyticsServiceRequired: Boolean,
    catalogIconUrl: String,
    catalogInfoUrl: String,
    configurationContributionId: String,
    configurationContributionRelativeId: String,
    configurationRequired: Boolean,
    contentUri: String,
    contributionId: String,
    defaultSettings: String,
    description: String,
    isEnabled: Boolean,
    isNameConfigurable: Boolean,
    isVisibleFromCatalog: Boolean,
    lightboxOptions: LightboxOptions,
    loadingImageUrl: String,
    name: String,
    publisherName: String,
    supportedScopes: js.Array[WidgetScope],
    targets: js.Array[String],
    typeId: String
  ): WidgetMetadata = {
    val __obj = js.Dynamic.literal(allowedSizes = allowedSizes.asInstanceOf[js.Any], analyticsServiceRequired = analyticsServiceRequired.asInstanceOf[js.Any], catalogIconUrl = catalogIconUrl.asInstanceOf[js.Any], catalogInfoUrl = catalogInfoUrl.asInstanceOf[js.Any], configurationContributionId = configurationContributionId.asInstanceOf[js.Any], configurationContributionRelativeId = configurationContributionRelativeId.asInstanceOf[js.Any], configurationRequired = configurationRequired.asInstanceOf[js.Any], contentUri = contentUri.asInstanceOf[js.Any], contributionId = contributionId.asInstanceOf[js.Any], defaultSettings = defaultSettings.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isNameConfigurable = isNameConfigurable.asInstanceOf[js.Any], isVisibleFromCatalog = isVisibleFromCatalog.asInstanceOf[js.Any], lightboxOptions = lightboxOptions.asInstanceOf[js.Any], loadingImageUrl = loadingImageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], supportedScopes = supportedScopes.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetMetadata]
  }
}

