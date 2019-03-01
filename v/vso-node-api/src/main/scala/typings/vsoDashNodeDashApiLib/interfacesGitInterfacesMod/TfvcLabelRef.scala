package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcLabelRef extends js.Object {
  var _links: js.Any
  var description: java.lang.String
  var id: scala.Double
  var labelScope: java.lang.String
  var modifiedDate: stdLib.Date
  var name: java.lang.String
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var url: java.lang.String
}

object TfvcLabelRef {
  @scala.inline
  def apply(
    _links: js.Any,
    description: java.lang.String,
    id: scala.Double,
    labelScope: java.lang.String,
    modifiedDate: stdLib.Date,
    name: java.lang.String,
    owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    url: java.lang.String
  ): TfvcLabelRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("labelScope")(labelScope)
    __obj.updateDynamic("modifiedDate")(modifiedDate)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TfvcLabelRef]
  }
}

