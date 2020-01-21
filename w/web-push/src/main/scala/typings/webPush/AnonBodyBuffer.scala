package typings.webPush

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyBuffer extends js.Object {
  var body: Buffer
}

object AnonBodyBuffer {
  @scala.inline
  def apply(body: Buffer): AnonBodyBuffer = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBodyBuffer]
  }
}

