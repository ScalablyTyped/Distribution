package typings
package vsoDashNodeDashApiLib.vsoclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/VsoClient", "VsoClient")
@js.native
class VsoClient protected () extends js.Object {
  def this(baseUrl: java.lang.String, restClient: typedDashRestDashClientLib.restclientMod.RestClient) = this()
  var _initializationPromise: js.Any = js.native
  var _locationsByAreaPromises: js.Any = js.native
  var basePath: java.lang.String = js.native
  var baseUrl: java.lang.String = js.native
  var restClient: typedDashRestDashClientLib.restclientMod.RestClient = js.native
  /**
    * Sets a promise that is waited on before any requests are issued. Can be used to asynchronously
    * set the request url and auth token manager.
    */
  def _setInitializationPromise(promise: js.Promise[_]): scala.Unit = js.native
  /* protected */ def autoNegotiateApiVersion(
    location: vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.ApiResourceLocation,
    requestedVersion: java.lang.String
  ): java.lang.String = js.native
  /* private */ def beginGetAreaLocations(area: js.Any): js.Any = js.native
  /**
    * Gets information about an API resource location (route template, supported versions, etc.)
    *
    * @param area resource area name
    * @param locationId Guid of the location to get
    */
  def beginGetLocation(area: java.lang.String, locationId: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.ApiResourceLocation] = js.native
  /* protected */ def getRequestUrl(
    routeTemplate: java.lang.String,
    area: java.lang.String,
    resource: java.lang.String,
    routeValues: js.Any
  ): java.lang.String = js.native
  /* protected */ def getRequestUrl(
    routeTemplate: java.lang.String,
    area: java.lang.String,
    resource: java.lang.String,
    routeValues: js.Any,
    queryParams: js.Any
  ): java.lang.String = js.native
  /* private */ def getSerializedObject(`object`: js.Any): js.Any = js.native
  /**
    * Gets the route template for a resource based on its location ID and negotiates the api version
    */
  def getVersioningData(
    apiVersion: java.lang.String,
    area: java.lang.String,
    locationId: java.lang.String,
    routeValues: js.Any
  ): js.Promise[ClientVersioningData] = js.native
  def getVersioningData(
    apiVersion: java.lang.String,
    area: java.lang.String,
    locationId: java.lang.String,
    routeValues: js.Any,
    queryParams: js.Any
  ): js.Promise[ClientVersioningData] = js.native
  /* private */ def replaceRouteValues(routeTemplate: js.Any, routeValues: js.Any): js.Any = js.native
  def resolveUrl(relativeUrl: java.lang.String): java.lang.String = js.native
}

@JSImport("vso-node-api/VsoClient", "VsoClient")
@js.native
object VsoClient extends js.Object {
  var APIS_RELATIVE_PATH: js.Any = js.native
  var PREVIEW_INDICATOR: js.Any = js.native
}

