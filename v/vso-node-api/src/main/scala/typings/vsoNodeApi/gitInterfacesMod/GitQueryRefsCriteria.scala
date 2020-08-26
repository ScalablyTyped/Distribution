package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitQueryRefsCriteria extends js.Object {
  /**
    * List of commit Ids to be searched
    */
  var commitIds: js.Array[String] = js.native
  /**
    * List of complete or partial names for refs to be searched
    */
  var refNames: js.Array[String] = js.native
  /**
    * Type of search on refNames, if provided
    */
  var searchType: GitRefSearchType = js.native
}

object GitQueryRefsCriteria {
  @scala.inline
  def apply(commitIds: js.Array[String], refNames: js.Array[String], searchType: GitRefSearchType): GitQueryRefsCriteria = {
    val __obj = js.Dynamic.literal(commitIds = commitIds.asInstanceOf[js.Any], refNames = refNames.asInstanceOf[js.Any], searchType = searchType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitQueryRefsCriteria]
  }
  @scala.inline
  implicit class GitQueryRefsCriteriaOps[Self <: GitQueryRefsCriteria] (val x: Self) extends AnyVal {
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
    def setCommitIdsVarargs(value: String*): Self = this.set("commitIds", js.Array(value :_*))
    @scala.inline
    def setCommitIds(value: js.Array[String]): Self = this.set("commitIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefNamesVarargs(value: String*): Self = this.set("refNames", js.Array(value :_*))
    @scala.inline
    def setRefNames(value: js.Array[String]): Self = this.set("refNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchType(value: GitRefSearchType): Self = this.set("searchType", value.asInstanceOf[js.Any])
  }
  
}

