package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitTreeRef extends js.Object {
  
  var _links: js.Any = js.native
  
  /**
    * SHA1 hash of git object
    */
  var objectId: String = js.native
  
  /**
    * Sum of sizes of all children
    */
  var size: Double = js.native
  
  /**
    * Blobs and trees under this tree
    */
  var treeEntries: js.Array[GitTreeEntryRef] = js.native
  
  /**
    * Url to tree
    */
  var url: String = js.native
}
object GitTreeRef {
  
  @scala.inline
  def apply(
    _links: js.Any,
    objectId: String,
    size: Double,
    treeEntries: js.Array[GitTreeEntryRef],
    url: String
  ): GitTreeRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], treeEntries = treeEntries.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitTreeRef]
  }
  
  @scala.inline
  implicit class GitTreeRefOps[Self <: GitTreeRef] (val x: Self) extends AnyVal {
    
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeEntriesVarargs(value: GitTreeEntryRef*): Self = this.set("treeEntries", js.Array(value :_*))
    
    @scala.inline
    def setTreeEntries(value: js.Array[GitTreeEntryRef]): Self = this.set("treeEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
