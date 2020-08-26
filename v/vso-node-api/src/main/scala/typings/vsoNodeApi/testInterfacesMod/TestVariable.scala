package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestVariable extends js.Object {
  /**
    * Description of the test variable
    */
  var description: String = js.native
  /**
    * Id of the test variable
    */
  var id: Double = js.native
  /**
    * Name of the test variable
    */
  var name: String = js.native
  /**
    * Project to which the test variable belongs
    */
  var project: ShallowReference = js.native
  /**
    * Revision
    */
  var revision: Double = js.native
  /**
    * Url of the test variable
    */
  var url: String = js.native
  /**
    * List of allowed values
    */
  var values: js.Array[String] = js.native
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
  @scala.inline
  implicit class TestVariableOps[Self <: TestVariable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: ShallowReference): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

