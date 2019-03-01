package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitFilePathsCollection extends js.Object {
  var commitId: java.lang.String
  var paths: js.Array[java.lang.String]
  var url: java.lang.String
}

object GitFilePathsCollection {
  @scala.inline
  def apply(commitId: java.lang.String, paths: js.Array[java.lang.String], url: java.lang.String): GitFilePathsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commitId")(commitId)
    __obj.updateDynamic("paths")(paths)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitFilePathsCollection]
  }
}

