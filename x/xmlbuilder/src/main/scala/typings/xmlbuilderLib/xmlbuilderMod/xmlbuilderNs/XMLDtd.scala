package typings
package xmlbuilderLib.xmlbuilderMod.xmlbuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLDtd extends js.Object {
  var pubID: js.UndefOr[java.lang.String] = js.undefined
  var sysID: js.UndefOr[java.lang.String] = js.undefined
}

object XMLDtd {
  @scala.inline
  def apply(pubID: java.lang.String = null, sysID: java.lang.String = null): XMLDtd = {
    val __obj = js.Dynamic.literal()
    if (pubID != null) __obj.updateDynamic("pubID")(pubID)
    if (sysID != null) __obj.updateDynamic("sysID")(sysID)
    __obj.asInstanceOf[XMLDtd]
  }
}

