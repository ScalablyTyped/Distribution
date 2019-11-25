package typings.xmlbuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NData extends js.Object {
  var nData: js.UndefOr[String] = js.undefined
  var pubID: js.UndefOr[String] = js.undefined
  var sysID: js.UndefOr[String] = js.undefined
}

object Anon_NData {
  @scala.inline
  def apply(nData: String = null, pubID: String = null, sysID: String = null): Anon_NData = {
    val __obj = js.Dynamic.literal()
    if (nData != null) __obj.updateDynamic("nData")(nData.asInstanceOf[js.Any])
    if (pubID != null) __obj.updateDynamic("pubID")(pubID.asInstanceOf[js.Any])
    if (sysID != null) __obj.updateDynamic("sysID")(sysID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NData]
  }
}

