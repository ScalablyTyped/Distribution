package typings.xlsx.mod

import typings.xlsx.xlsxNumbers.`0`
import typings.xlsx.xlsxNumbers.`1`
import typings.xlsx.xlsxNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetProps extends js.Object {
  /** Name of Document Module in associated VBA Project */
  var CodeName: js.UndefOr[String] = js.native
  /** Sheet Visibility (0=Visible 1=Hidden 2=VeryHidden) */
  var Hidden: js.UndefOr[`0` | `1` | `2`] = js.native
  /** Name of Sheet */
  var name: js.UndefOr[String] = js.native
}

object SheetProps {
  @scala.inline
  def apply(): SheetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetProps]
  }
  @scala.inline
  implicit class SheetPropsOps[Self <: SheetProps] (val x: Self) extends AnyVal {
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
    def setCodeName(value: String): Self = this.set("CodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeName: Self = this.set("CodeName", js.undefined)
    @scala.inline
    def setHidden(value: `0` | `1` | `2`): Self = this.set("Hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("Hidden", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

