package typings.webgme.GmeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildCreationParams extends js.Object {
  var baseId: String
  var parentId: String
}

object ChildCreationParams {
  @scala.inline
  def apply(baseId: String, parentId: String): ChildCreationParams = {
    val __obj = js.Dynamic.literal(baseId = baseId, parentId = parentId)
  
    __obj.asInstanceOf[ChildCreationParams]
  }
}

