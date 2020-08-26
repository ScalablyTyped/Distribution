package typings.wixStyleReact.loaderMod

import typings.react.mod.ReactNode
import typings.wixStyleReact.baseComponentsMod.WixComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderProps extends WixComponentProps {
  var color: js.UndefOr[LoaderColor] = js.native
  var shouldLoadAsync: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[LoaderSize] = js.native
  var status: js.UndefOr[LoaderStatus] = js.native
  var statusMessage: js.UndefOr[String] = js.native
  var text: js.UndefOr[ReactNode] = js.native
}

object LoaderProps {
  @scala.inline
  def apply(): LoaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderProps]
  }
  @scala.inline
  implicit class LoaderPropsOps[Self <: LoaderProps] (val x: Self) extends AnyVal {
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
    def setColor(value: LoaderColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setShouldLoadAsync(value: Boolean): Self = this.set("shouldLoadAsync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldLoadAsync: Self = this.set("shouldLoadAsync", js.undefined)
    @scala.inline
    def setSize(value: LoaderSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStatus(value: LoaderStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    @scala.inline
    def setText(value: ReactNode): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

