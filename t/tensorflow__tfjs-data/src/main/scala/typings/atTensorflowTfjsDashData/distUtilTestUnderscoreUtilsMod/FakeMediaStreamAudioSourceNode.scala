package typings.atTensorflowTfjsDashData.distUtilTestUnderscoreUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakeMediaStreamAudioSourceNode extends js.Object {
  def connect(node: js.Object): Unit
}

object FakeMediaStreamAudioSourceNode {
  @scala.inline
  def apply(connect: js.Object => Unit): FakeMediaStreamAudioSourceNode = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect))
  
    __obj.asInstanceOf[FakeMediaStreamAudioSourceNode]
  }
}

