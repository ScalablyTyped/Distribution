package typings.vsoNodeApi.locationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationServiceData extends js.Object {
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
}

