package typings.wav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnknownChunk extends js.Object {
  var data: js.Any
  var id: String
}

object UnknownChunk {
  @scala.inline
  def apply(data: js.Any, id: String): UnknownChunk = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnknownChunk]
  }
}

