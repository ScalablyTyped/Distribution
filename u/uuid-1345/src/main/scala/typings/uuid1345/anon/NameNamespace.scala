package typings.uuid1345.anon

import typings.uuid1345.mod.UuidTypes
import typings.uuid1345.uuid1345Strings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameNamespace extends js.Object {
  var encoding: `object` = js.native
  var name: String = js.native
  var namespace: UuidTypes = js.native
}

object NameNamespace {
  @scala.inline
  def apply(encoding: `object`, name: String, namespace: UuidTypes): NameNamespace = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameNamespace]
  }
  @scala.inline
  implicit class NameNamespaceOps[Self <: NameNamespace] (val x: Self) extends AnyVal {
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
    def setEncoding(value: `object`): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: UuidTypes): Self = this.set("namespace", value.asInstanceOf[js.Any])
  }
  
}

