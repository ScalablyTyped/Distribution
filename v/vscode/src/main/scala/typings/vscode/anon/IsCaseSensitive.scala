package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsCaseSensitive extends js.Object {
  val isCaseSensitive: js.UndefOr[Boolean] = js.native
  val isReadonly: js.UndefOr[Boolean] = js.native
}

object IsCaseSensitive {
  @scala.inline
  def apply(): IsCaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsCaseSensitive]
  }
  @scala.inline
  implicit class IsCaseSensitiveOps[Self <: IsCaseSensitive] (val x: Self) extends AnyVal {
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
    def setIsCaseSensitive(value: Boolean): Self = this.set("isCaseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCaseSensitive: Self = this.set("isCaseSensitive", js.undefined)
    @scala.inline
    def setIsReadonly(value: Boolean): Self = this.set("isReadonly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsReadonly: Self = this.set("isReadonly", js.undefined)
  }
  
}

