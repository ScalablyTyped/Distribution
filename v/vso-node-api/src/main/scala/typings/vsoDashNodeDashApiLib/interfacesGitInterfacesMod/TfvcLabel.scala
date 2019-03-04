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
    val __obj = js.Dynamic.literal(_links = _links, description = description, id = id, items = items, labelScope = labelScope, modifiedDate = modifiedDate, name = name, owner = owner, url = url)
  
    __obj.asInstanceOf[TfvcLabel]
  }
}

