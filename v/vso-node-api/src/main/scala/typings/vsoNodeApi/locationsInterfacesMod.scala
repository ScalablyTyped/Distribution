package typings.vsoNodeApi

import typings.std.Date
import typings.vsoNodeApi.anon.EnumValuesAccount
import typings.vsoNodeApi.anon.EnumValuesAssigned
import typings.vsoNodeApi.anon.EnumValuesContext
import typings.vsoNodeApi.identitiesInterfacesMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationsInterfacesMod {
  
  @js.native
  sealed trait InheritLevel extends StObject
  @JSImport("vso-node-api/interfaces/LocationsInterfaces", "InheritLevel")
  @js.native
  object InheritLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InheritLevel with Double] = js.native
    
    @js.native
    sealed trait Account extends InheritLevel
    /* 2 */ val Account: typings.vsoNodeApi.locationsInterfacesMod.InheritLevel.Account with Double = js.native
    
    @js.native
    sealed trait All extends InheritLevel
    /* 7 */ val All: typings.vsoNodeApi.locationsInterfacesMod.InheritLevel.All with Double = js.native
    
    @js.native
    sealed trait Collection extends InheritLevel
    /* 4 */ val Collection: typings.vsoNodeApi.locationsInterfacesMod.InheritLevel.Collection with Double = js.native
    
    @js.native
    sealed trait Deployment extends InheritLevel
    /* 1 */ val Deployment: typings.vsoNodeApi.locationsInterfacesMod.InheritLevel.Deployment with Double = js.native
    
    @js.native
    sealed trait None extends InheritLevel
    /* 0 */ val None: typings.vsoNodeApi.locationsInterfacesMod.InheritLevel.None with Double = js.native
  }
  
  @js.native
  sealed trait RelativeToSetting extends StObject
  @JSImport("vso-node-api/interfaces/LocationsInterfaces", "RelativeToSetting")
  @js.native
  object RelativeToSetting extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RelativeToSetting with Double] = js.native
    
    @js.native
    sealed trait Context extends RelativeToSetting
    /* 0 */ val Context: typings.vsoNodeApi.locationsInterfacesMod.RelativeToSetting.Context with Double = js.native
    
    @js.native
    sealed trait FullyQualified extends RelativeToSetting
    /* 3 */ val FullyQualified: typings.vsoNodeApi.locationsInterfacesMod.RelativeToSetting.FullyQualified with Double = js.native
    
    @js.native
    sealed trait WebApplication extends RelativeToSetting
    /* 2 */ val WebApplication: typings.vsoNodeApi.locationsInterfacesMod.RelativeToSetting.WebApplication with Double = js.native
  }
  
  @js.native
  sealed trait ServiceStatus extends StObject
  @JSImport("vso-node-api/interfaces/LocationsInterfaces", "ServiceStatus")
  @js.native
  object ServiceStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ServiceStatus with Double] = js.native
    
    @js.native
    sealed trait Active extends ServiceStatus
    /* 1 */ val Active: typings.vsoNodeApi.locationsInterfacesMod.ServiceStatus.Active with Double = js.native
    
    @js.native
    sealed trait Assigned extends ServiceStatus
    /* 0 */ val Assigned: typings.vsoNodeApi.locationsInterfacesMod.ServiceStatus.Assigned with Double = js.native
    
    @js.native
    sealed trait Moving extends ServiceStatus
    /* 2 */ val Moving: typings.vsoNodeApi.locationsInterfacesMod.ServiceStatus.Moving with Double = js.native
  }
  
  object TypeInfo {
    
    @JSImport("vso-node-api/interfaces/LocationsInterfaces", "TypeInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vso-node-api/interfaces/LocationsInterfaces", "TypeInfo.ConnectionData")
    @js.native
    def ConnectionData: js.Any = js.native
    @scala.inline
    def ConnectionData_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConnectionData")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/LocationsInterfaces", "TypeInfo.InheritLevel")
    @js.native
    def InheritLevel: EnumValuesAccount = js.native
    @scala.inline
    def InheritLevel_=(x: EnumValuesAccount): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InheritLevel")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/LocationsInterfaces", "TypeInfo.LocationServiceData")
    @js.native
    def LocationServiceData: js.Any = js.native
    @scala.inline
    def LocationServiceData_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocationServiceData")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/LocationsInterfaces", "TypeInfo.RelativeToSetting")
    @js.native
    def RelativeToSetting: EnumValuesContext = js.native
    @scala.inline
    def RelativeToSetting_=(x: EnumValuesContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RelativeToSetting")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/LocationsInterfaces", "TypeInfo.ServiceDefinition")
    @js.native
    def ServiceDefinition: js.Any = js.native
    @scala.inline
    def ServiceDefinition_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServiceDefinition")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/LocationsInterfaces", "TypeInfo.ServiceStatus")
    @js.native
    def ServiceStatus: EnumValuesAssigned = js.native
    @scala.inline
    def ServiceStatus_=(x: EnumValuesAssigned): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServiceStatus")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AccessMapping extends StObject {
    
    var accessPoint: String = js.native
    
    var displayName: String = js.native
    
    var moniker: String = js.native
    
    /**
      * The service which owns this access mapping e.g. TFS, ELS, etc.
      */
    var serviceOwner: String = js.native
    
    /**
      * Part of the access mapping which applies context after the access point of the server.
      */
    var virtualDirectory: String = js.native
  }
  object AccessMapping {
    
    @scala.inline
    def apply(
      accessPoint: String,
      displayName: String,
      moniker: String,
      serviceOwner: String,
      virtualDirectory: String
    ): AccessMapping = {
      val __obj = js.Dynamic.literal(accessPoint = accessPoint.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], moniker = moniker.asInstanceOf[js.Any], serviceOwner = serviceOwner.asInstanceOf[js.Any], virtualDirectory = virtualDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessMapping]
    }
    
    @scala.inline
    implicit class AccessMappingMutableBuilder[Self <: AccessMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessPoint(value: String): Self = StObject.set(x, "accessPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoniker(value: String): Self = StObject.set(x, "moniker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceOwner(value: String): Self = StObject.set(x, "serviceOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualDirectory(value: String): Self = StObject.set(x, "virtualDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConnectionData extends StObject {
    
    /**
      * The Id of the authenticated user who made this request. More information about the user can be obtained by passing this Id to the Identity service
      */
    var authenticatedUser: Identity = js.native
    
    /**
      * The Id of the authorized user who made this request. More information about the user can be obtained by passing this Id to the Identity service
      */
    var authorizedUser: Identity = js.native
    
    /**
      * The id for the server.
      */
    var deploymentId: String = js.native
    
    /**
      * The instance id for this host.
      */
    var instanceId: String = js.native
    
    /**
      * The last user access for this instance.  Null if not requested specifically.
      */
    var lastUserAccess: Date = js.native
    
    /**
      * Data that the location service holds.
      */
    var locationServiceData: LocationServiceData = js.native
    
    /**
      * The virtual directory of the host we are talking to.
      */
    var webApplicationRelativeDirectory: String = js.native
  }
  object ConnectionData {
    
    @scala.inline
    def apply(
      authenticatedUser: Identity,
      authorizedUser: Identity,
      deploymentId: String,
      instanceId: String,
      lastUserAccess: Date,
      locationServiceData: LocationServiceData,
      webApplicationRelativeDirectory: String
    ): ConnectionData = {
      val __obj = js.Dynamic.literal(authenticatedUser = authenticatedUser.asInstanceOf[js.Any], authorizedUser = authorizedUser.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], lastUserAccess = lastUserAccess.asInstanceOf[js.Any], locationServiceData = locationServiceData.asInstanceOf[js.Any], webApplicationRelativeDirectory = webApplicationRelativeDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionData]
    }
    
    @scala.inline
    implicit class ConnectionDataMutableBuilder[Self <: ConnectionData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthenticatedUser(value: Identity): Self = StObject.set(x, "authenticatedUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizedUser(value: Identity): Self = StObject.set(x, "authorizedUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUserAccess(value: Date): Self = StObject.set(x, "lastUserAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationServiceData(value: LocationServiceData): Self = StObject.set(x, "locationServiceData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebApplicationRelativeDirectory(value: String): Self = StObject.set(x, "webApplicationRelativeDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocationMapping extends StObject {
    
    var accessMappingMoniker: String = js.native
    
    var location: String = js.native
  }
  object LocationMapping {
    
    @scala.inline
    def apply(accessMappingMoniker: String, location: String): LocationMapping = {
      val __obj = js.Dynamic.literal(accessMappingMoniker = accessMappingMoniker.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationMapping]
    }
    
    @scala.inline
    implicit class LocationMappingMutableBuilder[Self <: LocationMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessMappingMoniker(value: String): Self = StObject.set(x, "accessMappingMoniker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocationServiceData extends StObject {
    
    /**
      * Data about the access mappings contained by this location service.
      */
    var accessMappings: js.Array[AccessMapping] = js.native
    
    /**
      * Data that the location service holds.
      */
    var clientCacheFresh: Boolean = js.native
    
    /**
      * The time to live on the location service cache.
      */
    var clientCacheTimeToLive: Double = js.native
    
    /**
      * The default access mapping moniker for the server.
      */
    var defaultAccessMappingMoniker: String = js.native
    
    /**
      * The obsolete id for the last change that took place on the server (use LastChangeId64).
      */
    var lastChangeId: Double = js.native
    
    /**
      * The non-truncated 64-bit id for the last change that took place on the server.
      */
    var lastChangeId64: Double = js.native
    
    /**
      * Data about the service definitions contained by this location service.
      */
    var serviceDefinitions: js.Array[ServiceDefinition] = js.native
    
    /**
      * The identifier of the deployment which is hosting this location data (e.g. SPS, TFS, ELS, Napa, etc.)
      */
    var serviceOwner: String = js.native
  }
  object LocationServiceData {
    
    @scala.inline
    def apply(
      accessMappings: js.Array[AccessMapping],
      clientCacheFresh: Boolean,
      clientCacheTimeToLive: Double,
      defaultAccessMappingMoniker: String,
      lastChangeId: Double,
      lastChangeId64: Double,
      serviceDefinitions: js.Array[ServiceDefinition],
      serviceOwner: String
    ): LocationServiceData = {
      val __obj = js.Dynamic.literal(accessMappings = accessMappings.asInstanceOf[js.Any], clientCacheFresh = clientCacheFresh.asInstanceOf[js.Any], clientCacheTimeToLive = clientCacheTimeToLive.asInstanceOf[js.Any], defaultAccessMappingMoniker = defaultAccessMappingMoniker.asInstanceOf[js.Any], lastChangeId = lastChangeId.asInstanceOf[js.Any], lastChangeId64 = lastChangeId64.asInstanceOf[js.Any], serviceDefinitions = serviceDefinitions.asInstanceOf[js.Any], serviceOwner = serviceOwner.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationServiceData]
    }
    
    @scala.inline
    implicit class LocationServiceDataMutableBuilder[Self <: LocationServiceData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessMappings(value: js.Array[AccessMapping]): Self = StObject.set(x, "accessMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessMappingsVarargs(value: AccessMapping*): Self = StObject.set(x, "accessMappings", js.Array(value :_*))
      
      @scala.inline
      def setClientCacheFresh(value: Boolean): Self = StObject.set(x, "clientCacheFresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientCacheTimeToLive(value: Double): Self = StObject.set(x, "clientCacheTimeToLive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultAccessMappingMoniker(value: String): Self = StObject.set(x, "defaultAccessMappingMoniker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastChangeId(value: Double): Self = StObject.set(x, "lastChangeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastChangeId64(value: Double): Self = StObject.set(x, "lastChangeId64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceDefinitions(value: js.Array[ServiceDefinition]): Self = StObject.set(x, "serviceDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceDefinitionsVarargs(value: ServiceDefinition*): Self = StObject.set(x, "serviceDefinitions", js.Array(value :_*))
      
      @scala.inline
      def setServiceOwner(value: String): Self = StObject.set(x, "serviceOwner", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourceAreaInfo extends StObject {
    
    var id: String = js.native
    
    var locationUrl: String = js.native
    
    var name: String = js.native
  }
  object ResourceAreaInfo {
    
    @scala.inline
    def apply(id: String, locationUrl: String, name: String): ResourceAreaInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], locationUrl = locationUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceAreaInfo]
    }
    
    @scala.inline
    implicit class ResourceAreaInfoMutableBuilder[Self <: ResourceAreaInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUrl(value: String): Self = StObject.set(x, "locationUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServiceDefinition extends StObject {
    
    var description: String = js.native
    
    var displayName: String = js.native
    
    var identifier: String = js.native
    
    var inheritLevel: InheritLevel = js.native
    
    var locationMappings: js.Array[LocationMapping] = js.native
    
    /**
      * Maximum api version that this resource supports (current server version for this resource). Copied from <c>ApiResourceLocation</c>.
      */
    var maxVersion: String = js.native
    
    /**
      * Minimum api version that this resource supports. Copied from <c>ApiResourceLocation</c>.
      */
    var minVersion: String = js.native
    
    var parentIdentifier: String = js.native
    
    var parentServiceType: String = js.native
    
    var properties: js.Any = js.native
    
    var relativePath: String = js.native
    
    var relativeToSetting: RelativeToSetting = js.native
    
    /**
      * The latest version of this resource location that is in "Release" (non-preview) mode. Copied from <c>ApiResourceLocation</c>.
      */
    var releasedVersion: String = js.native
    
    /**
      * The current resource version supported by this resource location. Copied from <c>ApiResourceLocation</c>.
      */
    var resourceVersion: Double = js.native
    
    /**
      * The service which owns this definition e.g. TFS, ELS, etc.
      */
    var serviceOwner: String = js.native
    
    var serviceType: String = js.native
    
    var status: ServiceStatus = js.native
    
    var toolId: String = js.native
  }
  object ServiceDefinition {
    
    @scala.inline
    def apply(
      description: String,
      displayName: String,
      identifier: String,
      inheritLevel: InheritLevel,
      locationMappings: js.Array[LocationMapping],
      maxVersion: String,
      minVersion: String,
      parentIdentifier: String,
      parentServiceType: String,
      properties: js.Any,
      relativePath: String,
      relativeToSetting: RelativeToSetting,
      releasedVersion: String,
      resourceVersion: Double,
      serviceOwner: String,
      serviceType: String,
      status: ServiceStatus,
      toolId: String
    ): ServiceDefinition = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], inheritLevel = inheritLevel.asInstanceOf[js.Any], locationMappings = locationMappings.asInstanceOf[js.Any], maxVersion = maxVersion.asInstanceOf[js.Any], minVersion = minVersion.asInstanceOf[js.Any], parentIdentifier = parentIdentifier.asInstanceOf[js.Any], parentServiceType = parentServiceType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any], relativeToSetting = relativeToSetting.asInstanceOf[js.Any], releasedVersion = releasedVersion.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], serviceOwner = serviceOwner.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], toolId = toolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceDefinition]
    }
    
    @scala.inline
    implicit class ServiceDefinitionMutableBuilder[Self <: ServiceDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritLevel(value: InheritLevel): Self = StObject.set(x, "inheritLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationMappings(value: js.Array[LocationMapping]): Self = StObject.set(x, "locationMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationMappingsVarargs(value: LocationMapping*): Self = StObject.set(x, "locationMappings", js.Array(value :_*))
      
      @scala.inline
      def setMaxVersion(value: String): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinVersion(value: String): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdentifier(value: String): Self = StObject.set(x, "parentIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentServiceType(value: String): Self = StObject.set(x, "parentServiceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeToSetting(value: RelativeToSetting): Self = StObject.set(x, "relativeToSetting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleasedVersion(value: String): Self = StObject.set(x, "releasedVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceVersion(value: Double): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceOwner(value: String): Self = StObject.set(x, "serviceOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: ServiceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolId(value: String): Self = StObject.set(x, "toolId", value.asInstanceOf[js.Any])
    }
  }
}
