package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureFile extends js.Object {
  var createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var createdOn: stdLib.Date
  var id: java.lang.String
  var modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var modifiedOn: stdLib.Date
  var name: java.lang.String
  var properties: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var ticket: java.lang.String
}

object SecureFile {
  @scala.inline
  def apply(
    createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    createdOn: stdLib.Date,
    id: java.lang.String,
    modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    modifiedOn: stdLib.Date,
    name: java.lang.String,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    ticket: java.lang.String
  ): SecureFile = {
    val __obj = js.Dynamic.literal(createdBy = createdBy, createdOn = createdOn, id = id, modifiedBy = modifiedBy, modifiedOn = modifiedOn, name = name, properties = properties, ticket = ticket)
  
    __obj.asInstanceOf[SecureFile]
  }
}

