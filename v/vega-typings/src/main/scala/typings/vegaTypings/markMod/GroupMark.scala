package typings.vegaTypings.markMod

import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.GroupEncodeEntry
import typings.vegaTypings.scopeMod.Scope
import typings.vegaTypings.vegaTypingsStrings.group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMark
  extends BaseMark
     with Scope
     with Encodable[GroupEncodeEntry]
     with Mark {
  @JSName("from")
  var from_GroupMark: js.UndefOr[FromFacet] = js.native
  var `type`: group = js.native
}

object GroupMark {
  @scala.inline
  def apply(`type`: group): GroupMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMark]
  }
  @scala.inline
  implicit class GroupMarkOps[Self <: GroupMark] (val x: Self) extends AnyVal {
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
    def setType(value: group): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: FromFacet): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
  }
  
}

