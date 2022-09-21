package typings.vsoNodeApi

import typings.vsoNodeApi.anon.EnumValuesAccount
import typings.vsoNodeApi.anon.EnumValuesAssigned
import typings.vsoNodeApi.anon.EnumValuesContext
import typings.vsoNodeApi.identitiesInterfacesMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationsInterfacesMod {
  
  @js.native
  sealed trait InheritLevel extends StObject
  @JSImport("vso-node-api/interfaces/LocationsInterfaces", "InheritLevel")
  @js.native
  object InheritLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InheritLevel & Double] = js.native
    
    @js.native
    sealed trait Account
      extends StObject
         with InheritLevel
    /* 2 */ val Account: typings.vsoNodeApi.locationsInterfacesMod.InheritLevel.Account & Double = js.native
    
    @js.native
    sealed trait All
      extends StObject
         with InheritLevel
    /* 7 */ val All: typings.vsoNodeApi.locationsInterfacesMod.InheritLevel.All & Double = js.native
    
    @js.native
    sealed trait Collection
      extends StObject
         with InheritLevel
    /* 4 */ val Collection: typings.vsoNodeApi.locationsInterfacesMod.InheritLevel.Collection & Double = js.native
    
    @js.native
    sealed trait Deployment
      extends StObject
         with InheritLevel
    /* 1 */ val Deployment: typings.vsoNodeApi.locationsInterfacesMod.InheritLevel.Deployment & Double = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with InheritLevel
    /* 0 */ val None: typings.vsoNodeApi.locationsInterfacesMod.InheritLevel.None & Double = js.native
  }
  
  @js.native
  sealed trait RelativeToSetting extends StObject
  @JSImport("vso-node-api/interfaces/LocationsInterfaces", "RelativeToSetting")
  @js.native
  object RelativeToSetting extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RelativeToSetting & Double] = js.native
    
    @js.native
    sealed trait Context
      extends StObject
         with RelativeToSetting
    /* 0 */ val Context: typings.vsoNodeApi.locationsInterfacesMod.RelativeToSetting.Context & Double = js.native
    
    @js.native
    sealed trait FullyQualified
      extends StObject
         with RelativeToSetting
    /* 3 */ val FullyQualified: typings.vsoNodeApi.locationsInterfacesMod.RelativeToSetting.FullyQualified & Double = js.native
    
    @js.native
    sealed trait WebApplication
      extends StObject
         with RelativeToSetting
    /* 2 */ val WebApplication: typings.vsoNodeApi.locationsInterfacesMod.RelativeToSetting.WebApplication & Double = js.native
  }
  
  @js.native
  sealed trait ServiceStatus extends StObject
  @JSImport("vso-node-api/interfaces/LocationsInterfaces", "ServiceStatus")
  @js.native
  object ServiceStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ServiceStatus & Double] = js.native
    
    @js.native
    sealed trait Active
      extends StObject
         with ServiceStatus
    /* 1 */ val Active: typings.vsoNodeApi.locationsInterfacesMod.ServiceStatus.Active & Double = js.native
    
    @js.native
    sealed trait Assigned
      extends StObject
         with ServiceStatus
    /* 0 */ val Assigned: typings.vsoNodeApi.locationsInterfacesMod.ServiceStatus.Assigned & Double = js.native
    
    @js.native
    sealed trait Moving
      extends StObject
         with ServiceStatus
    /* 2 */ val Moving: typings.vsoNodeApi.locationsInterfacesMod.ServiceStatus.Moving & Double = js.native
  }
  
  object TypeInfo {
    
    @JSImport("vso-node-api/interfaces/LocationsInterfaces", "TypeInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vso-node-api/interfaces/LocationsInterfaces", "TypeInfo.ConnectionData")
    @js.native
    def ConnectionData: Any = js.native
    inline def ConnectionData_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConnectionData")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/LocationsInterfaces", "TypeInfo.InheritLevel")
    @js.native
    def InheritLevel: EnumValuesAccount = js.native
    inline def InheritLevel_=(x: EnumValuesAccount): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InheritLevel")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/LocationsInterfaces", "TypeInfo.LocationServiceData")
    @js.native
    def LocationServiceData: Any = js.native
    inline def LocationServiceData_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocationServiceData")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/LocationsInterfaces", "TypeInfo.RelativeToSetting")
    @js.native
    def RelativeToSetting: EnumValuesContext = js.native
    inline def RelativeToSetting_=(x: EnumValuesContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RelativeToSetting")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/LocationsInterfaces", "TypeInfo.ServiceDefinition")
    @js.native
    def ServiceDefinition: Any = js.native
    inline def ServiceDefinition_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServiceDefinition")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/LocationsInterfaces", "TypeInfo.ServiceStatus")
    @js.native
    def ServiceStatus: EnumValuesAssigned = js.native
    inline def ServiceStatus_=(x: EnumValuesAssigned): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServiceStatus")(x.asInstanceOf[js.Any])
  }
  
  trait AccessMapping extends StObject {
    
    var accessPoint: String
    
    var displayName: String
    
    var moniker: String
    
    /**
      * The service which owns this access mapping e.g. TFS, ELS, etc.
      */
    var serviceOwner: String
    
    /**
      * Part of the access mapping which applies context after the access point of the server.
      */
    var virtualDirectory: String
  }
  object AccessMapping {
    
    inline def apply(
      accessPoint: String,
      displayName: String,
      moniker: String,
      serviceOwner: String,
      virtualDirectory: String
    ): AccessMapping = {
      val __obj = js.Dynamic.literal(accessPoint = accessPoint.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], moniker = moniker.asInstanceOf[js.Any], serviceOwner = serviceOwner.asInstanceOf[js.Any], virtualDirectory = virtualDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessMapping]
    }
    
    extension [Self <: AccessMapping](x: Self) {
      
      inline def setAccessPoint(value: String): Self = StObject.set(x, "accessPoint", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setMoniker(value: String): Self = StObject.set(x, "moniker", value.asInstanceOf[js.Any])
      
      inline def setServiceOwner(value: String): Self = StObject.set(x, "serviceOwner", value.asInstanceOf[js.Any])
      
      inline def setVirtualDirectory(value: String): Self = StObject.set(x, "virtualDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectionData extends StObject {
    
    /**
      * The Id of the authenticated user who made this request. More information about the user can be obtained by passing this Id to the Identity service
      */
    var authenticatedUser: Identity
    
    /**
      * The Id of the authorized user who made this request. More information about the user can be obtained by passing this Id to the Identity service
      */
    var authorizedUser: Identity
    
    /**
      * The id for the server.
      */
    var deploymentId: String
    
    /**
      * The instance id for this host.
      */
    var instanceId: String
    
    /**
      * The last user access for this instance.  Null if not requested specifically.
      */
    var lastUserAccess: js.Date
    
    /**
      * Data that the location service holds.
      */
    var locationServiceData: LocationServiceData
    
    /**
      * The virtual directory of the host we are talking to.
      */
    var webApplicationRelativeDirectory: String
  }
  object ConnectionData {
    
    inline def apply(
      authenticatedUser: Identity,
      authorizedUser: Identity,
      deploymentId: String,
      instanceId: String,
      lastUserAccess: js.Date,
      locationServiceData: LocationServiceData,
      webApplicationRelativeDirectory: String
    ): ConnectionData = {
      val __obj = js.Dynamic.literal(authenticatedUser = authenticatedUser.asInstanceOf[js.Any], authorizedUser = authorizedUser.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], lastUserAccess = lastUserAccess.asInstanceOf[js.Any], locationServiceData = locationServiceData.asInstanceOf[js.Any], webApplicationRelativeDirectory = webApplicationRelativeDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionData]
    }
    
    extension [Self <: ConnectionData](x: Self) {
      
      inline def setAuthenticatedUser(value: Identity): Self = StObject.set(x, "authenticatedUser", value.asInstanceOf[js.Any])
      
      inline def setAuthorizedUser(value: Identity): Self = StObject.set(x, "authorizedUser", value.asInstanceOf[js.Any])
      
      inline def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
      
      inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setLastUserAccess(value: js.Date): Self = StObject.set(x, "lastUserAccess", value.asInstanceOf[js.Any])
      
      inline def setLocationServiceData(value: LocationServiceData): Self = StObject.set(x, "locationServiceData", value.asInstanceOf[js.Any])
      
      inline def setWebApplicationRelativeDirectory(value: String): Self = StObject.set(x, "webApplicationRelativeDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocationMapping extends StObject {
    
    var accessMappingMoniker: String
    
    var location: String
  }
  object LocationMapping {
    
    inline def apply(accessMappingMoniker: String, location: String): LocationMapping = {
      val __obj = js.Dynamic.literal(accessMappingMoniker = accessMappingMoniker.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationMapping]
    }
    
    extension [Self <: LocationMapping](x: Self) {
      
      inline def setAccessMappingMoniker(value: String): Self = StObject.set(x, "accessMappingMoniker", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocationServiceData extends StObject {
    
    /**
      * Data about the access mappings contained by this location service.
      */
    var accessMappings: js.Array[AccessMapping]
    
    /**
      * Data that the location service holds.
      */
    var clientCacheFresh: Boolean
    
    /**
      * The time to live on the location service cache.
      */
    var clientCacheTimeToLive: Double
    
    /**
      * The default access mapping moniker for the server.
      */
    var defaultAccessMappingMoniker: String
    
    /**
      * The obsolete id for the last change that took place on the server (use LastChangeId64).
      */
    var lastChangeId: Double
    
    /**
      * The non-truncated 64-bit id for the last change that took place on the server.
      */
    var lastChangeId64: Double
    
    /**
      * Data about the service definitions contained by this location service.
      */
    var serviceDefinitions: js.Array[ServiceDefinition]
    
    /**
      * The identifier of the deployment which is hosting this location data (e.g. SPS, TFS, ELS, Napa, etc.)
      */
    var serviceOwner: String
  }
  object LocationServiceData {
    
    inline def apply(
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
    
    extension [Self <: LocationServiceData](x: Self) {
      
      inline def setAccessMappings(value: js.Array[AccessMapping]): Self = StObject.set(x, "accessMappings", value.asInstanceOf[js.Any])
      
      inline def setAccessMappingsVarargs(value: AccessMapping*): Self = StObject.set(x, "accessMappings", js.Array(value*))
      
      inline def setClientCacheFresh(value: Boolean): Self = StObject.set(x, "clientCacheFresh", value.asInstanceOf[js.Any])
      
      inline def setClientCacheTimeToLive(value: Double): Self = StObject.set(x, "clientCacheTimeToLive", value.asInstanceOf[js.Any])
      
      inline def setDefaultAccessMappingMoniker(value: String): Self = StObject.set(x, "defaultAccessMappingMoniker", value.asInstanceOf[js.Any])
      
      inline def setLastChangeId(value: Double): Self = StObject.set(x, "lastChangeId", value.asInstanceOf[js.Any])
      
      inline def setLastChangeId64(value: Double): Self = StObject.set(x, "lastChangeId64", value.asInstanceOf[js.Any])
      
      inline def setServiceDefinitions(value: js.Array[ServiceDefinition]): Self = StObject.set(x, "serviceDefinitions", value.asInstanceOf[js.Any])
      
      inline def setServiceDefinitionsVarargs(value: ServiceDefinition*): Self = StObject.set(x, "serviceDefinitions", js.Array(value*))
      
      inline def setServiceOwner(value: String): Self = StObject.set(x, "serviceOwner", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceAreaInfo extends StObject {
    
    var id: String
    
    var locationUrl: String
    
    var name: String
  }
  object ResourceAreaInfo {
    
    inline def apply(id: String, locationUrl: String, name: String): ResourceAreaInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], locationUrl = locationUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceAreaInfo]
    }
    
    extension [Self <: ResourceAreaInfo](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocationUrl(value: String): Self = StObject.set(x, "locationUrl", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceDefinition extends StObject {
    
    var description: String
    
    var displayName: String
    
    var identifier: String
    
    var inheritLevel: InheritLevel
    
    var locationMappings: js.Array[LocationMapping]
    
    /**
      * Maximum api version that this resource supports (current server version for this resource). Copied from <c>ApiResourceLocation</c>.
      */
    var maxVersion: String
    
    /**
      * Minimum api version that this resource supports. Copied from <c>ApiResourceLocation</c>.
      */
    var minVersion: String
    
    var parentIdentifier: String
    
    var parentServiceType: String
    
    var properties: Any
    
    var relativePath: String
    
    var relativeToSetting: RelativeToSetting
    
    /**
      * The latest version of this resource location that is in "Release" (non-preview) mode. Copied from <c>ApiResourceLocation</c>.
      */
    var releasedVersion: String
    
    /**
      * The current resource version supported by this resource location. Copied from <c>ApiResourceLocation</c>.
      */
    var resourceVersion: Double
    
    /**
      * The service which owns this definition e.g. TFS, ELS, etc.
      */
    var serviceOwner: String
    
    var serviceType: String
    
    var status: ServiceStatus
    
    var toolId: String
  }
  object ServiceDefinition {
    
    inline def apply(
      description: String,
      displayName: String,
      identifier: String,
      inheritLevel: InheritLevel,
      locationMappings: js.Array[LocationMapping],
      maxVersion: String,
      minVersion: String,
      parentIdentifier: String,
      parentServiceType: String,
      properties: Any,
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
    
    extension [Self <: ServiceDefinition](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setInheritLevel(value: InheritLevel): Self = StObject.set(x, "inheritLevel", value.asInstanceOf[js.Any])
      
      inline def setLocationMappings(value: js.Array[LocationMapping]): Self = StObject.set(x, "locationMappings", value.asInstanceOf[js.Any])
      
      inline def setLocationMappingsVarargs(value: LocationMapping*): Self = StObject.set(x, "locationMappings", js.Array(value*))
      
      inline def setMaxVersion(value: String): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      inline def setMinVersion(value: String): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      inline def setParentIdentifier(value: String): Self = StObject.set(x, "parentIdentifier", value.asInstanceOf[js.Any])
      
      inline def setParentServiceType(value: String): Self = StObject.set(x, "parentServiceType", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      inline def setRelativeToSetting(value: RelativeToSetting): Self = StObject.set(x, "relativeToSetting", value.asInstanceOf[js.Any])
      
      inline def setReleasedVersion(value: String): Self = StObject.set(x, "releasedVersion", value.asInstanceOf[js.Any])
      
      inline def setResourceVersion(value: Double): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
      
      inline def setServiceOwner(value: String): Self = StObject.set(x, "serviceOwner", value.asInstanceOf[js.Any])
      
      inline def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: ServiceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setToolId(value: String): Self = StObject.set(x, "toolId", value.asInstanceOf[js.Any])
    }
  }
}
