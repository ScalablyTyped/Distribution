package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableGroup extends js.Object {
  var createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var createdOn: stdLib.Date
  var description: java.lang.String
  var id: scala.Double
  var modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var modifiedOn: stdLib.Date
  var name: java.lang.String
  var variables: org.scalablytyped.runtime.StringDictionary[VariableValue]
}

object VariableGroup {
  @scala.inline
  def apply(
    createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    createdOn: stdLib.Date,
    description: java.lang.String,
    id: scala.Double,
    modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    modifiedOn: stdLib.Date,
    name: java.lang.String,
    variables: org.scalablytyped.runtime.StringDictionary[VariableValue]
  ): VariableGroup = {
    val __obj = js.Dynamic.literal(createdBy = createdBy, createdOn = createdOn, description = description, id = id, modifiedBy = modifiedBy, modifiedOn = modifiedOn, name = name, variables = variables)
  
    __obj.asInstanceOf[VariableGroup]
  }
}

