package typings
package vsoDashNodeDashApiLib.locationsapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocationsApi
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def deleteServiceDefinition(serviceType: java.lang.String, identifier: java.lang.String): js.Promise[scala.Unit] = js.native
  def getConnectionData(): js.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ConnectionData] = js.native
  def getConnectionData(connectOptions: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ConnectOptions): js.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ConnectionData] = js.native
  def getConnectionData(
    connectOptions: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ConnectOptions,
    lastChangeId: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ConnectionData] = js.native
  def getConnectionData(
    connectOptions: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ConnectOptions,
    lastChangeId: scala.Double,
    lastChangeId64: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ConnectionData] = js.native
  def getResourceArea(areaId: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ResourceAreaInfo] = js.native
  def getResourceArea(areaId: java.lang.String, organizationName: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ResourceAreaInfo] = js.native
  def getResourceArea(areaId: java.lang.String, organizationName: java.lang.String, accountName: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ResourceAreaInfo] = js.native
  def getResourceAreaByHost(areaId: java.lang.String, hostId: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ResourceAreaInfo] = js.native
  def getResourceAreas(): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ResourceAreaInfo]
  ] = js.native
  def getResourceAreas(organizationName: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ResourceAreaInfo]
  ] = js.native
  def getResourceAreas(organizationName: java.lang.String, accountName: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ResourceAreaInfo]
  ] = js.native
  def getResourceAreasByHost(hostId: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ResourceAreaInfo]
  ] = js.native
  def getServiceDefinition(serviceType: java.lang.String, identifier: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ServiceDefinition] = js.native
  def getServiceDefinition(serviceType: java.lang.String, identifier: java.lang.String, allowFaultIn: scala.Boolean): js.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ServiceDefinition] = js.native
  def getServiceDefinition(
    serviceType: java.lang.String,
    identifier: java.lang.String,
    allowFaultIn: scala.Boolean,
    previewFaultIn: scala.Boolean
  ): js.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ServiceDefinition] = js.native
  def getServiceDefinitions(): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ServiceDefinition]
  ] = js.native
  def getServiceDefinitions(serviceType: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ServiceDefinition]
  ] = js.native
  def updateServiceDefinitions(
    serviceDefinitions: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.VssJsonCollectionWrapperV[
      js.Array[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ServiceDefinition]
    ]
  ): js.Promise[scala.Unit] = js.native
}

