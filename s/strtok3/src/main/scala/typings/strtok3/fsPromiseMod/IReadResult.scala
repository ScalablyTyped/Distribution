package typings.strtok3.fsPromiseMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReadResult extends js.Object {
  var buffer: Buffer
  var bytesRead: Double
}

object IReadResult {
  @scala.inline
  def apply(buffer: Buffer, bytesRead: Double): IReadResult = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IReadResult]
  }
}

