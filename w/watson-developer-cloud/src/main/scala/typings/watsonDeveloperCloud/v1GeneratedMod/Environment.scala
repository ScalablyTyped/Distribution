package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Details about an environment. */
trait Environment extends js.Object {
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
  def apply(
    created: String = null,
    description: String = null,
    environment_id: String = null,
    index_capacity: IndexCapacity = null,
    name: String = null,
    read_only: js.UndefOr[Boolean] = js.undefined,
    requested_size: String = null,
    search_status: SearchStatus = null,
    size: String = null,
    status: String = null,
    updated: String = null
  ): Environment = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (environment_id != null) __obj.updateDynamic("environment_id")(environment_id.asInstanceOf[js.Any])
    if (index_capacity != null) __obj.updateDynamic("index_capacity")(index_capacity.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(read_only)) __obj.updateDynamic("read_only")(read_only.asInstanceOf[js.Any])
    if (requested_size != null) __obj.updateDynamic("requested_size")(requested_size.asInstanceOf[js.Any])
    if (search_status != null) __obj.updateDynamic("search_status")(search_status.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
}

