package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
    description: String,
    id: Double,
    items: js.Array[TfvcItem],
    labelScope: String,
    modifiedDate: Date,
    name: String,
    owner: IdentityRef,
    url: String
  ): TfvcLabel = {
    val __obj = js.Dynamic.literal(_links = _links, description = description, id = id, items = items, labelScope = labelScope, modifiedDate = modifiedDate, name = name, owner = owner, url = url)
  
    __obj.asInstanceOf[TfvcLabel]
  }
}

