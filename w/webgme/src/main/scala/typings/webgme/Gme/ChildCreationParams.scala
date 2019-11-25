package typings.webgme.Gme

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
    val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChildCreationParams]
  }
}

