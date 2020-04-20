package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestVariable extends js.Object {
  /**
    * Description of the test variable
    */
  var description: String
  /**
    * Id of the test variable
    */
  var id: Double
  /**
    * Name of the test variable
    */
  var name: String
  /**
    * Project to which the test variable belongs
    */
  var project: ShallowReference
  /**
    * Revision
    */
  var revision: Double
  /**
    * Url of the test variable
    */
  var url: String
  /**
    * List of allowed values
    */
  var values: js.Array[String]
}

object TestVariable {
  @scala.inline
  def apply(
    description: String,
    id: Double,
    name: String,
    project: ShallowReference,
    revision: Double,
    url: String,
    values: js.Array[String]
  ): TestVariable = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestVariable]
  }
}

