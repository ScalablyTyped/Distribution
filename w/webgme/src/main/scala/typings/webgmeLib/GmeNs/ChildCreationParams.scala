package typings
package webgmeLib.GmeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildCreationParams extends js.Object {
  var baseId: java.lang.String
  var parentId: java.lang.String
}

object ChildCreationParams {
  @scala.inline
  def apply(baseId: java.lang.String, parentId: java.lang.String): ChildCreationParams = {
    val __obj = js.Dynamic.literal(baseId = baseId, parentId = parentId)
  
    __obj.asInstanceOf[ChildCreationParams]
  }
}

