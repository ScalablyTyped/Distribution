package typings.textBuffer

import typings.textBuffer.textBufferStrings.backward
import typings.textBuffer.textBufferStrings.closest
import typings.textBuffer.textBufferStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackwardClipDirection extends js.Object {
  var clipDirection: backward | forward | closest
}

object AnonBackwardClipDirection {
  @scala.inline
  def apply(clipDirection: backward | forward | closest): AnonBackwardClipDirection = {
    val __obj = js.Dynamic.literal(clipDirection = clipDirection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBackwardClipDirection]
  }
}

