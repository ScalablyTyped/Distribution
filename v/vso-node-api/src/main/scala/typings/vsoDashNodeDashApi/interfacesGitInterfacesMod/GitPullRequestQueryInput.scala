package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequestQueryInput extends js.Object {
  /**
    * The list of commit IDs to search for.
    */
  var items: js.Array[String]
  /**
    * The type of query to perform.
    */
  var `type`: GitPullRequestQueryType
}

object GitPullRequestQueryInput {
  @scala.inline
  def apply(items: js.Array[String], `type`: GitPullRequestQueryType): GitPullRequestQueryInput = {
    val __obj = js.Dynamic.literal(items = items)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GitPullRequestQueryInput]
  }
}

