package typings.tcomb.anon

import typings.tcomb.mod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Codomain[T] extends js.Object {
  var codomain: T = js.native
  var domain: Constructor[String] = js.native
  var identity: Boolean = js.native
  var kind: String = js.native
  var name: String = js.native
}

object Codomain {
  @scala.inline
  def apply[T](codomain: T, domain: Constructor[String], identity: Boolean, kind: String, name: String): Codomain[T] = {
    val __obj = js.Dynamic.literal(codomain = codomain.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codomain[T]]
  }
  @scala.inline
  implicit class CodomainOps[Self <: Codomain[_], T] (val x: Self with Codomain[T]) extends AnyVal {
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
    def setCodomain(value: T): Self = this.set("codomain", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: Constructor[String]): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentity(value: Boolean): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

