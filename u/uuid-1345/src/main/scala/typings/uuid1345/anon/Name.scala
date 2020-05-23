package typings.uuid1345.anon

import typings.uuid1345.mod.UuidTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var namespace: UuidTypes
}

object Name {
  @scala.inline
  def apply(name: String, namespace: UuidTypes): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

