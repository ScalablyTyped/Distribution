package typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Widget extends js.Object {
  var _links: js.Any
  /**
    * Refers to the allowed sizes for the widget. This gets populated when user wants to configure the widget
    */
  var allowedSizes: js.Array[WidgetSize]
  /**
    * Refers to unique identifier of a feature artifact. Used for pinning+unpinning a specific artifact.
    */
  var artifactId: String
  var configurationContributionId: String
  var configurationContributionRelativeId: String
  var contentUri: String
  /**
    * The id of the underlying contribution defining the supplied Widget Configuration.
    */
  var contributionId: String
  /**
    * Optional partial dashboard content, to support exchanging dashboard-level version ETag for widget-level APIs
    */
  var dashboard: Dashboard
  var eTag: String
  var id: String
  var isEnabled: Boolean
  var isNameConfigurable: Boolean
  var lightboxOptions: LightboxOptions
  var loadingImageUrl: String
  var name: String
  var position: WidgetPosition
  var settings: String
  var settingsVersion: SemanticVersion
  var size: WidgetSize
  var typeId: String
  var url: String
}

object Widget {
  @scala.inline
  def apply(
    _links: js.Any,
    allowedSizes: js.Array[WidgetSize],
    artifactId: String,
    configurationContributionId: String,
    configurationContributionRelativeId: String,
    contentUri: String,
    contributionId: String,
    dashboard: Dashboard,
    eTag: String,
    id: String,
    isEnabled: Boolean,
    isNameConfigurable: Boolean,
    lightboxOptions: LightboxOptions,
    loadingImageUrl: String,
    name: String,
    position: WidgetPosition,
    settings: String,
    settingsVersion: SemanticVersion,
    size: WidgetSize,
    typeId: String,
    url: String
  ): Widget = {
    val __obj = js.Dynamic.literal(_links = _links, allowedSizes = allowedSizes, artifactId = artifactId, configurationContributionId = configurationContributionId, configurationContributionRelativeId = configurationContributionRelativeId, contentUri = contentUri, contributionId = contributionId, dashboard = dashboard, eTag = eTag, id = id, isEnabled = isEnabled, isNameConfigurable = isNameConfigurable, lightboxOptions = lightboxOptions, loadingImageUrl = loadingImageUrl, name = name, position = position, settings = settings, settingsVersion = settingsVersion, size = size, typeId = typeId, url = url)
  
    __obj.asInstanceOf[Widget]
  }
}

