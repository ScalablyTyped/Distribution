package typings.typestubDashIpfs.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectOptions extends js.Object {
  var enc: js.UndefOr[js.Any] = js.undefined
}

object GetObjectOptions {
  @scala.inline
  def apply(enc: js.Any = null): GetObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (enc != null) __obj.updateDynamic("enc")(enc.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectOptions]
  }
}

