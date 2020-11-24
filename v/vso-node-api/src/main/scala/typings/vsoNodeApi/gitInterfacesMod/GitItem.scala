package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitItem extends ItemModel {
  
  /**
    * SHA1 of commit item was fetched at
    */
  var commitId: String = js.native
  
  /**
    * Type of object (Commit, Tree, Blob, Tag, ...)
    */
  var gitObjectType: GitObjectType = js.native
  
  /**
    * Shallow ref to commit that last changed this item Only populated if latestProcessedChange is requested May not be accurate if latest change is not yet cached
    */
  var latestProcessedChange: GitCommitRef = js.native
  
  /**
    * Git object id
    */
  var objectId: String = js.native
  
  /**
    * Git object id
    */
  var originalObjectId: String = js.native
}
object GitItem {
  
  @scala.inline
  def apply(
    _links: js.Any,
    commitId: String,
    contentMetadata: FileContentMetadata,
    gitObjectType: GitObjectType,
    isFolder: Boolean,
    isSymLink: Boolean,
    latestProcessedChange: GitCommitRef,
    objectId: String,
    originalObjectId: String,
    path: String,
    url: String
  ): GitItem = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], contentMetadata = contentMetadata.asInstanceOf[js.Any], gitObjectType = gitObjectType.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], isSymLink = isSymLink.asInstanceOf[js.Any], latestProcessedChange = latestProcessedChange.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], originalObjectId = originalObjectId.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitItem]
  }
  
  @scala.inline
  implicit class GitItemOps[Self <: GitItem] (val x: Self) extends AnyVal {
    
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
    def setCommitId(value: String): Self = this.set("commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitObjectType(value: GitObjectType): Self = this.set("gitObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestProcessedChange(value: GitCommitRef): Self = this.set("latestProcessedChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalObjectId(value: String): Self = this.set("originalObjectId", value.asInstanceOf[js.Any])
  }
}
