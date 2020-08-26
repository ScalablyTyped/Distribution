package typings.uifabricStyling.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@uifabric/styling.@uifabric/styling/lib/interfaces/ISpacing.ISpacing> */
@js.native
trait PartialISpacing extends js.Object {
  var l1: js.UndefOr[String] = js.native
  var l2: js.UndefOr[String] = js.native
  var m: js.UndefOr[String] = js.native
  var s1: js.UndefOr[String] = js.native
  var s2: js.UndefOr[String] = js.native
}

object PartialISpacing {
  @scala.inline
  def apply(): PartialISpacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialISpacing]
  }
  @scala.inline
  implicit class PartialISpacingOps[Self <: PartialISpacing] (val x: Self) extends AnyVal {
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
    def setL1(value: String): Self = this.set("l1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteL1: Self = this.set("l1", js.undefined)
    @scala.inline
    def setL2(value: String): Self = this.set("l2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteL2: Self = this.set("l2", js.undefined)
    @scala.inline
    def setM(value: String): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("m", js.undefined)
    @scala.inline
    def setS1(value: String): Self = this.set("s1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS1: Self = this.set("s1", js.undefined)
    @scala.inline
    def setS2(value: String): Self = this.set("s2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS2: Self = this.set("s2", js.undefined)
  }
  
}

