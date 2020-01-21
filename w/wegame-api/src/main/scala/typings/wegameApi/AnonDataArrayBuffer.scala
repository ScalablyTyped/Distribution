package typings.wegameApi

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataArrayBuffer extends js.Object {
  var data: String | ArrayBuffer
}

object AnonDataArrayBuffer {
  @scala.inline
  def apply(data: String | ArrayBuffer): AnonDataArrayBuffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataArrayBuffer]
  }
}

