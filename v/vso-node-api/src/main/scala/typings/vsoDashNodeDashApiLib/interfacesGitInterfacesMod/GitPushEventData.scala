package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GitPushEventData extends js.Object {
  var afterId: java.lang.String
  var beforeId: java.lang.String
  var branch: java.lang.String
  var commits: js.Array[GitCommit]
  var repository: GitRepository
}

