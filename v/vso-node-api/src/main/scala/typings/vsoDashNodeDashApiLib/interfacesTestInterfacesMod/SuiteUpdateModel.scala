package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteUpdateModel extends js.Object {
  var defaultConfigurations: js.Array[ShallowReference]
  var defaultTesters: js.Array[ShallowReference]
  var inheritDefaultConfigurations: scala.Boolean
  var name: java.lang.String
  var parent: ShallowReference
  var queryString: java.lang.String
}

object SuiteUpdateModel {
  @scala.inline
  def apply(
    defaultConfigurations: js.Array[ShallowReference],
    defaultTesters: js.Array[ShallowReference],
    inheritDefaultConfigurations: scala.Boolean,
    name: java.lang.String,
    parent: ShallowReference,
    queryString: java.lang.String
  ): SuiteUpdateModel = {
    val __obj = js.Dynamic.literal(defaultConfigurations = defaultConfigurations, defaultTesters = defaultTesters, inheritDefaultConfigurations = inheritDefaultConfigurations, name = name, parent = parent, queryString = queryString)
  
    __obj.asInstanceOf[SuiteUpdateModel]
  }
}

