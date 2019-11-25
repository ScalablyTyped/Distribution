package typings.swfobject.swfobject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISwfObjectParameter extends js.Object {
  var flashvars: js.UndefOr[String] = js.undefined
}

object ISwfObjectParameter {
  @scala.inline
  def apply(flashvars: String = null): ISwfObjectParameter = {
    val __obj = js.Dynamic.literal()
    if (flashvars != null) __obj.updateDynamic("flashvars")(flashvars.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISwfObjectParameter]
  }
}

