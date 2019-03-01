package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcLabel extends TfvcLabelRef {
  var items: js.Array[TfvcItem]
}

object TfvcLabel {
  @scala.inline
  def apply(
    _links: js.Any,
    description: java.lang.String,
    id: scala.Double,
    items: js.Array[TfvcItem],
    labelScope: java.lang.String,
    modifiedDate: stdLib.Date,
    name: java.lang.String,
    owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    url: java.lang.String
  ): TfvcLabel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("labelScope")(labelScope)
    __obj.updateDynamic("modifiedDate")(modifiedDate)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TfvcLabel]
  }
}

