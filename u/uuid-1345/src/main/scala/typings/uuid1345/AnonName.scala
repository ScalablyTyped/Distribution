package typings.uuid1345

import typings.uuid1345.mod.UuidTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var namespace: UuidTypes
}

object AnonName {
  @scala.inline
  def apply(name: String, namespace: UuidTypes): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

