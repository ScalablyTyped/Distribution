package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestAttachmentReference extends js.Object {
  var id: Double
  var url: String
}

object TestAttachmentReference {
  @scala.inline
  def apply(id: Double, url: String): TestAttachmentReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestAttachmentReference]
  }
}

