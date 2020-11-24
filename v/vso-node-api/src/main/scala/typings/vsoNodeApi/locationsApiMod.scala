package typings.vsoNodeApi

import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.locationsInterfacesMod.ConnectionData
import typings.vsoNodeApi.locationsInterfacesMod.ResourceAreaInfo
import typings.vsoNodeApi.locationsInterfacesMod.ServiceDefinition
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.vssinterfacesMod.ConnectOptions
import typings.vsoNodeApi.vssinterfacesMod.VssJsonCollectionWrapperV
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vso-node-api/LocationsApi", JSImport.Namespace)
@js.native
object locationsApiMod extends js.Object {
  
  @js.native
  trait ILocationsApi extends ClientApiBase {
    
    def deleteServiceDefinition(serviceType: String, identifier: String): js.Promise[Unit] = js.native
    
    def getConnectionData(): js.Promise[ConnectionData] = js.native
    def getConnectionData(
      connectOptions: js.UndefOr[scala.Nothing],
      lastChangeId: js.UndefOr[scala.Nothing],
      lastChangeId64: Double
    ): js.Promise[ConnectionData] = js.native
    def getConnectionData(connectOptions: js.UndefOr[scala.Nothing], lastChangeId: Double): js.Promise[ConnectionData] = js.native
    def getConnectionData(connectOptions: js.UndefOr[scala.Nothing], lastChangeId: Double, lastChangeId64: Double): js.Promise[ConnectionData] = js.native
    def getConnectionData(connectOptions: ConnectOptions): js.Promise[ConnectionData] = js.native
    def getConnectionData(connectOptions: ConnectOptions, lastChangeId: js.UndefOr[scala.Nothing], lastChangeId64: Double): js.Promise[ConnectionData] = js.native
    def getConnectionData(connectOptions: ConnectOptions, lastChangeId: Double): js.Promise[ConnectionData] = js.native
    def getConnectionData(connectOptions: ConnectOptions, lastChangeId: Double, lastChangeId64: Double): js.Promise[ConnectionData] = js.native
    
    def getResourceArea(areaId: String): js.Promise[ResourceAreaInfo] = js.native
    def getResourceArea(areaId: String, organizationName: js.UndefOr[scala.Nothing], accountName: String): js.Promise[ResourceAreaInfo] = js.native
    def getResourceArea(areaId: String, organizationName: String): js.Promise[ResourceAreaInfo] = js.native
    def getResourceArea(areaId: String, organizationName: String, accountName: String): js.Promise[ResourceAreaInfo] = js.native
    
    def getResourceAreaByHost(areaId: String, hostId: String): js.Promise[ResourceAreaInfo] = js.native
    
    def getResourceAreas(): js.Promise[js.Array[ResourceAreaInfo]] = js.native
    def getResourceAreas(organizationName: js.UndefOr[scala.Nothing], accountName: String): js.Promise[js.Array[ResourceAreaInfo]] = js.native
    def getResourceAreas(organizationName: String): js.Promise[js.Array[ResourceAreaInfo]] = js.native
    def getResourceAreas(organizationName: String, accountName: String): js.Promise[js.Array[ResourceAreaInfo]] = js.native
    
    def getResourceAreasByHost(hostId: String): js.Promise[js.Array[ResourceAreaInfo]] = js.native
    
    def getServiceDefinition(serviceType: String, identifier: String): js.Promise[ServiceDefinition] = js.native
    def getServiceDefinition(
      serviceType: String,
      identifier: String,
      allowFaultIn: js.UndefOr[scala.Nothing],
      previewFaultIn: Boolean
    ): js.Promise[ServiceDefinition] = js.native
    def getServiceDefinition(serviceType: String, identifier: String, allowFaultIn: Boolean): js.Promise[ServiceDefinition] = js.native
    def getServiceDefinition(serviceType: String, identifier: String, allowFaultIn: Boolean, previewFaultIn: Boolean): js.Promise[ServiceDefinition] = js.native
    
    def getServiceDefinitions(): js.Promise[js.Array[ServiceDefinition]] = js.native
    def getServiceDefinitions(serviceType: String): js.Promise[js.Array[ServiceDefinition]] = js.native
    
    def updateServiceDefinitions(serviceDefinitions: VssJsonCollectionWrapperV[js.Array[ServiceDefinition]]): js.Promise[Unit] = js.native
  }
  
  @js.native
  class LocationsApi protected () extends ILocationsApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
}
