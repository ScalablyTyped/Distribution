package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcLabelRef extends js.Object {
  var _links: js.Any
  var description: String
  var id: Double
  var labelScope: String
  var modifiedDate: Date
  var name: String
  var owner: IdentityRef
  var url: String
}

object TfvcLabelRef {
  @scala.inline
  def apply(
    _links: js.Any,
    description: String,
    id: Double,
    labelScope: String,
    modifiedDate: Date,
    name: String,
    owner: IdentityRef,
    url: String
  ): TfvcLabelRef = {
    val __obj = js.Dynamic.literal(_links = _links, description = description, id = id, labelScope = labelScope, modifiedDate = modifiedDate, name = name, owner = owner, url = url)
  
    __obj.asInstanceOf[TfvcLabelRef]
  }
}

