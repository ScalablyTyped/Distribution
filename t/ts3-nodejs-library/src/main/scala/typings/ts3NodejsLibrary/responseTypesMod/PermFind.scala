package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermFind extends ResponseEntry {
  var id1: Double = js.native
  var id2: Double = js.native
  var p: Double = js.native
  var t: Double = js.native
}

object PermFind {
  @scala.inline
  def apply(id1: Double, id2: Double, p: Double, t: Double): PermFind = {
    val __obj = js.Dynamic.literal(id1 = id1.asInstanceOf[js.Any], id2 = id2.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermFind]
  }
  @scala.inline
  implicit class PermFindOps[Self <: PermFind] (val x: Self) extends AnyVal {
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
    def setId1(value: Double): Self = this.set("id1", value.asInstanceOf[js.Any])
    @scala.inline
    def setId2(value: Double): Self = this.set("id2", value.asInstanceOf[js.Any])
    @scala.inline
    def setP(value: Double): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def setT(value: Double): Self = this.set("t", value.asInstanceOf[js.Any])
  }
  
}

