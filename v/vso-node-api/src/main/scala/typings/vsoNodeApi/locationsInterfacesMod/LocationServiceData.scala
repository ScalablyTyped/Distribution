package typings.vsoNodeApi.locationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationServiceData extends js.Object {
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
  implicit class LocationServiceDataOps[Self <: LocationServiceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessMappingsVarargs(value: AccessMapping*): Self = this.set("accessMappings", js.Array(value :_*))
    @scala.inline
    def setAccessMappings(value: js.Array[AccessMapping]): Self = this.set("accessMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientCacheFresh(value: Boolean): Self = this.set("clientCacheFresh", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientCacheTimeToLive(value: Double): Self = this.set("clientCacheTimeToLive", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultAccessMappingMoniker(value: String): Self = this.set("defaultAccessMappingMoniker", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastChangeId(value: Double): Self = this.set("lastChangeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastChangeId64(value: Double): Self = this.set("lastChangeId64", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceDefinitionsVarargs(value: ServiceDefinition*): Self = this.set("serviceDefinitions", js.Array(value :_*))
    @scala.inline
    def setServiceDefinitions(value: js.Array[ServiceDefinition]): Self = this.set("serviceDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceOwner(value: String): Self = this.set("serviceOwner", value.asInstanceOf[js.Any])
  }
  
}

