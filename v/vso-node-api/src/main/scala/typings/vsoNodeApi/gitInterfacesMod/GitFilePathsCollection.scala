package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitFilePathsCollection extends js.Object {
  var commitId: String
  var paths: js.Array[String]
  var url: String
}

object GitFilePathsCollection {
  @scala.inline
  def apply(commitId: String, paths: js.Array[String], url: String): GitFilePathsCollection = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitFilePathsCollection]
  }
}

