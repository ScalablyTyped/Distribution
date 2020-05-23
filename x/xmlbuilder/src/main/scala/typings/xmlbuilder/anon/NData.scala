package typings.xmlbuilder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NData extends js.Object {
  var nData: js.UndefOr[java.lang.String] = js.undefined
  var pubID: js.UndefOr[java.lang.String] = js.undefined
  var sysID: js.UndefOr[java.lang.String] = js.undefined
}

object NData {
  @scala.inline
  def apply(nData: java.lang.String = null, pubID: java.lang.String = null, sysID: java.lang.String = null): NData = {
    val __obj = js.Dynamic.literal()
    if (nData != null) __obj.updateDynamic("nData")(nData.asInstanceOf[js.Any])
    if (pubID != null) __obj.updateDynamic("pubID")(pubID.asInstanceOf[js.Any])
    if (sysID != null) __obj.updateDynamic("sysID")(sysID.asInstanceOf[js.Any])
    __obj.asInstanceOf[NData]
  }
}

