package typings.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Widget extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: Widget](x: Self) {
    
    inline def setAllowedSizes(value: js.Array[WidgetSize]): Self = StObject.set(x, "allowedSizes", value.asInstanceOf[js.Any])
    
    inline def setAllowedSizesVarargs(value: WidgetSize*): Self = StObject.set(x, "allowedSizes", js.Array(value :_*))
    
    inline def setArtifactId(value: String): Self = StObject.set(x, "artifactId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationContributionId(value: String): Self = StObject.set(x, "configurationContributionId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationContributionRelativeId(value: String): Self = StObject.set(x, "configurationContributionRelativeId", value.asInstanceOf[js.Any])
    
    inline def setContentUri(value: String): Self = StObject.set(x, "contentUri", value.asInstanceOf[js.Any])
    
    inline def setContributionId(value: String): Self = StObject.set(x, "contributionId", value.asInstanceOf[js.Any])
    
    inline def setDashboard(value: Dashboard): Self = StObject.set(x, "dashboard", value.asInstanceOf[js.Any])
    
    inline def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsNameConfigurable(value: Boolean): Self = StObject.set(x, "isNameConfigurable", value.asInstanceOf[js.Any])
    
    inline def setLightboxOptions(value: LightboxOptions): Self = StObject.set(x, "lightboxOptions", value.asInstanceOf[js.Any])
    
    inline def setLoadingImageUrl(value: String): Self = StObject.set(x, "loadingImageUrl", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: WidgetPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: String): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsVersion(value: SemanticVersion): Self = StObject.set(x, "settingsVersion", value.asInstanceOf[js.Any])
    
    inline def setSize(value: WidgetSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTypeId(value: String): Self = StObject.set(x, "typeId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
