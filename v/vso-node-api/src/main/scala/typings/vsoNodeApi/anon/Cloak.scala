package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cloak extends js.Object {
  var cloak: scala.Double = js.native
  var map: scala.Double = js.native
}

object Cloak {
  @scala.inline
  def apply(cloak: scala.Double, map: scala.Double): Cloak = {
    val __obj = js.Dynamic.literal(cloak = cloak.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cloak]
  }
  @scala.inline
  implicit class CloakOps[Self <: Cloak] (val x: Self) extends AnyVal {
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
    def setCloak(value: scala.Double): Self = this.set("cloak", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: scala.Double): Self = this.set("map", value.asInstanceOf[js.Any])
  }
  
}

