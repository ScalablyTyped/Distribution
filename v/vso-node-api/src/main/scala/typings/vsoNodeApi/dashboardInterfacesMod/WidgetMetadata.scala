package typings.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetMetadata extends StObject {
  
  /**
    * Sizes supported by the Widget.
    */
  var allowedSizes: js.Array[WidgetSize] = js.native
  
  /**
    * Opt-in boolean that indicates if the widget requires the Analytics Service to function. Widgets requiring the analytics service are hidden from the catalog if the Analytics Service is not available.
    */
  var analyticsServiceRequired: Boolean = js.native
  
  /**
    * Resource for an icon in the widget catalog.
    */
  var catalogIconUrl: String = js.native
  
  /**
    * Opt-in URL string pointing at widget information. Defaults to extension marketplace URL if omitted
    */
  var catalogInfoUrl: String = js.native
  
  /**
    * The id of the underlying contribution defining the supplied Widget custom configuration UI. Null if custom configuration UI is not available.
    */
  var configurationContributionId: String = js.native
  
  /**
    * The relative id of the underlying contribution defining the supplied Widget custom configuration UI. Null if custom configuration UI is not available.
    */
  var configurationContributionRelativeId: String = js.native
  
  /**
    * Indicates if the widget requires configuration before being added to dashboard.
    */
  var configurationRequired: Boolean = js.native
  
  /**
    * Uri for the widget content to be loaded from .
    */
  var contentUri: String = js.native
  
  /**
    * The id of the underlying contribution defining the supplied Widget.
    */
  var contributionId: String = js.native
  
  /**
    * Optional default settings to be copied into widget settings.
    */
  var defaultSettings: String = js.native
  
  /**
    * Summary information describing the widget.
    */
  var description: String = js.native
  
  /**
    * Widgets can be disabled by the app store.  We'll need to gracefully handle for: - persistence (Allow) - Requests (Tag as disabled, and provide context)
    */
  var isEnabled: Boolean = js.native
  
  /**
    * Opt-out boolean that indicates if the widget supports widget name/title configuration. Widgets ignoring the name should set it to false in the manifest.
    */
  var isNameConfigurable: Boolean = js.native
  
  /**
    * Opt-out boolean indicating if the widget is hidden from the catalog. Commonly, this is used to allow developers to disable creation of a deprecated widget. A widget must have a functional default state, or have a configuration experience, in order to be visible from the catalog.
    */
  var isVisibleFromCatalog: Boolean = js.native
  
  /**
    * Opt-in properties for customizing widget presentation in a "lightbox" dialog.
    */
  var lightboxOptions: LightboxOptions = js.native
  
  /**
    * Resource for a loading placeholder image on dashboard
    */
  var loadingImageUrl: String = js.native
  
  /**
    * User facing name of the widget type. Each widget must use a unique value here.
    */
  var name: String = js.native
  
  /**
    * Publisher Name of this kind of widget.
    */
  var publisherName: String = js.native
  
  /**
    * Data contract required for the widget to function and to work in its container.
    */
  var supportedScopes: js.Array[WidgetScope] = js.native
  
  /**
    * Contribution target IDs
    */
  var targets: js.Array[String] = js.native
  
  /**
    * Deprecated: locally unique developer-facing id of this kind of widget. ContributionId provides a globally unique identifier for widget types.
    */
  var typeId: String = js.native
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
  
  @scala.inline
  implicit class WidgetMetadataMutableBuilder[Self <: WidgetMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedSizes(value: js.Array[WidgetSize]): Self = StObject.set(x, "allowedSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedSizesVarargs(value: WidgetSize*): Self = StObject.set(x, "allowedSizes", js.Array(value :_*))
    
    @scala.inline
    def setAnalyticsServiceRequired(value: Boolean): Self = StObject.set(x, "analyticsServiceRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIconUrl(value: String): Self = StObject.set(x, "catalogIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogInfoUrl(value: String): Self = StObject.set(x, "catalogInfoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationContributionId(value: String): Self = StObject.set(x, "configurationContributionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationContributionRelativeId(value: String): Self = StObject.set(x, "configurationContributionRelativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationRequired(value: Boolean): Self = StObject.set(x, "configurationRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUri(value: String): Self = StObject.set(x, "contentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributionId(value: String): Self = StObject.set(x, "contributionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSettings(value: String): Self = StObject.set(x, "defaultSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNameConfigurable(value: Boolean): Self = StObject.set(x, "isNameConfigurable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisibleFromCatalog(value: Boolean): Self = StObject.set(x, "isVisibleFromCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightboxOptions(value: LightboxOptions): Self = StObject.set(x, "lightboxOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingImageUrl(value: String): Self = StObject.set(x, "loadingImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedScopes(value: js.Array[WidgetScope]): Self = StObject.set(x, "supportedScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedScopesVarargs(value: WidgetScope*): Self = StObject.set(x, "supportedScopes", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value :_*))
    
    @scala.inline
    def setTypeId(value: String): Self = StObject.set(x, "typeId", value.asInstanceOf[js.Any])
  }
}
