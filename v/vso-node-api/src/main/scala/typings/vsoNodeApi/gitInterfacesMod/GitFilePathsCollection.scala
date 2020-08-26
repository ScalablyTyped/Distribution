package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitFilePathsCollection extends js.Object {
  var commitId: String = js.native
  var paths: js.Array[String] = js.native
  var url: String = js.native
}

object GitFilePathsCollection {
  @scala.inline
  def apply(commitId: String, paths: js.Array[String], url: String): GitFilePathsCollection = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitFilePathsCollection]
  }
  @scala.inline
  implicit class GitFilePathsCollectionOps[Self <: GitFilePathsCollection] (val x: Self) extends AnyVal {
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
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

