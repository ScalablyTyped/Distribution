package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
    val __obj = js.Dynamic.literal(commitId = commitId, paths = paths, url = url)
  
    __obj.asInstanceOf[GitFilePathsCollection]
  }
}

