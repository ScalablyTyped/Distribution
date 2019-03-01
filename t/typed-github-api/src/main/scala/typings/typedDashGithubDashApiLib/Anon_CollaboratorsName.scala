package typings
package typedDashGithubDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollaboratorsName extends js.Object {
  var collaborators: scala.Double
  var name: java.lang.String
  var privateRepos: scala.Double
  var space: scala.Double
}

object Anon_CollaboratorsName {
  @scala.inline
  def apply(
    collaborators: scala.Double,
    name: java.lang.String,
    privateRepos: scala.Double,
    space: scala.Double
  ): Anon_CollaboratorsName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collaborators")(collaborators)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("privateRepos")(privateRepos)
    __obj.updateDynamic("space")(space)
    __obj.asInstanceOf[Anon_CollaboratorsName]
  }
}

