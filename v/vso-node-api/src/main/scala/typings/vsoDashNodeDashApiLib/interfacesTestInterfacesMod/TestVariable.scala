package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestVariable extends js.Object {
  /**
    * Description of the test variable
    */
  var description: java.lang.String
  /**
    * Id of the test variable
    */
  var id: scala.Double
  /**
    * Name of the test variable
    */
  var name: java.lang.String
  /**
    * Project to which the test variable belongs
    */
  var project: ShallowReference
  /**
    * Revision
    */
  var revision: scala.Double
  /**
    * Url of the test variable
    */
  var url: java.lang.String
  /**
    * List of allowed values
    */
  var values: js.Array[java.lang.String]
}

object TestVariable {
  @scala.inline
  def apply(
    description: java.lang.String,
    id: scala.Double,
    name: java.lang.String,
    project: ShallowReference,
    revision: scala.Double,
    url: java.lang.String,
    values: js.Array[java.lang.String]
  ): TestVariable = {
    val __obj = js.Dynamic.literal(description = description, id = id, name = name, project = project, revision = revision, url = url, values = values)
  
    __obj.asInstanceOf[TestVariable]
  }
}

