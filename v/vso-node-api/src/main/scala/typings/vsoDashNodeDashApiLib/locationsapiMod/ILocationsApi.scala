package typings
package vsoDashNodeDashApiLib.locationsapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocationsApi
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def deleteServiceDefinition(serviceType: java.lang.String, identifier: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def getConnectionData(): stdLib.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ConnectionData] = js.native
  def getConnectionData(connectOptions: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ConnectOptions): stdLib.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ConnectionData] = js.native
  def getConnectionData(
    connectOptions: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ConnectOptions,
    lastChangeId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ConnectionData] = js.native
  def getConnectionData(
    connectOptions: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ConnectOptions,
    lastChangeId: scala.Double,
    lastChangeId64: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ConnectionData] = js.native
  def getResourceArea(areaId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ResourceAreaInfo] = js.native
  def getResourceArea(areaId: java.lang.String, organizationName: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ResourceAreaInfo] = js.native
  def getResourceArea(areaId: java.lang.String, organizationName: java.lang.String, accountName: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ResourceAreaInfo] = js.native
  def getResourceAreaByHost(areaId: java.lang.String, hostId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ResourceAreaInfo] = js.native
  def getResourceAreas(): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ResourceAreaInfo]
  ] = js.native
  def getResourceAreas(organizationName: java.lang.String): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ResourceAreaInfo]
  ] = js.native
  def getResourceAreas(organizationName: java.lang.String, accountName: java.lang.String): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ResourceAreaInfo]
  ] = js.native
  def getResourceAreasByHost(hostId: java.lang.String): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ResourceAreaInfo]
  ] = js.native
  def getServiceDefinition(serviceType: java.lang.String, identifier: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ServiceDefinition] = js.native
  def getServiceDefinition(serviceType: java.lang.String, identifier: java.lang.String, allowFaultIn: scala.Boolean): stdLib.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ServiceDefinition] = js.native
  def getServiceDefinition(
    serviceType: java.lang.String,
    identifier: java.lang.String,
    allowFaultIn: scala.Boolean,
    previewFaultIn: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ServiceDefinition] = js.native
  def getServiceDefinitions(): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ServiceDefinition]
  ] = js.native
  def getServiceDefinitions(serviceType: java.lang.String): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ServiceDefinition]
  ] = js.native
  def updateServiceDefinitions(
    serviceDefinitions: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.VssJsonCollectionWrapperV[
      js.Array[vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ServiceDefinition]
    ]
  ): stdLib.Promise[scala.Unit] = js.native
}

