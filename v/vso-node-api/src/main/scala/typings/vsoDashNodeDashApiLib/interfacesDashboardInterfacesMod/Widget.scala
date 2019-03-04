package typings
package vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod

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
  var artifactId: java.lang.String
  var configurationContributionId: java.lang.String
  var configurationContributionRelativeId: java.lang.String
  var contentUri: java.lang.String
  /**
    * The id of the underlying contribution defining the supplied Widget Configuration.
    */
  var contributionId: java.lang.String
  /**
    * Optional partial dashboard content, to support exchanging dashboard-level version ETag for widget-level APIs
    */
  var dashboard: Dashboard
  var eTag: java.lang.String
  var id: java.lang.String
  var isEnabled: scala.Boolean
  var isNameConfigurable: scala.Boolean
  var lightboxOptions: LightboxOptions
  var loadingImageUrl: java.lang.String
  var name: java.lang.String
  var position: WidgetPosition
  var settings: java.lang.String
  var settingsVersion: SemanticVersion
  var size: WidgetSize
  var typeId: java.lang.String
  var url: java.lang.String
}

object Widget {
  @scala.inline
  def apply(
    _links: js.Any,
    allowedSizes: js.Array[WidgetSize],
    artifactId: java.lang.String,
    configurationContributionId: java.lang.String,
    configurationContributionRelativeId: java.lang.String,
    contentUri: java.lang.String,
    contributionId: java.lang.String,
    dashboard: Dashboard,
    eTag: java.lang.String,
    id: java.lang.String,
    isEnabled: scala.Boolean,
    isNameConfigurable: scala.Boolean,
    lightboxOptions: LightboxOptions,
    loadingImageUrl: java.lang.String,
    name: java.lang.String,
    position: WidgetPosition,
    settings: java.lang.String,
    settingsVersion: SemanticVersion,
    size: WidgetSize,
    typeId: java.lang.String,
    url: java.lang.String
  ): Widget = {
    val __obj = js.Dynamic.literal(_links = _links, allowedSizes = allowedSizes, artifactId = artifactId, configurationContributionId = configurationContributionId, configurationContributionRelativeId = configurationContributionRelativeId, contentUri = contentUri, contributionId = contributionId, dashboard = dashboard, eTag = eTag, id = id, isEnabled = isEnabled, isNameConfigurable = isNameConfigurable, lightboxOptions = lightboxOptions, loadingImageUrl = loadingImageUrl, name = name, position = position, settings = settings, settingsVersion = settingsVersion, size = size, typeId = typeId, url = url)
  
    __obj.asInstanceOf[Widget]
  }
}

