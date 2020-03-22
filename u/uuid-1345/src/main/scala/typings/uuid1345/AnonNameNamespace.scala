package typings.uuid1345

import typings.uuid1345.mod.UuidTypes
import typings.uuid1345.uuid1345Strings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameNamespace extends js.Object {
  var encoding: `object`
  var name: String
  var namespace: UuidTypes
}

object AnonNameNamespace {
  @scala.inline
  def apply(encoding: `object`, name: String, namespace: UuidTypes): AnonNameNamespace = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameNamespace]
  }
}

