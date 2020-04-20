package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDispose extends js.Object {
  def dispose(): js.Any
}

object AnonDispose {
  @scala.inline
  def apply(dispose: () => js.Any): AnonDispose = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[AnonDispose]
  }
}

