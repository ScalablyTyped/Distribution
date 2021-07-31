package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Details about an environment. */
trait Environment extends StObject {
  
  /** Creation date of the environment, in the format `yyyy-MM-dd'T'HH:mm:ss.SSS'Z'`. */
  var created: js.UndefOr[String] = js.undefined
  
  /** Description of the environment. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Unique identifier for the environment. */
  var environment_id: js.UndefOr[String] = js.undefined
  
  /** Details about the resource usage and capacity of the environment. */
  var index_capacity: js.UndefOr[IndexCapacity] = js.undefined
  
  /** Name that identifies the environment. */
  var name: js.UndefOr[String] = js.undefined
  
  /** If `true`, the environment contains read-only collections that are maintained by IBM. */
  var read_only: js.UndefOr[Boolean] = js.undefined
  
  /** The new size requested for this environment. Only returned when the environment *status* is `resizing`. *Note:* Querying and indexing can still be performed during an environment upsize. */
  var requested_size: js.UndefOr[String] = js.undefined
  
  /** Information about the Continuous Relevancy Training for this environment. */
  var search_status: js.UndefOr[SearchStatus] = js.undefined
  
  /** Current size of the environment. */
  var size: js.UndefOr[String] = js.undefined
  
  /** Current status of the environment. `resizing` is displayed when a request to increase the environment size has been made, but is still in the process of being completed. */
  var status: js.UndefOr[String] = js.undefined
  
  /** Date of most recent environment update, in the format `yyyy-MM-dd'T'HH:mm:ss.SSS'Z'`. */
  var updated: js.UndefOr[String] = js.undefined
}
object Environment {
  
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment_idUndefined: Self = StObject.set(x, "environment_id", js.undefined)
    
    @scala.inline
    def setIndex_capacity(value: IndexCapacity): Self = StObject.set(x, "index_capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex_capacityUndefined: Self = StObject.set(x, "index_capacity", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRead_only(value: Boolean): Self = StObject.set(x, "read_only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead_onlyUndefined: Self = StObject.set(x, "read_only", js.undefined)
    
    @scala.inline
    def setRequested_size(value: String): Self = StObject.set(x, "requested_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequested_sizeUndefined: Self = StObject.set(x, "requested_size", js.undefined)
    
    @scala.inline
    def setSearch_status(value: SearchStatus): Self = StObject.set(x, "search_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_statusUndefined: Self = StObject.set(x, "search_status", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
