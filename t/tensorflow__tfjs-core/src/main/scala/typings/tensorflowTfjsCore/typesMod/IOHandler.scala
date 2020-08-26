package typings.tensorflowTfjsCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOHandler extends js.Object {
  var load: js.UndefOr[LoadHandler] = js.native
  var save: js.UndefOr[SaveHandler] = js.native
}

object IOHandler {
  @scala.inline
  def apply(): IOHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOHandler]
  }
  @scala.inline
  implicit class IOHandlerOps[Self <: IOHandler] (val x: Self) extends AnyVal {
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
    def setLoad(value: () => js.Promise[ModelArtifacts]): Self = this.set("load", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setSave(value: /* modelArtifact */ ModelArtifacts => js.Promise[SaveResult]): Self = this.set("save", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
  }
  
}

