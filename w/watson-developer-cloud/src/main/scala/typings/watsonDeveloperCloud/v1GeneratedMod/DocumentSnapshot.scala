package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DocumentSnapshot. */
@js.native
trait DocumentSnapshot extends js.Object {
  /** Snapshot of the conversion. */
  var snapshot: js.UndefOr[js.Object] = js.native
  /** The step in the document conversion process that the snapshot object represents. */
  var step: js.UndefOr[String] = js.native
}

object DocumentSnapshot {
  @scala.inline
  def apply(): DocumentSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSnapshot]
  }
  @scala.inline
  implicit class DocumentSnapshotOps[Self <: DocumentSnapshot] (val x: Self) extends AnyVal {
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
    def setSnapshot(value: js.Object): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshot: Self = this.set("snapshot", js.undefined)
    @scala.inline
    def setStep(value: String): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
  
}

