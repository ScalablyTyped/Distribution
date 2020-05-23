package typings.textBuffer.anon

import typings.textBuffer.textBufferStrings.backward
import typings.textBuffer.textBufferStrings.closest
import typings.textBuffer.textBufferStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var clipDirection: backward | forward | closest
}

object `0` {
  @scala.inline
  def apply(clipDirection: backward | forward | closest): `0` = {
    val __obj = js.Dynamic.literal(clipDirection = clipDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

