package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitItemRequestData extends js.Object {
  /**
    * Whether to include metadata for all items
    */
  var includeContentMetadata: Boolean = js.native
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean = js.native
  /**
    * Collection of items to fetch, including path, version, and recursion level
    */
  var itemDescriptors: js.Array[GitItemDescriptor] = js.native
  /**
    * Whether to include shallow ref to commit that last changed each item
    */
  var latestProcessedChange: Boolean = js.native
}

object GitItemRequestData {
  @scala.inline
  def apply(
    includeContentMetadata: Boolean,
    includeLinks: Boolean,
    itemDescriptors: js.Array[GitItemDescriptor],
    latestProcessedChange: Boolean
  ): GitItemRequestData = {
    val __obj = js.Dynamic.literal(includeContentMetadata = includeContentMetadata.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], itemDescriptors = itemDescriptors.asInstanceOf[js.Any], latestProcessedChange = latestProcessedChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitItemRequestData]
  }
  @scala.inline
  implicit class GitItemRequestDataOps[Self <: GitItemRequestData] (val x: Self) extends AnyVal {
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
    def setIncludeContentMetadata(value: Boolean): Self = this.set("includeContentMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeLinks(value: Boolean): Self = this.set("includeLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemDescriptorsVarargs(value: GitItemDescriptor*): Self = this.set("itemDescriptors", js.Array(value :_*))
    @scala.inline
    def setItemDescriptors(value: js.Array[GitItemDescriptor]): Self = this.set("itemDescriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatestProcessedChange(value: Boolean): Self = this.set("latestProcessedChange", value.asInstanceOf[js.Any])
  }
  
}

