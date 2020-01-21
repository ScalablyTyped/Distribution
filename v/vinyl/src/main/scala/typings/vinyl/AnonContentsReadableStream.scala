package typings.vinyl

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentsReadableStream extends js.Object {
  var contents: ReadableStream
}

object AnonContentsReadableStream {
  @scala.inline
  def apply(contents: ReadableStream): AnonContentsReadableStream = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContentsReadableStream]
  }
}

