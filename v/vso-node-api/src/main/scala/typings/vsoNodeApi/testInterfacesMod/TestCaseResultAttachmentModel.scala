package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestCaseResultAttachmentModel extends js.Object {
  var id: Double = js.native
  var iterationId: Double = js.native
  var name: String = js.native
  var size: Double = js.native
  var url: String = js.native
}

object TestCaseResultAttachmentModel {
  @scala.inline
  def apply(id: Double, iterationId: Double, name: String, size: Double, url: String): TestCaseResultAttachmentModel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], iterationId = iterationId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCaseResultAttachmentModel]
  }
  @scala.inline
  implicit class TestCaseResultAttachmentModelOps[Self <: TestCaseResultAttachmentModel] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIterationId(value: Double): Self = this.set("iterationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

