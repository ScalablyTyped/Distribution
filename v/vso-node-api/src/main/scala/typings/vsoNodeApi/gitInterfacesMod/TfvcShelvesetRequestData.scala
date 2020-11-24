package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcShelvesetRequestData extends js.Object {
  
  /**
    * Whether to include policyOverride and notes Only applies when requesting a single deep shelveset
    */
  var includeDetails: Boolean = js.native
  
  /**
    * Whether to include the _links field on the shallow references. Does not apply when requesting a single deep shelveset object. Links will always be included in the deep shelveset.
    */
  var includeLinks: Boolean = js.native
  
  /**
    * Whether to include workItems
    */
  var includeWorkItems: Boolean = js.native
  
  /**
    * Max number of changes to include
    */
  var maxChangeCount: Double = js.native
  
  /**
    * Max length of comment
    */
  var maxCommentLength: Double = js.native
  
  /**
    * Shelveset's name
    */
  var name: String = js.native
  
  /**
    * Owner's ID. Could be a name or a guid.
    */
  var owner: String = js.native
}
object TfvcShelvesetRequestData {
  
  @scala.inline
  def apply(
    includeDetails: Boolean,
    includeLinks: Boolean,
    includeWorkItems: Boolean,
    maxChangeCount: Double,
    maxCommentLength: Double,
    name: String,
    owner: String
  ): TfvcShelvesetRequestData = {
    val __obj = js.Dynamic.literal(includeDetails = includeDetails.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], includeWorkItems = includeWorkItems.asInstanceOf[js.Any], maxChangeCount = maxChangeCount.asInstanceOf[js.Any], maxCommentLength = maxCommentLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcShelvesetRequestData]
  }
  
  @scala.inline
  implicit class TfvcShelvesetRequestDataOps[Self <: TfvcShelvesetRequestData] (val x: Self) extends AnyVal {
    
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
    def setIncludeDetails(value: Boolean): Self = this.set("includeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLinks(value: Boolean): Self = this.set("includeLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeWorkItems(value: Boolean): Self = this.set("includeWorkItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxChangeCount(value: Double): Self = this.set("maxChangeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCommentLength(value: Double): Self = this.set("maxCommentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
  }
}
