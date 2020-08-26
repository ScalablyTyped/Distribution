package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityData extends js.Object {
  var identityIds: js.Array[String] = js.native
}

object IdentityData {
  @scala.inline
  def apply(identityIds: js.Array[String]): IdentityData = {
    val __obj = js.Dynamic.literal(identityIds = identityIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityData]
  }
  @scala.inline
  implicit class IdentityDataOps[Self <: IdentityData] (val x: Self) extends AnyVal {
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
    def setIdentityIdsVarargs(value: String*): Self = this.set("identityIds", js.Array(value :_*))
    @scala.inline
    def setIdentityIds(value: js.Array[String]): Self = this.set("identityIds", value.asInstanceOf[js.Any])
  }
  
}

