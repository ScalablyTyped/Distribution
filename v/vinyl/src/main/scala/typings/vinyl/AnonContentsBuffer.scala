package typings.vinyl

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentsBuffer extends js.Object {
  var contents: Buffer
}

object AnonContentsBuffer {
  @scala.inline
  def apply(contents: Buffer): AnonContentsBuffer = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContentsBuffer]
  }
}

