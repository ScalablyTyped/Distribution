package typings.wavesurferDotJs.wavesurferDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XHRRequestHeader extends js.Object {
  var key: String
  var value: String
}

object XHRRequestHeader {
  @scala.inline
  def apply(key: String, value: String): XHRRequestHeader = {
    val __obj = js.Dynamic.literal(key = key, value = value)
  
    __obj.asInstanceOf[XHRRequestHeader]
  }
}

