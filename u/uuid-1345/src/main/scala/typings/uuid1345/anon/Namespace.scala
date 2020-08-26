package typings.uuid1345.anon

import typings.uuid1345.mod.UuidTypes
import typings.uuid1345.uuid1345Strings.ascii
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Namespace extends js.Object {
  var encoding: ascii = js.native
  var name: String = js.native
  var namespace: UuidTypes = js.native
}

object Namespace {
  @scala.inline
  def apply(encoding: ascii, name: String, namespace: UuidTypes): Namespace = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace]
  }
  @scala.inline
  implicit class NamespaceOps[Self <: Namespace] (val x: Self) extends AnyVal {
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
    def setEncoding(value: ascii): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: UuidTypes): Self = this.set("namespace", value.asInstanceOf[js.Any])
  }
  
}

