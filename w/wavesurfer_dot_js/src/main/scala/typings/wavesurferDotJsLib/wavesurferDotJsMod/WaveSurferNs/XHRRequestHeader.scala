package typings
package wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XHRRequestHeader extends js.Object {
  var key: java.lang.String
  var value: java.lang.String
}

object XHRRequestHeader {
  @scala.inline
  def apply(key: java.lang.String, value: java.lang.String): XHRRequestHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[XHRRequestHeader]
  }
}

