package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exclusion extends js.Object {
  var exclusion: scala.Double = js.native
  var inclusion: scala.Double = js.native
}

object Exclusion {
  @scala.inline
  def apply(exclusion: scala.Double, inclusion: scala.Double): Exclusion = {
    val __obj = js.Dynamic.literal(exclusion = exclusion.asInstanceOf[js.Any], inclusion = inclusion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exclusion]
  }
  @scala.inline
  implicit class ExclusionOps[Self <: Exclusion] (val x: Self) extends AnyVal {
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
    def setExclusion(value: scala.Double): Self = this.set("exclusion", value.asInstanceOf[js.Any])
    @scala.inline
    def setInclusion(value: scala.Double): Self = this.set("inclusion", value.asInstanceOf[js.Any])
  }
  
}

