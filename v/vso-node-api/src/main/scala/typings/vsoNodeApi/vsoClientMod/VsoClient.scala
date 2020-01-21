package typings.vsoNodeApi.vsoClientMod

import typings.typedRestClient.restClientMod.RestClient
import typings.vsoNodeApi.vsoBaseInterfacesMod.ApiResourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/VsoClient", "VsoClient")
@js.native
class VsoClient protected () extends js.Object {
  def this(baseUrl: String, restClient: RestClient) = this()
  var _initializationPromise: js.Any = js.native
  var _locationsByAreaPromises: js.Any = js.native
  var basePath: String = js.native
  var baseUrl: String = js.native
  var restClient: RestClient = js.native
  /**
    * Sets a promise that is waited on before any requests are issued. Can be used to asynchronously
    * set the request url and auth token manager.
    */
  def _setInitializationPromise(promise: js.Promise[_]): Unit = js.native
  /* protected */ def autoNegotiateApiVersion(location: ApiResourceLocation, requestedVersion: String): String = js.native
  /* private */ def beginGetAreaLocations(area: js.Any): js.Any = js.native
  /**
    * Gets information about an API resource location (route template, supported versions, etc.)
    *
    * @param area resource area name
    * @param locationId Guid of the location to get
    */
  def beginGetLocation(area: String, locationId: String): js.Promise[ApiResourceLocation] = js.native
  /* protected */ def getRequestUrl(routeTemplate: String, area: String, resource: String, routeValues: js.Any): String = js.native
  /* protected */ def getRequestUrl(routeTemplate: String, area: String, resource: String, routeValues: js.Any, queryParams: js.Any): String = js.native
  /* private */ def getSerializedObject(`object`: js.Any): js.Any = js.native
  /**
    * Gets the route template for a resource based on its location ID and negotiates the api version
    */
  def getVersioningData(apiVersion: String, area: String, locationId: String, routeValues: js.Any): js.Promise[ClientVersioningData] = js.native
  def getVersioningData(apiVersion: String, area: String, locationId: String, routeValues: js.Any, queryParams: js.Any): js.Promise[ClientVersioningData] = js.native
  /* private */ def replaceRouteValues(routeTemplate: js.Any, routeValues: js.Any): js.Any = js.native
  def resolveUrl(relativeUrl: String): String = js.native
}

/* static members */
@JSImport("vso-node-api/VsoClient", "VsoClient")
@js.native
object VsoClient extends js.Object {
  var APIS_RELATIVE_PATH: js.Any = js.native
  var PREVIEW_INDICATOR: js.Any = js.native
}

