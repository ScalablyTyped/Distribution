package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteUpdateModel extends js.Object {
  var defaultConfigurations: js.Array[ShallowReference]
  var defaultTesters: js.Array[ShallowReference]
  var inheritDefaultConfigurations: Boolean
  var name: String
  var parent: ShallowReference
  var queryString: String
}

object SuiteUpdateModel {
  @scala.inline
  def apply(
    defaultConfigurations: js.Array[ShallowReference],
    defaultTesters: js.Array[ShallowReference],
    inheritDefaultConfigurations: Boolean,
    name: String,
    parent: ShallowReference,
    queryString: String
  ): SuiteUpdateModel = {
    val __obj = js.Dynamic.literal(defaultConfigurations = defaultConfigurations, defaultTesters = defaultTesters, inheritDefaultConfigurations = inheritDefaultConfigurations, name = name, parent = parent, queryString = queryString)
  
    __obj.asInstanceOf[SuiteUpdateModel]
  }
}

