package typings.tcomb.anon

import typings.tcomb.mod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Types extends js.Object {
  var identity: Boolean = js.native
  var kind: String = js.native
  var name: String = js.native
  var types: js.Array[Constructor[_]] = js.native
}

object Types {
  @scala.inline
  def apply(identity: Boolean, kind: String, name: String, types: js.Array[Constructor[_]]): Types = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types]
  }
  @scala.inline
  implicit class TypesOps[Self <: Types] (val x: Self) extends AnyVal {
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
    def setIdentity(value: Boolean): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: Constructor[js.Any]*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[Constructor[_]]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

