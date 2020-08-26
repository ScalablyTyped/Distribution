package typings.vsoNodeApi.dashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Widget extends js.Object {
  var _links: js.Any = js.native
  /**
    * Refers to the allowed sizes for the widget. This gets populated when user wants to configure the widget
    */
  var allowedSizes: js.Array[WidgetSize] = js.native
  /**
    * Refers to unique identifier of a feature artifact. Used for pinning+unpinning a specific artifact.
    */
  var artifactId: String = js.native
  var configurationContributionId: String = js.native
  var configurationContributionRelativeId: String = js.native
  var contentUri: String = js.native
  /**
    * The id of the underlying contribution defining the supplied Widget Configuration.
    */
  var contributionId: String = js.native
  /**
    * Optional partial dashboard content, to support exchanging dashboard-level version ETag for widget-level APIs
    */
  var dashboard: Dashboard = js.native
  var eTag: String = js.native
  var id: String = js.native
  var isEnabled: Boolean = js.native
  var isNameConfigurable: Boolean = js.native
  var lightboxOptions: LightboxOptions = js.native
  var loadingImageUrl: String = js.native
  var name: String = js.native
  var position: WidgetPosition = js.native
  var settings: String = js.native
  var settingsVersion: SemanticVersion = js.native
  var size: WidgetSize = js.native
  var typeId: String = js.native
  var url: String = js.native
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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], allowedSizes = allowedSizes.asInstanceOf[js.Any], artifactId = artifactId.asInstanceOf[js.Any], configurationContributionId = configurationContributionId.asInstanceOf[js.Any], configurationContributionRelativeId = configurationContributionRelativeId.asInstanceOf[js.Any], contentUri = contentUri.asInstanceOf[js.Any], contributionId = contributionId.asInstanceOf[js.Any], dashboard = dashboard.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isNameConfigurable = isNameConfigurable.asInstanceOf[js.Any], lightboxOptions = lightboxOptions.asInstanceOf[js.Any], loadingImageUrl = loadingImageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], settingsVersion = settingsVersion.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Widget]
  }
  @scala.inline
  implicit class WidgetOps[Self <: Widget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedSizesVarargs(value: WidgetSize*): Self = this.set("allowedSizes", js.Array(value :_*))
    @scala.inline
    def setAllowedSizes(value: js.Array[WidgetSize]): Self = this.set("allowedSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtifactId(value: String): Self = this.set("artifactId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationContributionId(value: String): Self = this.set("configurationContributionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationContributionRelativeId(value: String): Self = this.set("configurationContributionRelativeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentUri(value: String): Self = this.set("contentUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setContributionId(value: String): Self = this.set("contributionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDashboard(value: Dashboard): Self = this.set("dashboard", value.asInstanceOf[js.Any])
    @scala.inline
    def setETag(value: String): Self = this.set("eTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNameConfigurable(value: Boolean): Self = this.set("isNameConfigurable", value.asInstanceOf[js.Any])
    @scala.inline
    def setLightboxOptions(value: LightboxOptions): Self = this.set("lightboxOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadingImageUrl(value: String): Self = this.set("loadingImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: WidgetPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: String): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettingsVersion(value: SemanticVersion): Self = this.set("settingsVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: WidgetSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeId(value: String): Self = this.set("typeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

