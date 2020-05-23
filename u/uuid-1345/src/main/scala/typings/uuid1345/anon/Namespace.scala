package typings.uuid1345.anon

import typings.uuid1345.mod.UuidTypes
import typings.uuid1345.uuid1345Strings.ascii
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Namespace extends js.Object {
  var encoding: ascii
  var name: String
  var namespace: UuidTypes
}

object Namespace {
  @scala.inline
  def apply(encoding: ascii, name: String, namespace: UuidTypes): Namespace = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace]
  }
}

