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

