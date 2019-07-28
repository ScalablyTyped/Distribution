package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(createdBy = createdBy, createdOn = createdOn, id = id, modifiedBy = modifiedBy, modifiedOn = modifiedOn, name = name, properties = properties, ticket = ticket)
  
    __obj.asInstanceOf[SecureFile]
  }
}

