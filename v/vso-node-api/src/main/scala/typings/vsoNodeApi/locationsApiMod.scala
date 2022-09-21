package typings.vsoNodeApi

import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.locationsInterfacesMod.ConnectionData
import typings.vsoNodeApi.locationsInterfacesMod.ResourceAreaInfo
import typings.vsoNodeApi.locationsInterfacesMod.ServiceDefinition
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.vssinterfacesMod.ConnectOptions
import typings.vsoNodeApi.vssinterfacesMod.VssJsonCollectionWrapperV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationsApiMod {
  
  @JSImport("vso-node-api/LocationsApi", "LocationsApi")
  @js.native
  open class LocationsApi protected () extends ILocationsApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait ILocationsApi extends ClientApiBase {
    
    def deleteServiceDefinition(serviceType: String, identifier: String): js.Promise[Unit] = js.native
    
    def getConnectionData(): js.Promise[ConnectionData] = js.native
    def getConnectionData(connectOptions: Unit, lastChangeId: Double): js.Promise[ConnectionData] = js.native
    def getConnectionData(connectOptions: Unit, lastChangeId: Double, lastChangeId64: Double): js.Promise[ConnectionData] = js.native
    def getConnectionData(connectOptions: Unit, lastChangeId: Unit, lastChangeId64: Double): js.Promise[ConnectionData] = js.native
    def getConnectionData(connectOptions: ConnectOptions): js.Promise[ConnectionData] = js.native
    def getConnectionData(connectOptions: ConnectOptions, lastChangeId: Double): js.Promise[ConnectionData] = js.native
    def getConnectionData(connectOptions: ConnectOptions, lastChangeId: Double, lastChangeId64: Double): js.Promise[ConnectionData] = js.native
    def getConnectionData(connectOptions: ConnectOptions, lastChangeId: Unit, lastChangeId64: Double): js.Promise[ConnectionData] = js.native
    
    def getResourceArea(areaId: String): js.Promise[ResourceAreaInfo] = js.native
    def getResourceArea(areaId: String, organizationName: String): js.Promise[ResourceAreaInfo] = js.native
    def getResourceArea(areaId: String, organizationName: String, accountName: String): js.Promise[ResourceAreaInfo] = js.native
    def getResourceArea(areaId: String, organizationName: Unit, accountName: String): js.Promise[ResourceAreaInfo] = js.native
    
    def getResourceAreaByHost(areaId: String, hostId: String): js.Promise[ResourceAreaInfo] = js.native
    
    def getResourceAreas(): js.Promise[js.Array[ResourceAreaInfo]] = js.native
    def getResourceAreas(organizationName: String): js.Promise[js.Array[ResourceAreaInfo]] = js.native
    def getResourceAreas(organizationName: String, accountName: String): js.Promise[js.Array[ResourceAreaInfo]] = js.native
    def getResourceAreas(organizationName: Unit, accountName: String): js.Promise[js.Array[ResourceAreaInfo]] = js.native
    
    def getResourceAreasByHost(hostId: String): js.Promise[js.Array[ResourceAreaInfo]] = js.native
    
    def getServiceDefinition(serviceType: String, identifier: String): js.Promise[ServiceDefinition] = js.native
    def getServiceDefinition(serviceType: String, identifier: String, allowFaultIn: Boolean): js.Promise[ServiceDefinition] = js.native
    def getServiceDefinition(serviceType: String, identifier: String, allowFaultIn: Boolean, previewFaultIn: Boolean): js.Promise[ServiceDefinition] = js.native
    def getServiceDefinition(serviceType: String, identifier: String, allowFaultIn: Unit, previewFaultIn: Boolean): js.Promise[ServiceDefinition] = js.native
    
    def getServiceDefinitions(): js.Promise[js.Array[ServiceDefinition]] = js.native
    def getServiceDefinitions(serviceType: String): js.Promise[js.Array[ServiceDefinition]] = js.native
    
    def updateServiceDefinitions(serviceDefinitions: VssJsonCollectionWrapperV[js.Array[ServiceDefinition]]): js.Promise[Unit] = js.native
  }
}
