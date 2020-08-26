package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitTreeDiff extends js.Object {
  /**
    * ObjectId of the base tree of this diff.
    */
  var baseTreeId: String = js.native
  /**
    * List of tree entries that differ between the base and target tree.  Renames and object type changes are returned as a delete for the old object and add for the new object.  If a continuation token is returned in the response header, some tree entries are yet to be processed and may yeild more diff entries. If the continuation token is not returned all the diff entries have been included in this response.
    */
  var diffEntries: js.Array[GitTreeDiffEntry] = js.native
  /**
    * ObjectId of the target tree of this diff.
    */
  var targetTreeId: String = js.native
  /**
    * REST Url to this resource.
    */
  var url: String = js.native
}

object GitTreeDiff {
  @scala.inline
  def apply(baseTreeId: String, diffEntries: js.Array[GitTreeDiffEntry], targetTreeId: String, url: String): GitTreeDiff = {
    val __obj = js.Dynamic.literal(baseTreeId = baseTreeId.asInstanceOf[js.Any], diffEntries = diffEntries.asInstanceOf[js.Any], targetTreeId = targetTreeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitTreeDiff]
  }
  @scala.inline
  implicit class GitTreeDiffOps[Self <: GitTreeDiff] (val x: Self) extends AnyVal {
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
    def setBaseTreeId(value: String): Self = this.set("baseTreeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiffEntriesVarargs(value: GitTreeDiffEntry*): Self = this.set("diffEntries", js.Array(value :_*))
    @scala.inline
    def setDiffEntries(value: js.Array[GitTreeDiffEntry]): Self = this.set("diffEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetTreeId(value: String): Self = this.set("targetTreeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

