package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceIdInput extends js.Object {
  var id: String
  var name: String
}

object SourceIdInput {
  @scala.inline
  def apply(id: String, name: String): SourceIdInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceIdInput]
  }
}

