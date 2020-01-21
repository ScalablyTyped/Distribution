package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureFile extends js.Object {
  var createdBy: IdentityRef
  var createdOn: Date
  var id: String
  var modifiedBy: IdentityRef
  var modifiedOn: Date
  var name: String
  var properties: StringDictionary[String]
  var ticket: String
}

object SecureFile {
  @scala.inline
  def apply(
    createdBy: IdentityRef,
    createdOn: Date,
    id: String,
    modifiedBy: IdentityRef,
    modifiedOn: Date,
    name: String,
    properties: StringDictionary[String],
    ticket: String
  ): SecureFile = {
    val __obj = js.Dynamic.literal(createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecureFile]
  }
}

