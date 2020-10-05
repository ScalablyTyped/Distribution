package typings.typescript.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assignable extends js.Object {
  var assignable: Double = js.native
  var identity: Double = js.native
  var strictSubtype: Double = js.native
  var subtype: Double = js.native
}

object Assignable {
  @scala.inline
  def apply(assignable: Double, identity: Double, strictSubtype: Double, subtype: Double): Assignable = {
    val __obj = js.Dynamic.literal(assignable = assignable.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], strictSubtype = strictSubtype.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignable]
  }
  @scala.inline
  implicit class AssignableOps[Self <: Assignable] (val x: Self) extends AnyVal {
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
    def setAssignable(value: Double): Self = this.set("assignable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentity(value: Double): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrictSubtype(value: Double): Self = this.set("strictSubtype", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtype(value: Double): Self = this.set("subtype", value.asInstanceOf[js.Any])
  }
  
}

