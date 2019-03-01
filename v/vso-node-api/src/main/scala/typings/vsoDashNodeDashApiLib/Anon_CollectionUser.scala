package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollectionUser extends js.Object {
  var collection_User: scala.Double
  var project_Team: scala.Double
}

object Anon_CollectionUser {
  @scala.inline
  def apply(collection_User: scala.Double, project_Team: scala.Double): Anon_CollectionUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collection_User")(collection_User)
    __obj.updateDynamic("project_Team")(project_Team)
    __obj.asInstanceOf[Anon_CollectionUser]
  }
}

