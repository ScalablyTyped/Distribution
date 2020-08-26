package typings.ts3NodejsLibrary.contextMod

import typings.ts3NodejsLibrary.contextMod.SelectType.NONE
import typings.ts3NodejsLibrary.ts3NodejsLibraryNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectNoneContext
  extends BaseContext
     with Context {
  @JSName("selectType")
  var selectType_SelectNoneContext: NONE = js.native
  var selected: `0` = js.native
}

object SelectNoneContext {
  @scala.inline
  def apply(events: js.Array[ActiveEvent], selectType: NONE, selected: `0`): SelectNoneContext = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectNoneContext]
  }
  @scala.inline
  implicit class SelectNoneContextOps[Self <: SelectNoneContext] (val x: Self) extends AnyVal {
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
    def setSelectType(value: NONE): Self = this.set("selectType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: `0`): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
  
}

