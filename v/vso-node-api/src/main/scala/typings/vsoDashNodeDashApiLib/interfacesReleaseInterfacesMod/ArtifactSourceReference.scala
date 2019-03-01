package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactSourceReference extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
}

object ArtifactSourceReference {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String): ArtifactSourceReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ArtifactSourceReference]
  }
}

