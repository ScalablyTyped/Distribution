package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Details about an environment. */
@js.native
trait Environment extends js.Object {
  
  /** Creation date of the environment, in the format `yyyy-MM-dd'T'HH:mm:ss.SSS'Z'`. */
  var created: js.UndefOr[String] = js.native
  
  /** Description of the environment. */
  var description: js.UndefOr[String] = js.native
  
  /** Unique identifier for the environment. */
  var environment_id: js.UndefOr[String] = js.native
  
  /** Details about the resource usage and capacity of the environment. */
  var index_capacity: js.UndefOr[IndexCapacity] = js.native
  
  /** Name that identifies the environment. */
  var name: js.UndefOr[String] = js.native
  
  /** If `true`, the environment contains read-only collections that are maintained by IBM. */
  var read_only: js.UndefOr[Boolean] = js.native
  
  /** The new size requested for this environment. Only returned when the environment *status* is `resizing`. *Note:* Querying and indexing can still be performed during an environment upsize. */
  var requested_size: js.UndefOr[String] = js.native
  
  /** Information about the Continuous Relevancy Training for this environment. */
  var search_status: js.UndefOr[SearchStatus] = js.native
  
  /** Current size of the environment. */
  var size: js.UndefOr[String] = js.native
  
  /** Current status of the environment. `resizing` is displayed when a request to increase the environment size has been made, but is still in the process of being completed. */
  var status: js.UndefOr[String] = js.native
  
  /** Date of most recent environment update, in the format `yyyy-MM-dd'T'HH:mm:ss.SSS'Z'`. */
  var updated: js.UndefOr[String] = js.native
}
object Environment {
  
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
    
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
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnvironment_id(value: String): Self = this.set("environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment_id: Self = this.set("environment_id", js.undefined)
    
    @scala.inline
    def setIndex_capacity(value: IndexCapacity): Self = this.set("index_capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex_capacity: Self = this.set("index_capacity", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRead_only(value: Boolean): Self = this.set("read_only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRead_only: Self = this.set("read_only", js.undefined)
    
    @scala.inline
    def setRequested_size(value: String): Self = this.set("requested_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequested_size: Self = this.set("requested_size", js.undefined)
    
    @scala.inline
    def setSearch_status(value: SearchStatus): Self = this.set("search_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch_status: Self = this.set("search_status", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
}
