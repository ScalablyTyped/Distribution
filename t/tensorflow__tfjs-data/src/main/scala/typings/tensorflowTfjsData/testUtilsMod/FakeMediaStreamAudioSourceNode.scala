package typings.tensorflowTfjsData.testUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FakeMediaStreamAudioSourceNode extends js.Object {
  def connect(node: js.Object): Unit = js.native
}

object FakeMediaStreamAudioSourceNode {
  @scala.inline
  def apply(connect: js.Object => Unit): FakeMediaStreamAudioSourceNode = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect))
    __obj.asInstanceOf[FakeMediaStreamAudioSourceNode]
  }
  @scala.inline
  implicit class FakeMediaStreamAudioSourceNodeOps[Self <: FakeMediaStreamAudioSourceNode] (val x: Self) extends AnyVal {
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
    def setConnect(value: js.Object => Unit): Self = this.set("connect", js.Any.fromFunction1(value))
  }
  
}

