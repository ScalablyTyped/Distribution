package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableGroup extends js.Object {
  var createdBy: IdentityRef
  var createdOn: Date
  var description: String
  var id: Double
  var modifiedBy: IdentityRef
  var modifiedOn: Date
  var name: String
  var variables: StringDictionary[VariableValue]
}

object VariableGroup {
  @scala.inline
  def apply(
    createdBy: IdentityRef,
    createdOn: Date,
    description: String,
    id: Double,
    modifiedBy: IdentityRef,
    modifiedOn: Date,
    name: String,
    variables: StringDictionary[VariableValue]
  ): VariableGroup = {
    val __obj = js.Dynamic.literal(createdBy = createdBy, createdOn = createdOn, description = description, id = id, modifiedBy = modifiedBy, modifiedOn = modifiedOn, name = name, variables = variables)
  
    __obj.asInstanceOf[VariableGroup]
  }
}

